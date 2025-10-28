

let text = "Local Host says: What's your name?"
let defaultText = "User1"

function getUsername(){
let username = window.prompt(text, defaultText)

	while(username===null){
  username = window.prompt(text, defaultText)

	}
setUsername(username)
sessionStorage.setItem("username",username)
return username

}

getUsername()

function setUsername(username) {
	fetch('/chat', {
		method: 'POST',
		headers: { 'Content-Type': 'application/json' },
		body: JSON.stringify({username})
	})
}





