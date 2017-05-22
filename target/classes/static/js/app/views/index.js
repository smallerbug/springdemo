/**
 * Created by Smallbug on 2017-03-02.
 */
$(function() {
	init();
});

/* 页面初始化 */
function init() {
	alert(11);
	$(".js-click-post").click(handlerOfClickPost);
	$(".js-click-put").click(handlerOfClickPut);
	$(".js-click-delete").click(handlerOfClickDelete);
	$(".js-click-get").click(handlerOfClickGet);
}

function handlerOfClickPost() {
	var user = {};
	user.id = 2;
	user.name = "weijf";
	user.pass = "weijf1234";

	$.ajax({
		url : "user/add",
		type : "post",
		data :user,
		dataType : 'json',
		success : function(data) {
			if (data != null) {
				alert(data);
			} else {
				alert("23333");
			}
		}
	});
}

function handlerOfClickPut() {
	var user = {};
	user.id = 42;
	user.name = "weijf";
	user.pass = "weijf1234";

	$.ajax({
		url : "user/10",
		type : "put",
		data :user,
		dataType : 'json',
		success : function(data) {
			if (data != null) {
				alert(data);
			} else {
				alert("23333");
			}
		}
	});
}

function handlerOfClickDelete() {
	$.ajax({
		url : "user/12",
		type : "delete",
		dataType : 'json',
		success : function(data) {
			if (data != null) {
				alert(data);
			} else {
				alert("23333");
			}
		}
	});

}

function handlerOfClickGet() {
	
	$.ajax({
		url : "user/233",
		type : "get",
		dataType : 'json',
		success : function(data) {
			if (data != null) {
				alert(data);
			} else {
				alert("23333");
			}
		}
	});

}