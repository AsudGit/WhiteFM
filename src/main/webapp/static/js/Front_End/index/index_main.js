/**
 * Created by jake on 2018/12/23.
 */
window.onload = function() {
    var i=0;
    var setConfig = {

        song : [
            {

                title : '不再见',
                src : 'static/music/station/song/李荣浩 - 你的背包 (Live).mp3',
                cover : 'static/music/station/cover/cover.png'
            },
            {

                title : '你的背包',
                src : 'static/music/station/陈学冬 - 不再见.mp3',
                cover : 'static/music/station/cover/cover1.jpg'
            },
            {

                title : 'xxx',
                src : 'static/music/station/陈学冬 - 不再见.mp3',
                cover : 'static/music/station/cover/cover1.jpg'
            }
        ],
        error : function(meg){

            /*console.log(meg);*/
        }
    };



    $.ajax({
        url:'/works/offworks',
        type:'GET',
        data:'',
        async:true,
        dataType:'json',
        success:function (data) {
            setConfig.song.length=data.length-1;
            alert(setConfig.song.length);
            for( i=0;i<data.length;i++){
             setConfig.song[i].title=data[i].works_name;
             setConfig.song[i].src=data[i].works_path;
             setConfig.song[i].cover=data[i].works_cover ;
               alert(  setConfig.song[i].title);
             }

        },
        error:function (data) {
            alert('错误');
        }

    });


    var audioFn = audioPlay(setConfig);

    if(audioFn){

        //开始加载音频,true为播放,false不播放
        audioFn.loadFile(1);
    }

}
$(function(){

    //切换内容
    $('.type_context').hide();
    $('.type_context:first').show();
    $('.nav_title ul li').mouseenter(function(){
        var $index=$(this).index();
        $('.type_context').hide();
        $('.type_context').each(function(index){
            if($index==index){
                $(this).show();
            }
        });
    });


    /*滑动事件*/

    var time=700;


    $(document).on('click','.totop',function () {
        slideToTop(time);
    });
    $(document).on('click','.tobottom',function () {
        slidebottom(time);

    });

});
$(function(){

    $('body').bind('mousewheel',function(e,delta){
        var nav=delta>0?'up':'down';
        if(nav=='down'){
            slideToTop();
            $('.slide_top').css({'position':'fixed','top':'0px','width':'100%'});
            $('.main_container').css('top','100px');


        }
        if(nav=='up'){
            slidebottom();
            $('.slide_top').css({'position':'relative','top':'0px'});
            $('.main_container').css('top','0px');
            /*$('.main_container').css('top',$('.slide_top').height());*/
        }


    });



});
function slideToTop(time){

    $('.audio-cover').fadeOut(time);
    $('.slide_top').animate({
        height:'100px'
    },time);
    $('.audio-box').animate({
        left:'10%',
        top:'-60px',
    },time);

    $('.audio-view').animate({
        height:'150px',
    });

    $('.audio-title').css('color','transparent');
    $('.song_context').css('display','block');

    $('.audio-backs').animate({
        'width':'50%',
    },time);
    $('.audio-btn').animate({
        right: '42%',
        top: '35%',
    },time);
    $('.totop').removeClass('glyphicon glyphicon-chevron-up top');
    $('.totop').addClass('glyphicon glyphicon-chevron-down tobottom');
    $('body').scrollTop(0);

}

function slidebottom(time){

    $('.slide_top').animate({
        height:'470px'
    },time);
    $('.audio-box').animate({
        left:'0%',
        top:'10%',
    },time);
    $('.audio-view').animate({
        height:'250px',
    },time);

    $('.audio-title').css('color','#030303');
    $('.song_context').css('display','none');

    $('.audio-backs').animate({
        'width':'75%',
    },time);
    $('.audio-btn').animate({
        right: '40%',
        top: '45%',
    },time);
    $('.audio-cover').fadeIn('slow');
    $('.totop').removeClass('glyphicon glyphicon-chevron-down tobottom');
    $('.totop').addClass('glyphicon glyphicon-chevron-up top');
}


$(function () {

});