package com.coderscampus.Assignment14.web;

import javax.swing.JTextArea;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.coderscampus.Assignment14.domain.User;
import com.coderscampus.Assignment14.service.UserService;

import jakarta.servlet.http.HttpSession;

@Controller
class UserController {
	@Autowired
	UserService userService;

	@GetMapping("/welcome")
	public String welcomePage(ModelMap model) {

		return "Welcome";

	}

	@GetMapping("/chat")
	public String showChatPage(ModelMap model, HttpSession session) {
		String username = (String) session.getAttribute("username");
		model.put("username", username);
		return "chat";
	}

	@PostMapping("/chat")
	public String chatPage(@RequestParam(name = "username", required = false) String username, ModelMap model,
			HttpSession session) {
		System.out.println(username);
		session.setAttribute("username", username);
		model.addAttribute("username", username);
		return "chat";
	}

	@PostMapping("/message")
//	@ResponseBody
	public String messagePost(@RequestParam(name = "message", required = false) String message, HttpSession session)

	{
		String username = (String) session.getAttribute("username");

		System.out.println(message);
		System.out.println("I am here");
		userService.saveMessages(username, message);
		session.setAttribute("content", message);

		return "redirect:/chat";
	}

}
