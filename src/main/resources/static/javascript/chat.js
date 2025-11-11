


document.addEventListener('DOMContentLoaded', transferMessages);



function transferMessages() {
	let textArea = document.getElementById('textArea')

	let button = document.getElementById('submit')
	let inputMessage = document.getElementById('inputBox')

	button.addEventListener('click', function() {
		//		event.preventDefault()
		let username = sessionStorage.getItem("username")
		if (username === null) {
			alert("You don't have a username.Please sign in")
			window.location.href = "/welcome"
		}
		let message = document.getElementById('inputBox').value


		if (message != null) {
			textArea.value += `${username}: ${message}\n`
			inputMessage.value = ''


		}
		else { console.log("This area is blank") }

		fetch('/chat', {
			method: "POST",
			headers: { 'Content-Type': 'application/json' },
			body: JSON.stringify({ username: username, message: message })
		}).then(response => response.text())
			.then(result => console.log(result))









	})

	function loadMessages() {
		fetch('/chat/loadMessages', {
			method: 'GET'
		}).then(response => response.json())
			.then(messages => {
				textArea.value = ''
				messages.forEach(message => textArea.value += message + '\n')
			})


	}

	setInterval(loadMessages, 5000)
}







