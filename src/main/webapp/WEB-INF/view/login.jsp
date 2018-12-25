<%--
  Created by IntelliJ IDEA.
  User: MNILSY
  Date: 2018/12/22
  Time: 17:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>WhiteFM | 登录</title>
    <link rel="stylesheet" href="/static/css/login.css" type="text/css">
    <script rel="script" src="/static/js/jquery.min.js"></script>
    <script rel="script" src="/static/js/login.js"></script>
    <script rel="script" src="/static/js/md5.js"></script>
</head>
<body>
<div id="main_box">
    <div id="login_box">
        <div id="logo">
            <img src="/static/img/logo.jpg">
        </div>
        <div id="control">
            <input id="control_password_buttom" class="control_buttom" type="button" value="密码登录">
            <input id="control_code_buttom" class="control_buttom" type="button" value="验证码登录">
        </div>
        <div id="scroll_login">
            <div id="scroll_login_password">
                <div id="put_password">
                    <div id="u_Id_input">
                        <p></p>
                        <input id="u_Id" type="text" placeholder="输入用户名">
                    </div>
                    <div id="u_Password_input">
                        <p></p>
                        <input id="u_Password" type="password" placeholder="输入密码">
                    </div>
                </div>
                <div class="do_input">
                    <div class="emue_buttom">
                        <input type="button" value="创建账号" onclick="location='register.html'">
                        <input type="button" value="忘记密码">
                    </div>
                    <div id="login_butoom_password">
                        <input id="login_password_input" type="button" value="登录">
                    </div>
                </div>
            </div>
            <div id="scroll_login_code">
                <div id="put_code">
                    <div id="u_Phone_input">
                        <p></p>
                        <input id="u_Phone" type="text" placeholder="输入手机号">
                    </div>
                    <div id="code_input">
                        <p></p>
                        <input id="code" type="text" placeholder="输入验证码">
                        <input id="getcode" type="button" value="获取验证码" style="cursor: pointer">
                    </div>
                </div>
                <div class="do_input">
                    <div class="emue_buttom">
                        <input type="button" value="创建账号" onclick="location='register.html'">
                        <input type="button" value="忘记密码">
                    </div>
                    <div id="login_butoom_code">
                        <input id="login_code_input" type="button" value="登录">
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div id="title_d">
        <p>生活的声音，从<span>WhiteF</span>M开始</p>
    </div>
</div>
</body>
</html>
