/**
 * JARVIS.MVC.TABLE 组件
 * 
 * @author lijunlin
 */
(function($$, NS) {
	var $$_NS = $$.register(NS);
	
	/**
	 * dataTable对象标识符
	 */
	$$_NS.datatableIdentifer;
	/**
	 * datatable checkbox对象标识符
	 */
	$$_NS.checkboxIdentifer;
	/**
	 * datatable checkbox item对象标识符
	 */
	$$_NS.checkboxItemIdentifer;
	
	/**
	 * 表对象
	 */
	$$_NS.dataTableObject;
	$$_NS.dataKey = "data";
	
	/**
	 * 初始化
	 */
	$$.addConstructor(function() {
		//初始化dataTable对象
		$$_NS.datatableIdentifer = $$.MVC.context["objectIdentifer"] + "_table";
		$$_NS.checkboxIdentifer = $$.MVC.context["objectIdentifer"] + "_chk";
		$$_NS.checkboxItemIdentifer = $$.MVC.context["objectIdentifer"] + "_chk_item";
		
		$$.log("datatableIdentifer = " + $$_NS.datatableIdentifer);
		$$.log("checkboxIdentifer = " + $$_NS.checkboxIdentifer);
		$$.log("checkboxItemIdentifer = " + $$_NS.checkboxItemIdentifer);
	});
	
	/**
	 * 使用dataTables插件展示表格数据
	 * @param params 参数(详细查看dataTables配置)
	 */
	$$_NS.dataTable = function(params) {
		//默认配置
		var def_opts = {
			sAjaxSource : $$.MVC.URL.selectJSONPage,
			fnServerData : function(url, data, callback, oSettings) {
				var def_options = {
						contentType : "application/x-www-form-urlencoded; charset=utf-8", 
				        cache : false, 
				        success : function(response) {
				        	if (response[$$.MVC.response["status"]] == false){//服务出现异常
				        		alert(response[$$.MVC.response["message"]]);
				        		$$.unmask();
				        		return ;
				        	}
				        	if (dataKey == null) {
				        		oSettings.sAjaxDataProp = $$.MVC.response["body"];
				        		callback(response); 
				        	} else {
				        		oSettings.sAjaxDataProp = $$_NS.dataKey;
				        		callback(response[$$.MVC.response["body"]]); 
				        	}
				        	$$.unmask();
				        }
				};
				$$.log("url -> " + url);
				$$.MVC.doRequest(url, data, def_options);
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
			bServerSide : true,
			bFilter : false,
			bSort : false,
			aLengthMenu : [25, 50, 100],
			iDisplayLength : 25
		};
		var options = $.extend(true, {}, def_opts, params || {});
		$$_NS.dataTableObject = $('#' + $$_NS.datatableIdentifer).dataTable(options);
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
				"<td class='center'><label>" +
					"<input value='"+data+"' name='"+$$.MVC.CURD.checkboxItemIdentifer +"' type='checkbox' class='ace' />" +
					"<span class='lbl'></span>" +
				"</label></td>";
		return string;
	};
})(GLOBAL_NS, "TABLE");