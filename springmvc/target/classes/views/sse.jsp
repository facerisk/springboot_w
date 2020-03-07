<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>httpMessageConverter Demo</title>
</head>
<body>
<div id="msgFrompPush"></div>
<script type="text/javascript" src="<c:url value="/assets/js/jquery-1.4.2.js" />"></script>
<script type="text/javascript">

    if (!!window.EventSource) {
        var source = new EventSource('push');
        s = '';
        source.addEventListener('message', function (e) {
            s += e.data + "<br/>";//输出浏览器页面
            $("#msgFrompPush").html(s);
        });

        source.addEventListener('open',function (e) {
            console.log("连接打开。");

        },false);

        source.addEventListener('error',function (e) {
            if(e.readyState == EventSource.CLOSED){
                console.log("连接关闭。");
            }else {
                console.log(e.readyState);
            }
        },false);
    }else {
        console.log("你的浏览器不支持sse")
    }

</script>
</body>
</html>

