

document.addEventListener('DOMContentLoaded', transferMessages);




function transferMessages() {
	let textArea = document.getElementById('textArea')

	let button = document.getElementById('submit')
	let inputMessage = document.getElementById('inputBox')

	button.addEventListener('click',function (){
//		event.preventDefault()
		let username = sessionStorage.getItem("username")
		let message = document.getElementById('inputBox').value


		if (message != null) {
			textArea.value += `${username}: ${message}\n`


		}
		else { console.log("This area is blank") }

		fetch('/chat', {
			method: "POST",
			headers: { 'Content-Type': 'application/json' },
			body: JSON.stringify({ username: username, message: message })
		}).then(response => response.text())
			.then(result => console.log(result))
			.then(messages=> {textArea.value =''
				messages.forEach(msg=> textArea.value +=msg+ '/n')
			)
			inputMessage.value = ''
			

		



	})
}
setInterval(transferMessages,5000)



