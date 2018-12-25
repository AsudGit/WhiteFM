/**
 * Created by MNILSY on 2018/12/25.
 */

var socket;
function openSocket() {
    socket = new WebSocket("ws://localhost:8080/ws/messageSocket");
    socket.onopen = function () {

    };
    socket.onmessage = function (e) {
        if ($("#xiangqing_read").css("display")!=="none"){
            if (
                $("#send_button").attr("data-sendid")!==e.m_Sender){
                return;
            }else {

            }
        }
    };
    socket.onerror = function (p1) {
        alert("链接错误")
    };
}


$("#mesok").click(function () {
    var bean = {
        message: $("#mes").val(),
        sendee: "lsy",
        despatcher: "lxs"
    };
    socket.send(JSON.stringify(bean))
});