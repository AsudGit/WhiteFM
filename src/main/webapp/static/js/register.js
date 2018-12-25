/**
 * Created by MNILSY on 2018/12/24.
 */
$(function () {
    $("#login_password_input").bind("click", register);
    $("#getcode").bind("click", getCode);
    $("#put_data input:text,input:password").bind("focus",function () {
        $(this).parents().find("p").html("")
    })
});

function register() {

    var u_Id = $("#u_Id").val();
    var u_Password = $("#u_Password").val();
    var u_Passwords = $("#u_Passwords").val();
    var u_Phone = $("#u_Phone").val();
    var code = $("#code").val();
    if (u_Id.length === 0) {
        $("#u_Id_input").find("p").html("用户名为空");
        return;
    }
    if (u_Password.length === 0) {
        $("#u_Password_input").find("p").html("密码为空");
        return;
    }
    if (u_Password !== u_Passwords) {
        $("#u_Password_input").find("p").html("密码不一致");
        return;
    }
    if (u_Phone.length === 0) {
        $("#u_Phone_input").find("p").html("手机号为空");
        return;
    }
    if (!(/^1(3\d{1}|4[57]|5[012356789]|7[013678]|8\d{1})\d{8}$/).test(u_Phone)){
        $("#u_Phone_input").find("p").html("手机号不对");
        return;
    }
    if (code.length === 0) {
        $("#code_input").find("p").html("验证码空");
        return;
    }
    $.ajax({
        contentType: "application/x-www-form-urlencoded; charset=utf-8",
        type: "POST",
        url: "/register.do",
        data: {
            u_Id: u_Id,
            u_Password: $.md5(u_Password),
            u_Phone: u_Phone,
            code: code
        },
        async: true,
        dataType: "json",
        success: function (data) {
            switch (data) {
                case 200:
                    window.location.href="/@"+u_Id;
                    break;
                case 500:
                    $("#code_input").find("p").html("验证码错误");
                    break;
                case 501:
                    $("#u_Phone_input").find("p").html("手机号不对");
                    break;
                case 502:
                    $("#u_Phone_input").find("p").html("手机号被已注册");
                    break;
                case 503:
                    $("#u_Id_input").find("p").html("用户名被使用");
                    break;
                case 504:
                    $("#u_Id_input").find("p").html("注册失败");
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


function isphonenumber(phone) {

}