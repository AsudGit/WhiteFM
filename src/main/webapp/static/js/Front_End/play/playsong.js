/**
 * Created by jake on 2018/12/25.
 */
$(function(){

    var url="url("+$('.songcover').text()+")";
    $('.audio-cover').hide();

    $('.song_cover').css("background","url(../../../../static/music/station/cover/1.jpg)");
    alert( $('.song_cover').CSS("background"))
});
window.onload = function() {

    var setConfig = {

        song : [
            {

                title : $('.title').text(),
                src :$('.songsrc').text(),
                cover : $('.songcover').text()
            }

        ],

        error : function(meg){

            /*console.log(meg);*/
        }
    };
    var audioFn = audioPlay(setConfig);

    if(audioFn){

        //开始加载音频,true为播放,false不播放
        audioFn.loadFile(1);
    }

}
$(function () {
     var i=0;
    $('.like').click(function () {
        if(i==0){
            $(this).attr('src',$('.redlike').text());

            i=1;
        }else {
            $(this).attr('src',$('.likes').text());
            i=0;
        }


    });
})