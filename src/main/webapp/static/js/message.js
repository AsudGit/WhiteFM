/**
 * Created by MNILSY on 2018/12/24.
 */
$(function () {
    $("#Testbuto").bind("click", getAttention);
    $("#sxF").bind("click", getMessage);
    $("#back").find("input").bind("click", function () {
        $("#xiangqing_read").hide();
        $("#yulan_read").show();
        getMessage();
    });
    $("body").on("click", ".li_cilck", openMessage);
    $("#send_button").bind("click", send);
    $("#exit").bind("click", function () {
        $("body").css("overflow-y", "auto");
        $("#mes").html("")
    });
    getMessage()
});
function getAttention() {
    $.ajax({
        contentType: "application/x-www-form-urlencoded; charset=utf-8",
        type: "POST",
        url: "/getAttention.json",
        async: true,
        dataType: "json",
        success: function (data) {
            //遍历
        }
    })
}


function selectAttention() {
    var key = "@m";
    $.ajax({
        contentType: "application/x-www-form-urlencoded; charset=utf-8",
        type: "POST",
        url: "/selectAttention.json",
        data: {
            key: key
        },
        async: true,
        dataType: "json",
        success: function (data) {
            //遍历
        }
    })
}


function getMessage() {
    $.ajax({
        contentType: "application/x-www-form-urlencoded; charset=utf-8",
        type: "POST",
        url: "/getMessage.json",
        async: true,
        dataType: "json",
        success: function (data) {
            $("#message_context").find("ul").html("");
            if (data.length === 0) {
                $("#message_context").find("ul").html("您还没有收到私信");
            }
            //遍历
            for (let i = 0; i < data.length; i++) {
                if ($("#" + data[i].m_Sender).attr("id") === undefined) {
                    $("#message_context").find("ul").append(
                        "<li data-date='" + data[i].m_Time + "' data-mes='" + data[i].m_Context + "' class='li_cilck' id='" + data[i].m_Sender + "'>" +
                        "<div class='u_Head'>" +
                        "<img src='" + data[i].u_Head + "'/>" +
                        "</div>" +
                        "<div class='text'>" +
                        "<p>" + data[i].u_Nickname + "</p>" +
                        "<p><span>@" + data[i].m_Sender + "</span></p>" +
                        "</div>" +
                        "<div class='isread'>" +
                        "<p>1</p>" +
                        "</div>" +
                        "</li>")
                } else {
                    let j = $("#" + data[i].m_Sender + " .isread p").html();
                    $("#" + data[i].m_Sender).attr("data-mes", $("#" + data[i].m_Sender).attr("data-mes") + "," + data[i].m_Context);
                    $("#" + data[i].m_Sender).attr("data-date", $("#" + data[i].m_Sender).attr("data-date") + "," + data[i].m_Time);
                    $("#message_context").find("ul #" + data[i].m_Sender).html(
                        "<div class='u_Head'>" +
                        "<img src='" + data[i].u_Head + "'/>" +
                        "</div>" +
                        "<div class='text'>" +
                        "<p>" + data[i].u_Nickname + "</p>" +
                        "<p><span>@" + data[i].m_Sender + "</span></p>" +
                        "</div>" +
                        "<div class='isread'>" +
                        "<p>" + (++j) + "</p>" +
                        "</div>")
                }
            }
        }
    })
}

function read(m_Sender, m_Time) {
    $.ajax({
        contentType: "application/x-www-form-urlencoded; charset=utf-8",
        type: "POST",
        url: "/read.do",
        data: {
            m_Sender: m_Sender,
            m_Time: m_Time
        },
        async: true,
        dataType: "json"
    })
}

function openMessage() {
    $("#u_nickname p").html($(this).children(".text").find("p").html());
    $("#message_context_xiangqing ul").html("");
    $("#send_button").attr("data-sendid", $(this).attr("id"));
    const context = $(this).attr("data-mes").split(",");
    const date = $(this).attr("data-date").split(",");
    $("#xiangqing_read").show();
    $("#yulan_read").hide();
    for (let i = 0; i < context.length; i++) {
        read($(this).attr("id"), date[i]);
        $("#message_context_xiangqing").find("ul").append(
            "<li>" +
            "<div class='left'>" +
            "<div class='u_Head_xiangqing'>" +
            "<img src='" + $(this).children(".u_Head").children("img").attr("src") + "'>" +
            "</div>" +
            "<div class='text_xiangqing'>" +
            "<p>" +
            context[i] +
            "</p>" +
            "</div>" +
            "</div>" +
            "</li>")
    }
}

function send() {
    const m_Context = $("#send_text").val();
    const m_Sender = $(this).attr("data-sendid");
    $.ajax({
        contentType: "application/x-www-form-urlencoded; charset=utf-8",
        type: "POST",
        url: "/sendMessage.do",
        data: {
            m_Recipient: m_Sender,
            m_Context: m_Context
        },
        async: true,
        dataType: "json",
        success: function () {

        },
        complete: function () {
            $("#send_text").val("");
            $("#message_context_xiangqing").find("ul").append("<li>" +
                "<div class='right'>" +
                "<div class='text_xiangqing'>" +
                "<p>" + m_Context + "</p>" +
                "</div>" +
                "<div class='u_Head_xiangqing'>" +
                "<img src='/static/img/head.jpg'>" +
                "</div>" +
                "</div>" +
                "</li>");
        }
    })
}