

let text="Local Host says: What's your name?"
let defaultText="User1"
let username= window.prompt(text, defaultText)
//verify that text is used
if(username!=null){
  console.log("confirmed")
  
}else(window.prompt(text, defaultText))


  fetch('/chat', {
	method: 'POST',
	headers:{'Content-Type': 'application/x-www-form-urlencoded'},
	body: `username=${encodeURIComponent(username)}`
  })
 
  
