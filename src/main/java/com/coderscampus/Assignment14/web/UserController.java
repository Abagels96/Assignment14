package com.coderscampus.Assignment14.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
			HttpSession session, String message) {
		System.out.println(username);
	    session.setAttribute("username", username);
		model.addAttribute("username", username);

//		userService.saveMessages(user, message);

		return "chat";
	}

}
