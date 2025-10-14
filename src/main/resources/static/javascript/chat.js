






function transferMessages() {
	let textArea = document.getElementById('textArea')

	let button = document.getElementById('submit')
	let inputMessage = document.getElementById('inputBox')

	button.addEventListener('click', function() {
		let username = sessionStorage.getItem("username")
		let message = document.getElementById('inputBox').value


		if (message != null) {
			textArea.value += `${username}: ${message}\n`

			
		}
		else { console.log("This area is blank") }

		fetch('/message', {
			method: "POST",
			headers: { 'Content-Type':'application/json' },
			body: JSON.stringify({ username: username, message: message })
		}).then(response => response.text())
		.then(result => console.log(result));

		
		inputMessage.value = ''



	})
}



