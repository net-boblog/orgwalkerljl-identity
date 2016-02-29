/**
 * JARVIS.MVC.FORM 组件
 * 
 * @author lijunlin
 */
(function($$, NS) {
	var $$_NS = $$.register(NS);
	
	/**
	 * ajax方式提交表单
	 */
	$$_NS.submit = function(formObj, callback) {
		$(formObj).validate({
	        submitHandler : function(form) {
	        	var opts = {
	    				url : $(form).attr("action"),
	    				type : $(form).attr("method"),
	    				data : $(form).serialize(),
	    				dataType : "json"
	    			};
	    		$$.MVC.doRequest(opts);
	        }    
	    });
		$(formObj).submit();
	};
})(GLOBAL_NS, "FORM");