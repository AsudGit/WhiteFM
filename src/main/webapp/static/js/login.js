/**
 * Created by MNILSY on 2018/12/23.
 */
$(function () {
    $("#login_password_input").bind("click", login_Password);
    $("#u_Id").bind("focus", function () {
        $("#u_Id_input").find("p").html("");
    });
    $("#u_Password").bind("focus", function () {
        $("#u_Password_input").find("p").html("");
    });

    $(".control_buttom").bind("click", scroll_login);
    $("#login_code_input").bind("click", login_Code);
    $("#getcode").bind("click", getCode);


    $("#u_Phone").bind("focus", function () {
        $("#u_Phone_input").find("p").html("");
    });

    $("#code").bind("focus", function () {
        $("#code_input").find("p").html("");
    });
});

function scroll_login() {
    var who = $(this).attr("id");
    var poaic = $("#scroll_login").css("left");
    if (who === "control_password_buttom" && poaic !== "0px") {
        $("#scroll_login").css("left", 0);
        return;
    }
    if (who === "control_code_buttom" && poaic === "0px") {
        $("#scroll_login").css("left", "-23vw");
    }
}

function login_Password() {
    //密码登录
    var u_Id = $("#u_Id").val();
    var u_Password = $("#u_Password").val();

    if (u_Id.length === 0) {

        $("#u_Id_input").find("p").html("用户名空");
        return;
    }
    if (u_Password.length === 0) {
        $("#u_Password_input").find("p").html("密码空");
        return;
    }
    $.ajax({
        contentType: "application/x-www-form-urlencoded; charset=utf-8",
        type: "POST",
        url: "/login_password.do",
        data: {
            u_Id: u_Id,
            u_Password: $.md5(u_Password)
        },
        async: true,
        dataType: "json",
        success: function (data) {
            switch (data) {
                case 200:
                    if (document.referrer === '' || (/^([\s\S]*)(register.html)$/).test(document.referrer)) {
                        window.location.href = '/index.html';
                    } else {
                        self.location = document.referrer;
                    }
                    break;
                case 400:
                    $("#u_Id_input").find("p").html("登录失败");
                    break;
                case 404:
                    $("#u_Id_input").find("p").html("用户不存在");
                    break;
                case 500:
                    $("#u_Password_input").find("p").html("密码错误");
                    break
            }
        }
    })
}

function login_Code() {
    //验证码登录
    var u_Phone = $("#u_Phone").val();
    var code = $("#code").val();
    if (!(/^1(3\d{1}|4[57]|5[012356789]|7[013678]|8\d{1})\d{8}$/).test(u_Phone)) {
        $("#u_Phone_input").find("p").html("手机号不对");
        return;
    }
    if (u_Phone.length === 0) {
        $("#u_Phone_input").find("p").html("手机号空");
        return;
    }
    if (code.length === 0) {
        $("#code_input").find("p").html("验证码空");
        return;
    }
    $.ajax({
        contentType: "application/x-www-form-urlencoded; charset=utf-8",
        type: "POST",
        url: "/login_code.do",
        data: {
            u_Phone: u_Phone,
            code: code
        },
        async: true,
        dataType: "json",
        success: function (data) {
            switch (data) {
                case 200:
                    if (document.referrer === '' || (/^([\s\S]*)(register.html)$/).test(document.referrer)) {
                        window.location.href = '/index.html';
                    } else {
                        self.location = document.referrer;
                    }
                    break;
                case 404:
                    $("#u_Phone_input").find("p").html("手机号未注册");
                    break;
                case 500:
                    $("#code_input").find("p").html("验证码错误");
                    break
            }
        }
    })
}

function getCode() {
    var u_Phone = $("#u_Phone").val();
    $.ajax({
        contentType: "application/x-www-form-urlencoded; charset=utf-8",
        type: "POST",
        url: "/getCode.do",
        data: {
            u_Phone: u_Phone
        },
        async: true,
        dataType: "json",
        success: function (data) {
            switch (data) {
                case 200:
                    $("#getcode").attr("disabled", "disabled");
                    $("#getcode").val("60秒");
                    time_d();
                    break;
                case 500:
                    $("#getcode").val("获取失败");
                    break
            }
        }
    })
}


var didadida;
function time_d() {
    var i = 60;
    didadida = setInterval(function () {
        $("#getcode").val(--i + "秒");
        if (i === 0) {
            clearInterval(didadida);
            $("#getcode").attr("disabled", false);
            $("#getcode").val("获取验证码")
        }
    }, 1000);
}