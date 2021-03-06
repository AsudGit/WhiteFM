<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: jake
  Date: 2018/12/24
  Time: 9:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %> <%--避免原样输出--%>
<html>
<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/Front_End/index/audio.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/Front_End/index/index_main.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/Front_End/index/fivecontext.css">

    <title></title>
    <style>

    </style>
</head>
<body>

<div class="slide_top  container-fluid  " >

    <div class=" logo col-sm-1 col-md-1">
        <img src="" class="img-responsive img-rounded" />logo
    </div>
    <div class="col-sm-1 col-md-2 col-sm-2 login">
        <span class="login_title"><a href="#">登录</a>&nbsp;|&nbsp;<a href="#">注册</a></span>
    </div>
    <div class="song_context">
        <span class="song_name">歌名</span>
        <span class="audio_author">作者</span>
    </div>
    <div class="container container-fluid">
        <div class="audio-box"> <!--整体框-->
            <div class="audio-container">


                <div class="audio-view">
                    <div class="cover_container">
                        <div class="audio-cover img-responsive">


                        </div>
                    </div>

                    <div class="audio-body">
                        <h3 class="audio-title">未知歌曲</h3>
                        <h3 class="audio-title audio_author">作者</h3>

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
                            <div action="prev" class="glyphicon glyphicon-fast-backward"></div>
                            <div action="play" data-on="glyphicon glyphicon-play" data-off="glyphicon glyphicon-pause" class="icon-play"></div>
                            <div action="next" class="glyphicon glyphicon-fast-forward"></div>
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

            </div>

            <i   class="glyphicon glyphicon-chevron-up totop top"></i>



        </div>
        <!--<div class="left col-sm-8 col-md-8">

        </div>
       <div class="right col-sm-4  col-md-4"></div>-->
    </div>

</div>

<div class="container-fluid  main_container" >
    <div class="nav_title">
        <ul>
            <li><a href="#">栏目电台</a></li>
            <li><a href="#">动态声音</a></li>
            <li><a href="#">我的</a></li>
            <li><a href="#">直播</a></li>
            <li><a href="#">搜索</a></li>
        </ul>
    </div>

    <!--栏目电台-->
    <div class=" type_context">
        <ul>
<c:forEach var="anchor"   items="${anchorlist}" >
            <li >

                <div class="personsong">
                    <a href="#">
                        <div class="personimg" style="background-image: url('${pageContext.request.contextPath}${anchor.works_cover}') " >
                        <!--作品封面-->
                    </div></a>

                    <div class="song_info"><a href="/works/playsong/${anchor.anchor_worksId}"><span>${anchor.works_name}</span></a></div>
                    <div class="song_info"><a href="#"><span>${anchor.author}</span></a></div>
                </div>

            </li>
</c:forEach>

        </ul>
    </div>

    <div class="type_context">
        动态声音
    </div>
    <div class="type_context">
        我的
    </div>
    <div class="type_context">
        直播
    </div>
    <div class="type_context">
        搜索
    </div>
</div>




<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/Front_End/index/audio.js"></script>
<script src="${pageContext.request.contextPath}/static/js/jquery-3.2.1.min.js"></script>
<script src="${pageContext.request.contextPath}/static/js/Front_End/index/jquery.mousewheel.min.js"></script>
<script src="${pageContext.request.contextPath}/static/js/bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath}/static/js/Front_End/index/index_main.js"></script>
<script type="text/javascript">

</script>
</body>
</html>
