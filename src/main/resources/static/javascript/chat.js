


	let message=document.getElementById("inputBox").value
    let inputBox= document.getElementById("inputBox")

	fetch('/message', {
	method: 'POST',
	headers: { 'Content-Type': 'application/x-www-form-urlencoded' },
	body: `message=${encodeURIComponent(message)}`
}).then(response =>response.text())
 
 
 
 


function addMessage(message){
	let textArea= document.getElementById("textArea")
 
 let submitButton= document.getElementById("submit")
 console.log(message)
submitButton.addEventListener("click" ,function buttonClick(){
	textArea.value += ` ${message}\n`
	
})}
 
 
	
	
	addMessage(message)






