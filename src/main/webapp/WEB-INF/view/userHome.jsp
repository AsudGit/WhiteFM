<%--
  Created by IntelliJ IDEA.
  User: MNILSY
  Date: 2018/12/23
  Time: 0:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>${usersPojo.u_Nickname} | WhiteFM</title>
    <link rel="stylesheet" href="/static/css/userHomve.css" type="text/css"/>
    <script rel="script" src="/static/js/jquery.min.js"></script>
    <script rel="script" src="/static/js/userHome.js"></script>
    <script rel="script" src="/static/js/socket.js"></script>
</head>
<body>
<div id="mes"></div>
<div id="main_box">
    <div id="header_box">
        <img src="${usersPojo.u_Header}">
    </div>
    <div id="nav_box">
        <div id="head_img">
            <img src="${usersPojo.u_Head}"/>
        </div>
        <div id="nav">
            <div id="user_data">
                <ul>
                    <li>
                        <p>关注</p>
                        <p>5</p>
                    </li>
                    <li>
                        <p>粉丝</p>
                        <p>10</p>
                    </li>
                    <li>
                        <p>声音</p>
                        <p>23</p>
                    </li>
                </ul>
            </div>
            <div id="operating_input"><input type="button" value="编辑资料"></div>
        </div>
    </div>
    <div id="context_box">
        <div id="context_other">
            <div id="user_info">
                <ul>
                    <li>
                        <p style="font-weight: 900;font-size: 1.2vw;font-family: 微软雅黑,serif;color: black">${usersPojo.u_Nickname}</p>
                    </li>
                    <li><p>@${usersPojo.u_Id}</p></li>
                    <li><p>${usersPojo.u_Sex}</p></li>
                    <li><p>${usersPojo.u_Birthday}</p></li>
                </ul>
            </div>
            <div id="re_nav">
                <ul>
                    <li id="message">
                        <img src="/static/img/meg.png">
                        <p>私信</p>
                    </li>
                    <li style="border: none">
                        <img src="/static/img/lis1.png">
                        <p>我的栏目</p>
                    </li>
                </ul>
            </div>
            <div id="statement_box">
                <div id="this_message">
                    <p>
                        © 2018 ssm 期末作业 "最强王者"组
                    </p>
                </div>
            </div>
        </div>
        <div id="context_main"></div>
    </div>
</div>
</body>
</html>
