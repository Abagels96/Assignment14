

let text = "Local Host says: What's your name?"
let defaultText = "User1"

function getUsername(){
let username = window.prompt(text, defaultText)
sessionStorage.setItem("username",username)
	while(username===null){
  username = window.prompt(text, defaultText)

	}
fetchUsername(username)
return username

}

getUsername()

function fetchUsername(username) {
	fetch('/chat', {
		method: 'POST',
		headers: { 'Content-Type': 'application/x-www-form-urlencoded' },
		body: `username=${encodeURIComponent(username)}`
	})
}





