/**
 * JARVIS.MVC组件
 * 
 * @author lijunlin
 */
(function($$, NS) {
	var $$_NS = $$.register(NS);
	
	//基础变量定义
	/**
	 * 应用名称
	 */
	$$_NS.appName = "";
	/**
	 *上下文路径
	 */
	$$_NS.contextPath = "";
	/**
	 * 当前URL
	 */
	$$_NS.currentUrl = "";
	/**
	 * 对象标识符
	 */
	$$_NS.objectIdentifer = "";
	$$_NS.mainContent = "main-content";
	
	/**
	 * 响应对象状态Key
	 */
	$$_NS.RESPONSE_STATUS_KEY = "status";
	/**
	 * 响应对象消息Key
	 */
	$$_NS.RESPONSE_MESSAGE_KEY = "msg";
	/**
	 * 响应对象数据Key
	 */
	$$_NS.RESPONSE_DATA_KEY = "body";
	/**
	 * sso 登录地址
	 */
	$$_NS.ssoLoginAddress;
	
	/**
	 * 启用状态
	 */
	$$_NS.STATUS_ENABLED = "1";
	/**
	 * 停用状态
	 */
	$$_NS.STATUS_DISABLED = "2";
	/**
	 * 删除状态
	 */
	$$_NS.STATUS_DELETED = "3";
	
	/**
	 * 开启遮罩
	 */
	$$_NS.mask = function(info) {
		if ($("#winModal,#loadInfo").length == 0) {
			var msg = (info != null && info.trim() != "") ? info:"系统正在为您处理数据,请稍候...";
			$("body").append("<div id='winModal'></div><div id='loadInfo' style='text-align:center;'>" + msg + "</div>");
		}
	},
	
	/**
	 * 关闭遮罩
	 */
	$$_NS.unmask = function() {
		$("#winModal,#loadInfo").remove();
	},
	
	//动态加载页面
	$$_NS.loadPage = function(url, params, target) {
		$$_NS.mask();
		$.post(url, params, function(html) {
			$("#" + target).html(html);
			$$_NS.unmask();
		});
	};
	
	/**
	 * 重新加载页面(默认加载到主框架)
	 */
	$$_NS.loadPageToMainFrame = function(url, params) {
		$$_NS.loadPageToContainer($$_NS.mainContent, url, params);
	};
	
	/**
	 * 重新加载容器内容
	 */
	$$_NS.loadPageToContainer = function(container, url, params){
		$$_NS.mask();
		jQuery.post(url, params, function(response) {
			try {
				$("#" + container).html(response);
			} catch(e) {
				
			}
			$$_NS.unmask();
		});
	};
	
	$$_NS.post = function(url, data, successCallback) {
		$.ajax({
			type : 'POST',
			url : url + ".json",
			data : data,
			dataType : 'json',
			success : function(response) {
				if (response[$$_NS.RESPONSE_DATA_KEY] == "notLogin") {
					window.location.href = $$_NS.ssoLoginAddress;
				} else {
					alert(response[$$_NS.RESPONSE_MESSAGE_KEY]);
					if (typeof(successCallback) == "function") {
						successCallback(response);
					}
				}
			},
			error : function(jqXHR, textStatus, errorThrown) {
				alert("操作失败");
			}
		});
	};
	
	$$_NS.commonMvcSuccessCallback = function(response, callback) {
		alert($$_NS.RESPONSE_MESSAGE_KEY);
		if (response[$$_NS.RESPONSE_STATUS_KEY]) {
			callback;
		}
	};
	
	$$_NS.ajax = function(type, url, data, dataType, successCallback, errorCallback) {
		$.ajax({
			type: type,
			url: url,
			data: data,
			success: callback,
			dataType: dataType,
			error : errorCallback
		});
	};
	
	/**
	 * ajax请求数据
	 * @param url:请求路径(注意url不要带后缀:比如.json或 .htm)
	 * @param data:请求参数({key:val,key1:val1})
	 * @param isMask:是否开启遮罩(true:开启,false:不开启)
	 * @param callBack:回调函数(参数data:服务器返回的数据JSON格式)
	 */
	$$_NS.reqAjax = function(url, data, isMask, callBack) {
		if(isMask){
			$$_NS.mask();
		}
		$.ajax({url : url+".json", type : "POST", data : data, dataType : "json",
			success : function(response) {
				$$_NS.unmask();
				if (typeof(callBack) == "function") {
					callBack(response);
				} else {
					alert(response[$$_NS.RESPONSE_MESSAGE_KEY]);
				}
			},
			error : function(jqXHR, textStatus, errorThrown) {
				$$_NS.unmask();
				alert("操作失败");
			}
		});
	};
	
	/**
	 * 初始化
	 */
	$$.addConstructor(function() {
		$$_NS.contextPath = $("#contextPath").val();
		$$_NS.currentUrl = $("#currentUrl").val();
		$$_NS.objectIdentifer = $("#objectIdentifer").val();
		$$_NS.appName = $("#appName").val();
		$$_NS.ssoLoginAddress = $("#ssoLoginAddress").val();
	});
})(GLOBAL_VAR, "MVC");