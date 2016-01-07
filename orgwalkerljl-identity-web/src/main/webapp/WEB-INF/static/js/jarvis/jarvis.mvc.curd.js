/**
 * JARVIS.MVC.CURD 组件
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
	 * 表单Form名称
	 */
	$$_NS.editFormName;
	
	/**
	 * 按钮条执行方法
	 */
	$$_NS.addMethod;
	$$_NS.editMethod;
	$$_NS.viewMethod;
	$$_NS.searchMethod;
	$$_NS.enableMethod;
	$$_NS.disableMethod;
	$$_NS.delMethod;
	$$_NS.physicsDelMethod;
	
	/**
	 * 校验需要编辑的记录
	 */
	$$_NS.validateSave;
	
	/**
	 * 初始化
	 */
	$$.addConstructor(function() {
		//初始化dataTable对象
		$$_NS.datatableIdentifer = $$.MVC.objectIdentifer + "_table";
		$$_NS.checkboxIdentifer = $$.MVC.objectIdentifer + "_chk";
		$$_NS.checkboxItemIdentifer = $$.MVC.objectIdentifer + "_chk_item";
		$$_NS.editFormName = "form[name=" + $$.MVC.objectIdentifer + "EditForm]";
		
		$$.log("datatableIdentifer = " + datatableIdentifer);
		$$.log("checkboxIdentifer = " + checkboxIdentifer);
		$$.log("checkboxItemIdentifer = " + checkboxItemIdentifer);
		$$.log("editFormName = " + editFormName);
		
		//绑定按钮条事件
		$$_NS.addMethod = "$$_NS.defaultAddMethod();";
		$$_NS.editMethod = "$$_NS.defaultEditMethod();";
		$$_NS.viewMethod = "$$_NS.defaultViewMethod();";
		$$_NS.searchMethod = "$$_NS.defaultSearchMethod();";
		$$_NS.enableMethod = "$$_NS.defaultEnableMethod();";
		$$_NS.disableMethod = "$$_NS.defaultDisableMethod();";
		$$_NS.delMethod = "$$_NS.defaultDelMethod();";
		$$_NS.physicsDelMethod = "$$_NS.defaultPhysicsDelMethod();";
	});
	
	/**
	 * 全选/反选
	 */
	$$_NS.switchCheckboxCheckedStatus = function() {
		$$.switchCheckboxCheckedStatus($$_NS.checkboxIdentifer, $$_NS.checkboxItemIdentifer);
	};
	
	/**
	 * 首页
	 */
	$$_NS.index = function() {
		$$.MVC.refresh($$.MVC.URL.index);
	};

	/**
	 * 新增
	 */
	$$_NS.add = function() {
		$$.execute($$_NS.addMethod);
	};
	$$_NS.defaultAddMethod = function() {
		$$.MVC.loadPageToMainFrame($$.MVC.URL.add, {});
	};
	
	/**
	 * 修改
	 */
	$$_NS.edit = function(key) {
		$$.execute($$_NS.editMethod);
	};
	$$_NS.defaultEditMethod = function() {
		var idsStr = $$.getCheckedCheckboxValues($$_NS.checkboxItemIdentifer);
		if (idsStr != "") {
			var ids = idsStr.split(",");
			if (ids.length > 1) {
				window.alert("只能操作一条数据");
			} else {
				$$.MVC.loadPageToMainFrame($$.MVC.URL.edit + ids[0], {});
			}
		} else {
			window.alert("请选择要操作的数据");
		}
	};

	/**
	 * 保存
	 */
	$$_NS.save = function() {
		var isValidSaveMethod = $$.isNotEmpty($$_NS.validateSave);
		if (!isValidSaveMethod || (isValidSaveMethod && $$.execute($$_NS.validateSave))) {
			$$.FORM.submit($($$_NS.editFormName), function(response) {
				if (response[$$.MVC.RESPONSE_STATUS_KEY]) {
					window.location.href = $$.MVC.URL.index;
				}
			});
		}
	};
	
	/**
	 * 详细
	 */
	$$_NS.view = function() {
		$$.execute($$_NS.viewMethod);
	};
	$$_NS.defaultViewMethod = function() {
		var idsStr = $$.getCheckedCheckboxValues($$_NS.checkboxItemIdentifer);
		if (idsStr != "") {
			var ids = idsStr.split(",");
			if (ids.length > 1) {
				window.alert("只能操作一条数据");
			} else {
				$$.MVC.loadPageToMainFrame($$.MVC.URL.view + ids[0], {});
			}
		} else {
			window.alert("请选择要操作的数据");
		}
	};
	
	/**
	 * 检索
	 */
	$$_NS.search = function() {
		$$.execute($$_NS.searchMethod);
	};
	$$_NS.defaultSearchMethod = function() {
		$$.TABLE.resetTable($$.TABLE.dataTableObject, true);
	};
	
	/**
	 * 启用
	 */
	$$_NS.enable = function() {
		$$.execute($$_NS.enableMethod);
	};
	$$_NS.defaultEnableMethod = function() {
		$$_NS.modifyStatus($$.MVC.STATUS_ENABLED);
	};
	
	/**
	 * 停用
	 */
	$$_NS.disable = function() {
		alert($$.MVC.status["disabled"]);
		$$.execute($$_NS.disableMethod);
	};
	$$_NS.defaultDisableMethod = function() {
		$$_NS.modifyStatus($$.MVC.status[disabled]);
	};
	
	/**
	 * 删除
	 */
	$$_NS.del = function() {
		$$.execute($$_NS.delMethod);
	};
	$$_NS.defaultDelMethod = function() {
		$$_NS.modifyStatus($$.MVC.STATUS_DELETED);
	};
	
	/**
	 * 更新状态
	 */
	$$_NS.modifyStatus = function(status) {
		var ids = $$.getCheckedCheckboxValues($$_NS.checkboxItemIdentifer);
		if (ids != "") {
			if (confirm("确认要执行此操作吗?")) {
				$$.MVC.doRequest($$.MVC.URL.modifyStatus, {ids : ids, status : status}, true, function(response) {
					alert(response[$$.MVC.RESPONSE_MESSAGE_KEY]);
					if (response[$$.MVC.RESPONSE_STATUS_KEY]) {
						$$_NS.search();
					}
				});
			}
		} else {
			window.alert("请选择要操作的数据");
		}
	};
	
	/**
	 * 物理删除
	 */
	$$_NS.physicsDel = function(keys) {
		$$.execute($$_NS.physicsDelMethod(keys));
	};
	$$_NS.physicsDel = function() {
		$$.execute($$_NS.physicsDel($$.getCheckedCheckboxValues($$_NS.checkboxItemIdentifer)));
	};
	$$_NS.defaultPhysicsDelMethod = function(ids) {
		if (ids != "") {
			if (confirm("确认要执行此操作吗?")) {
				$$.MVC.doRequest($$.MVC.URL.del, {ids : ids, status : status}, true, function(response) {
					alert(response[$$.MVC.RESPONSE_MESSAGE_KEY]);
					if (response[$$.MVC.RESPONSE_STATUS_KEY]) {
						$$_NS.search();
					}
				});
			}
		} else {
			window.alert("请选择要操作的数据");
		}
	};
})(GLOBAL_NS, "MVC.CURD");