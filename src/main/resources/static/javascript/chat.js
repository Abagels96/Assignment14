




function fetchMessage(inputMessage) {
	// promise to get message sent back and forth between front and backend 
	fetch('/message', {
		method: "POST",
		headers: { 'Content-Type': 'application/x-www-form-urlencoded' },
		body: `message=${encodeURIComponent(inputMessage)}`
	}).then(result => result.text())
	
}



	let textArea = document.getElementById('textArea')

	let button = document.getElementById('submit')
let inputMessage = document.getElementById('inputBox')

	button.addEventListener('click', function() {
		let username= sessionStorage.getItem("username")
		let message= document.getElementById('inputBox').value


		if (message != null) {
			textArea.value += `${username}: ${message}\n`
			
			fetchMessage(message)
			 inputMessage.value = ''
		}
		else {console.log("This area is blank")}

	})
