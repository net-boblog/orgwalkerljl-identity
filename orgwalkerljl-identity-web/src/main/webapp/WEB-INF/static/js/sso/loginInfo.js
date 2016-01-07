/**
 * loginInfo.js
 * 
 * @author lijunlin
 */
(function($$, NS) {
	
	var $$_NS = $$.register(NS);
	
	/**
	 * 初始化dataTable
	 */
	$$.addConstructor(function() {
		$$.TABLE.dataTable($$.MVC.CURD.datatableIdentifer, {
			fnServerParams : function(aoData) { 
				
			}, 
			sAjaxSource : $$.MVC.URL.selectJSONPage,
			aoColumns: [
			    {"mData" : "id", mRender : function(data, type, row) {return $$.TABLE.getIdColumn(data);}},
                {"mData" : "id"},
                {"mData" : "userId"},
                {"mData" : "userName"},
                {"mData" : "loginIp"},
                {"mData" : "loginAgentName"},
                {"mData" : "loginTime"},
                {"mData" : "logoutTime"}
			]
		}, $$.TABLE.dataKey);
	});
})(GLOBAL_NS, "sso.loginInfo");