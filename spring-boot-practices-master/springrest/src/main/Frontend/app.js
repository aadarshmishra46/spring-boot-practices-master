const api = "http://localhost:9090/course"
fetch(api)
.then(data => {
    return data.json();
})
.then(response => {
    const ele = document.createElement("h1");
    ele.innerHTML = response;
   document.body.appendChild(ele);
   
})