<%--
  Created by IntelliJ IDEA.
  User: MNILSY
  Date: 2018/12/24
  Time: 15:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="/static/css/message.css" type="text/css">
    <script rel="script" src="/static/js/message.js"></script>
</head>
<body>
<div id="message_box">
    <div class="message_main" id="yulan_read">
        <div id="nav_box_yulan">
            <div id="message_title">
                <p>私信会话</p>
            </div>
            <div id="message_button">
                <input type="button">
                <input type="button">
                <input type="button">
                <input type="button">
            </div>
        </div>
        <div id="message_context">
            <ul>
                你没有更多私信
            </ul>
        </div>
    </div>


    <div class="message_main" id="xiangqing_read">
        <div id="nav_box_xiangqing">
            <div id="back">
                <input type="button" value="<">
            </div>
            <div id="u_nickname">
                <p>lusenjia</p>
            </div>
        </div>
        <div id="message_context_xiangqing">
            <ul>
            </ul>
        </div>
        <div id="send_box">
            <div id="send_main">
                <input type="text" id="send_text">
                <input type="button" value="发送" id="send_button">
            </div>
        </div>
    </div>
</div>
</body>
</html>
