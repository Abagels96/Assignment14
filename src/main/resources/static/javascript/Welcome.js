let text = 'Local Host says: Whats your name?'
let defaultText = ''

function getUsername() {
	let username = window.prompt(text, defaultText)

	while (!username || username.trim() == '') {
		username = window.prompt(text, defaultText)

	}
	setUsername(username)
	sessionStorage.setItem('username', username)
	return username

}

getUsername()

function setUsername(username) {
	fetch('/chat', {
		method: 'POST',
		headers: { 'Content-Type': 'application/json' },
		body: JSON.stringify({ username })
	})
}










