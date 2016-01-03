/**
 * JARVIS组件核心
 * 
 * @author lijunlin
 */
var JARVIS_NS = window.JS_NS || "JARVIS";//JS命名空间,支持使用JS_NS重定义
/**
 * 注册命名空间
 */
var registerNS = function() {
	var ns = "";
	for (var i in arguments) {
		var arr = arguments[i].split(".");
		for(var i in arr) {
			if(ns != "") {
				ns += ".";
			}
			ns += arr[i];
			eval("if(typeof(" + ns + ")=='undefined'){" + ns + " = new Object();}");
		}
	}
	return ns != "" ? eval(ns) : null;
};
var GLOBAL_VAR = registerNS(JARVIS_NS);

(function($$) {
	//JS内置函数扩展
	/**
	 * 删除字符串左右空格
	 */
	String.prototype.trim = function() {
		return this.replace(/^\s+|\s+$/g,"");
	};
	
	/**
	 * 删除字符串做左边的空格
	 */
	String.prototype.ltrim = function() {
		return this.replace(/^\s+/g,"");
	};
	
	/**
	 * 删除字符串做右边的空格
	 */
	String.prototype.rtrim = function() {
		return this.replace(/\s+$/g,"");
	};
	
	/**
	 * 判断字符串是否以自定字符串结束
	 */
	String.prototype.endWith = function(s) {
		if (s == null || s == ""|| this.length==0 || s.length > this.length) {
			return false;
		} if (this.substring(this.length - s.length) == s) {
			return true;
		} else {
			return false;
		} 
		return true;
	};
	
	/**
	 * 判断字符串是否以自定字符串开始
	 */
	String.prototype.startWith = function(s) {
		if (s == null || s == "" || this.length == 0 || s.length > this.length){
			return false;
		} if (this.substr(0, s.length) == s) {
			return true;
		} else {
			return false;
		}
		return true;
	};
	
	/**
	 * 替换
	 */
	String.prototype.replaceAll = function(b, a) {
		return this.replace(new RegExp(b,"gm"),a)
	};

	/**
	 * 全局命名空间注册方法
	 */
	$$.register = function(path) {
		return registerNS(JARVIS_NS, path);
	};
	
	/**
	 * 获取当前时间毫秒数
	 */
	$$.getTime = function() {
		return (new Date()).getTime();
	};
	
	/**
	 * 判断字符串为NULL或者为空
	 */
	$$.isEmpty = function(str) {
		return str == null || str == "undefined" || (typeof(str) == "string" && str.trim() == "");
	};
	
	/**
	 * 判断字符串不为NULL和空
	 */
	$$.isNotEmpty = function(str) {
		return !$$.isEmpty(str);
	};
	
	/**
	 * 输出日志信息
	 */
	$$.log = function(info) {
		try {
			if (info && info.stack) {
				console.log(info.stack);
			} else {
				console.log(info);
			}
		} catch(e) {
			//ignore
		}
	};
	
	/**
	 * 函数执行
	 */
	$$.execute = function(func) {
		try {
			if (typeof(func) == "function") {
				eval("func();");
			} else {
				eval(func);
			}
		} catch(e) {
			$$.log(e);
		}
	};
	//构造方法列表
	var constructors = new Array();
	
	/**
	 * 新增构造方法
	 */
	$$.addConstructor = function() {
		for (var i in arguments) {
			constructors.push(arguments[i]);
		}
	};
	
	/**
	 * 初始化(执行所有构造方法)
	 */
	$$.init=function() {
		for (var i in constructors) {
			$$.execute(function(){constructors[i]()})
		}
	};
	
	/**
	 * 刷新页面
	 */
	$$.refresh = function(url) {
		window.location.replace(url);
	};
	
	/**
	 * ajax
	 */
	$$.ajax = function(type, url, data, dataType, successCallback, errorCallback) {
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
	 * 全选反选
	 */
	$$.checkAll = function(chk, key) {
		if ($(chk).attr("checked") == "checked") {
			$("input[name="+key+"]").attr("checked", "checked");
		} else {
			$("input[name="+key+"]").removeAttr("checked");
		}
	};
	
	/**
	 * 获取所有选中checkbox的值
	 */
	$$.getCheckedValues = function(chk) {
		var selects = $("input[name="+chk+"]:checked");
		var len = selects.length;
		if (selects == null || len == 0) {
			return "";
		}
		var ids = "";
		if (len > 0) {
			ids += $(selects[0]).val();
		}
		for (var i = 1; i < len; i++) {
			ids += "," + $(selects[i]).val();
		}
		return ids;
	};
	
	/**
	 * 获取指定Input对象选中的值
	 */
	$$.getInputCheckedValues = function(inputs) {
		if (inputs == null || inputs.length == 0) {
			return "";
		}
		var len = inputs.length;
		var checkedValues = "";
		if (len > 0) {
			checkedValues += $(inputs[0]).val();
		}
		for (var i = 1; i < len; i++) {
			checkedValues += "," + $(inputs[i]).val();
		}
		return checkedValues;
	};
	
	/**
	 * 初始化页面
	 */
	$$.initPage = function() {
		try {
			//初始化执行通过span定义的函数;
			$("SPAN.script").each(function(i,obj) {
				eval($(obj).attr("page-load"));
				if ($(obj).attr("firstInit") != "false") {
					$(obj).remove();
				}
			});
		} catch(e) {
			window.alert("页面初始化失败,详细:" + e);
		}
	};
})(GLOBAL_VAR);

/**
 * 初始化入口
 */
$(document).ready(function() {
	/**log*/
	GLOBAL_VAR.log("local plugin is initing");
	
	GLOBAL_VAR.init();
	
	/**log*/
	GLOBAL_VAR.log("local plugin has inited");
	GLOBAL_VAR.log("GLOBAL_VAR.MVC.contextPath->" + GLOBAL_VAR.MVC.contextPath);
	GLOBAL_VAR.log("GLOBAL_VAR.MVC.objectIdentifer->" + GLOBAL_VAR.MVC.objectIdentifer);
	GLOBAL_VAR.log("GLOBAL_VAR.MVC.currentUrl->" + GLOBAL_VAR.MVC.currentUrl);
	//GLOBAL_VAR.initPage();
});