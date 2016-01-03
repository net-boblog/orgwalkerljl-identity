/**
 * config.js
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
                {"mData" : "name"},
                {"mData" : "key"},
                {"mData" : "value"},
                {"mData" : "modifiedTime"},
                {"mData" : "modifier"}
			]
		}, $$.TABLE.dataKey);
	});
})(GLOBAL_VAR, "sys.config");