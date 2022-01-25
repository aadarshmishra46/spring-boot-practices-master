const api = "http://localhost:8092/hello"
fetch(api)
.then(data => {
    return data.json();
})
.then(response => {
    const ele = document.createElement("h1");
    ele.innerHTML = response;
   document.getElementById("helloworld").appendChild(ele);
   
})