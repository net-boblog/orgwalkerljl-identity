/**
 * JARVIS.TABLE 组件
 * 
 * @author lijunlin
 */
(function($$, NS) {
	var $$_NS = $$.register(NS);
	
	$$_NS.dataTableObject;
	$$_NS.dataKey = "data";
	$$_NS.sPaginationType = "bootstrap";
	$$_NS.sDom = '<"row-fluid"<"span6"l><"span6"f>r>t<"row-fluid"<"span6"i><"span6"p>>';
	
	/**
	 * 使用dataTables插件展示表格数据
	 * @param domId DOM节点ID
	 * @param params 参数(详细查看dataTables配置)
	 * @param datakey 要显示数据的key
	 */
	$$_NS.dataTable = function(domId, params, dataKey) {
		//默认配置
		var def_opts = {
			fnServerData : function(sSource, aoData, fnCallback, oSettings) {
				$$_NS.fnServerData(sSource, aoData, fnCallback, oSettings, dataKey);
			},
			oLanguage : {
				"sLengthMenu" : "每页显示 _MENU_ 条记录",
				"sLengthMenu" : "每页显示 _MENU_ 条记录",
				"sZeroRecords" : "抱歉， 没有找到要查询的数据！",
				"sInfo" : "从 _START_ 到 _END_ /共 _TOTAL_ 条数据",
				"sInfoEmpty" : "没有数据",
				"sInfoFiltered" : "(从 _MAX_ 条数据中检索)",
				"oPaginate" : {"sSearch": "搜索:"}
			},
			bProcessing : false,
			bServerSide :true,
			bFilter : false,
			bSort : false,
			aLengthMenu : [25, 50, 100],
			iDisplayLength : 25
		};
		var options = $.extend(true, {}, def_opts, params || {});
		var table = $('#' + domId).dataTable(options);
		$$_NS.dataTableObject = table;
		return table;
	};

	/**
	 * @param url:请求url
	 * @param data:发送到服务器的数据
	 * @param fnCallback 请求完成之后回调此函数将返回的数据绘制到页面上
	 * @param oSettings dataTable设置对象
	 * @param dataKey 返回数据Key
	 */
	$$_NS.fnServerData = function(url, data, fnCallback, oSettings, dataKey) {
		$$.MVC.mask();
		$.ajax({ 
	        dataType : 'json', 
	        contentType : "application/x-www-form-urlencoded; charset=utf-8", 
	        type : 'POST', 
	        cache : false, 
	        url : url+".json", 
	        data : data, 
	        success : function(response) {
	        	try {
	        		if (response[$$.MVC.RESPONSE_STATUS_KEY] == false){//服务出现异常
		        		alert(response[$$.MVC.RESPONSE_MESSAGE_KEY]);
		        		$$.MVC.unmask();
		        		return ;
		        	}
		        	if (dataKey == null) {
		        		oSettings.sAjaxDataProp = $$.MVC.RESPONSE_DATA_KEY;
		        		fnCallback(response); 
		        	} else {
		        		oSettings.sAjaxDataProp = dataKey;
		        		fnCallback(response[$$.MVC.RESPONSE_DATA_KEY]); 
		        	}
		        	$$.MVC.unmask();
	        	} catch (e) {
	        		window.alert('请求数据异常');
	        		$$.MVC.unmask();
	        	}
	        },
	        error : function(jqXHR, textStatus, errorThrown) {
	        	$$.MVC.unmask();
				alert(jqXHR.responseText+"数据加载失败!");
			}
	    }); 
	};

	//重新绘制表格
	$$_NS.resetTable = function(oTable, flag) {
		if (flag) {
			var oSettings = oTable.fnSettings();
			oSettings._iDisplayStart = 0;
		}
	    oTable.fnClearTable(0);
	    oTable.fnDraw();
	};
	
	$$_NS.getIdColumn = function(data) {
		var string = 
				"<td class=\"center\" style=\"width:5%;\"><label>" +
					"<input value='"+data+"' name='"+$$.MVC.CURD.checkboxItemIdentifer +"' type='checkbox'/ class=\"ace\">" +
					"<span class='lbl'></span>" +
				"</label></td>";
		return string;
	};
})(GLOBAL_VAR, "TABLE");