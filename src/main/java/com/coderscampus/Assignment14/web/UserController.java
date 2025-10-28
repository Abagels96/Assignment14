package com.coderscampus.Assignment14.web;

import java.util.List;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.coderscampus.Assignment14.service.UserService;
import com.coderscampus.Assignment14.service.MessageService;

import jakarta.servlet.http.HttpSession;

@Controller
 public class UserController {
	@Autowired
	UserService userService;
	@Autowired
	MessageService messageService;

	@GetMapping("/welcome")
	public String welcomePage(ModelMap model) {

		return "Welcome";

	}

	@GetMapping("/chat")
	public String showChatPage(ModelMap model, HttpSession session ) {
		String username= (String) session.getAttribute("username");
		List<String> listOfMessages= userService.loadMessages();
	
		model.put("username", username);
		model.put("messages", listOfMessages);
		return "chat" ;
	}
@ResponseBody
	@PostMapping("/chat")
	public String chatPage(@RequestBody Map<String,String> payload, ModelMap model,
			HttpSession session) {
		String message= payload.get("message");
		String username= payload.get("username");
System.out.println("here is the payload"+ message + username);  
		System.out.println(message);
		System.out.println(username);
		System.out.println("I am here");
		messageService.saveMessages(message);
		userService.saveAllMessages(username);
		session.setAttribute("username", username);
		session.setAttribute("content", message);
		
		
		
		return "OK";
	}

		
	
		


	
	

}
