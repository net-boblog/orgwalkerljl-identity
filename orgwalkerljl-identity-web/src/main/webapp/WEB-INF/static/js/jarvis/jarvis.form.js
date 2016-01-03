/**
 * JARVIS.FORM 组件
 * 
 * @author lijunlin
 */
(function($$, NS) {
	var $$_NS = $$.register(NS);
	
	/**
	 * ajax方式提交
	 */
	$$_NS.postAjax = function(formObj, callback) {
		$(formObj).validate( {
	        submitHandler : function(form) {
	        	$$_NS.postAjaxForm($(formObj), callback);  
	        }    
	    });
		$(formObj).submit();
	};
	
	/**
	 * ajax提交表单
	 */
	$$_NS.postAjaxForm = function(form, callback) {
		$$.MVC.mask();
		var href = $(form).attr("action");
		$.ajax({
			url : href + ".json",
			type : $(form).attr("method"),
			data : $(form).serialize(),
			dataType : "json",
			success : function(response) {
				$$.MVC.unmask();
				alert(response[$$.MVC.RESPONSE_MESSAGE_KEY]);
				if (typeof(callback) == "function") {
					callback(response);
				}
			},
			error : function(jqXHR, textStatus, errorThrown) {
				$$.MVC.unmask();
				alert("操作失败");
			}
		});
	};
})(GLOBAL_VAR, "FORM");