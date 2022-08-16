var baseUrl = "http://localhost:8080/1/"
var placeHolder = "The shortened URL is ";

function handleButton(){
    var url = document.getElementById("originalUrl").value;
    var result = document.getElementById("shortenedURL");
    console.log(url);
    var xhr = new XMLHttpRequest();
    xhr.open("POST", "/v1/shorten", true);
    xhr.send(url);
    xhr.onload = function() {
      console.log(this.responseText);
      var shortenedURL = baseUrl + this.responseText;
      result.innerHTML = placeHolder + "<a href=" + shortenedURL +">" + shortenedURL + "</a>";
    }
}