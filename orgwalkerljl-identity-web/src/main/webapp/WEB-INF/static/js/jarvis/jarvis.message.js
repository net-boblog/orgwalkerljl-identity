/**
 * jarvis.message
 * 
 * @author lijunlin
 * @param $$
 * @param NS
 */
(function($$, NS) {
	var $$_NS = $$.register(NS);
	
	$$_NS.messages = {
			mask : "系统正在为您处理数据,请稍候...",
			requestSuccess : "操作成功",
			requestError : "操作失败",
			confirm : "确认要如此操作吗",
			choice : "请选择要操作的数据"
	};
	
})(GLOBAL_NS, "MESSAGE");