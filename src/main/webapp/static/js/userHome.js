/**
 * Created by MNILSY on 2018/12/25.
 */
$(function () {
    $("#message").bind("click",function () {
        $("#mes").load("/static/html/message.html");
        $("body").css("overflow-y","hidden");
        openSocket();
    })
});