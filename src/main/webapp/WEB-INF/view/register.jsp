<%--
  Created by IntelliJ IDEA.
  User: MNILSY
  Date: 2018/12/24
  Time: 1:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>WhiteFM | 注册</title>
    <link rel="stylesheet" href="/static/css/register.css" type="text/css">
    <script rel="script" src="/static/js/jquery.min.js"></script>
    <script rel="script" src="/static/js/register.js"></script>
    <script rel="script" src="/static/js/md5.js"></script>
</head>
<body>
<div id="main_box">
    <div id="register_box">
        <div id="register_meg_box">
            <div id="title_p">
                <p>创建您的WhiteFM账号</p>
            </div>
            <div id="put_data">
                <div id="u_Id_input">
                    <p></p>
                    <input id="u_Id" type="text" placeholder="输入用户名">
                </div>
                <div id="u_Password_input">
                    <p></p>
                    <input id="u_Password" type="password" placeholder="输入密码">
                    <input id="u_Passwords" type="password" placeholder="确认密码">
                </div>
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
                    <input type="button" value="登录现有账号" onclick="location='/login.html'">
                </div>
                <div id="register_butoom">
                    <input id="login_password_input" type="button" value="创建账号">
                </div>
            </div>

        </div>
        <div id="logo_box">
            <div id="logo">
                <img src="/static/img/logo.jpg">
            </div>
        </div>
    </div>
    <div id="title_d">
        <p>生活的声音，从<span>WhiteF</span>M开始</p>
    </div>
</div>
</body>
</html>
