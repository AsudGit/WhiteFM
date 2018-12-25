<%--
  Created by IntelliJ IDEA.
  User: jake
  Date: 2018/12/25
  Time: 12:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title></title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/Front_End/play/musicplayer.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/Front_End/play/playsong.css">
    <style>

    </style>
</head>
<body>
<div class="container all">
    <img class="bg_color" src="${pageContext.request.contextPath}${anchorWorks.works_cover}"/>
    <div class="container-fluid muisc_context">
        <div class="left col-md-7">
            <div class="left_context">
                <p>内容介绍</p>
                <hr />
                <p>&nbsp;&nbsp;点亮心中一个闪烁灯光

                    照亮星辰银河

                    点燃心中一个热情火焰

                    温暖冰雪寒冬

                    打开心中一个快乐窗口

                    微笑拥抱彩虹

                    展开心中一个期待愿望

                    自由翱翔天空

                    让我们迎着五彩的风

                    去穿越激情感动

                    让我们唱起祝愿的歌

                    告诉世界美丽的梦 </p>
            </div>
        </div>
        <div class="right col-md-5">
            <div class="right_main">
                <div class="song_cover">
                    <img class="songImage" src="${pageContext.request.contextPath}${anchorWorks.works_cover}"/>
                </div>
                <div class="right_context">
                    <p><span>作品名:</span><a href="#"><span>${anchorWorks.works_name}</span></a></p>
                    <p><span>主播:</span><a href="#"><span>${anchor.anchor_name}</span></a></p>
                    <p class="simple_info">&nbsp;&nbsp;<span>简介:</span><span>n撒打算买的卡萨达姆卡门口卖点卡茅塞顿开马上看对面卡什么声卡的马卡</span></p>
                </div>

            </div>
        </div>
        <div class="bottom col-md-12 music_player">
            <div class="audio-box"> <!--整体框-->
                <div class="audio-container">

                    <div class="audio-view">
                        <div class="audio-cover"></div>
                        <div class="audio-body">
                            <h3 class="audio-title">未知歌曲</h3>
                            <div class="audio-backs">
                                <div class="audio-this-time">00:00</div>
                                <div class="audio-count-time">00:00</div>
                                <div class="audio-setbacks">
                                    <i class="audio-this-setbacks">
                                        <span class="audio-backs-btn"></span>
                                    </i>
                                    <span class="audio-cache-setbacks">
							</span>
                                </div>
                            </div>
                        </div>
                        <div class="audio-btn">
                            <div class="audio-select">
                                <div action="prev" class="glyphicon glyphicon-step-backward"></div>
                                <div action="play" data-on="glyphicon glyphicon-play" data-off="glyphicon glyphicon-pause" class="icon-play"></div>
                                <div action="next" class="glyphicon glyphicon-step-forward"></div>
                                <!--<div action="menu" class="icon-list-alt"></div>-->
                                <div action="volume" class="glyphicon glyphicon-volume-up">
                                    <div class="audio-set-volume">
                                        <div class="volume-box">
                                            <i><span  class="audio-backs-btn"></span></i>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>

                    <div class="opera">
                        <img  class="like" src="${pageContext.request.contextPath}/static/images/Front_End/like.png"/>
                        <img class="cir" src="${pageContext.request.contextPath}/static/images/Front_End/cir.png"/>

                    </div>
                </div>
            </div>
        </div>
    </div>

</div>

<p class="title" style="display: none">${anchorWorks.works_name}</p>
<p class="songsrc" style="display: none">${anchorWorks.works_path}</p>
<p class="songcover" style="display: none">${anchorWorks.works_cover}</p>
<p class="redlike" style="display: none">${pageContext.request.contextPath}/static/images/Front_End/redlike.png</p>
<p class="likes" style="display: none">${pageContext.request.contextPath}/static/images/Front_End/like.png</p>
<script src="../../static/js/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/Front_End/play/musicplayer.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/Front_End/play/playsong.js"></script>

<script>

</script>
</body>
</html>

