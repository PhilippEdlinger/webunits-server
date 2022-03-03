const Http = new XMLHttpRequest();
const url='http://localhost:8080/api/student/all';
Http.open("GET", url);
Http.send();

Http.onreadystatechange = (e) => {
    console.log(Http.responseText)
}