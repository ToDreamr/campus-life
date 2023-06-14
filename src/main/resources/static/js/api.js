function getAlert(){
    window.alert("hello world");
}
//自己封装的ajax的get和post
function get(url, success){
    $.ajax({
        type: "get",
        url: url,
        async: true,
        dataType: 'json',
        xhrFields: {
            withCredentials: true
        },
        success: function (data){
            console.log(data);
        }
    });
}
function askVerify(){
    get("/api/verify",function (data){
        console.log(data.result)
    })
    window.alert("hello verify")
}

function ajax(){
    console.log("a");
}

function login(){
    $.post("/api/register",{
    })
}


function post(url, data, success){
    $.ajax({
        type: "post",
        url: url,
        async: true,
        data: data,
        dataType: 'json',
        xhrFields: {
            withCredentials: true
        },
        success: success
    });
}