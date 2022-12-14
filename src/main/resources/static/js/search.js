$(document).ready(function(){

    /* 지역 버튼 */
    $("#select-region").on('click', function(){
        $("#search").show();
        $("#job-list").hide();
        $("#region-list").show();
    });

    /* 직무 버튼 */
    $("#select-job").on('click', function(){
        $("#search").show();
        $("#region-list").hide();
        $("#job-list").show();
    });

    /* nav 클릭이벤트 */
    $(".d-li").click(function(){
        $(".d-li").removeClass("active");
        $(this).toggleClass("active");
    });


    /* 직무 가져오기 */
    $(".j-list-button").on('click', function(){
        /* active */
        $(".j-list-button").removeClass("active");
        $(this).toggleClass("active");

        var super_seq = document.querySelector('.active #super-job-seq').innerText;
            $.ajax({
                url : "/get_job_detail",
                type : "get",
                dataType : "json",
                data : {"super_seq":super_seq},
                success : result_search_job,
                error : function(e){alert(e);}
            });
    });

    function result_search_job(data){
        var html = "";
        for (i=0; i<data.length; i++){
            html += "<button class='detail_button' type='button' id='"+data[i].job_seq+"' onclick='add_list(this)'>";
            html += data[i].job
            html += "</button>";
        }
        $("#j_detail_list").html(html);
    };

    $(".button_detail").click(function(){
        $(this).toggleClass("active");
    });


})
