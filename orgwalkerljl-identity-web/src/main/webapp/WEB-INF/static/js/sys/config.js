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
		$$.TABLE.dataTable({
			fnServerParams : function(aoData) { 
				
			}, 
			aoColumns: [
			    {"mData" : "id", mRender : function(data, type, row) {return $$.TABLE.getIdColumn(data);}},
                {"mData" : "id"},
                {"mData" : "name"},
                {"mData" : "key"},
                {"mData" : "statusName"},
                {"mData" : "modifiedTime"},
                {"mData" : "modifier"}
			]
		});
	});
})(GLOBAL_NS, "sys.config");