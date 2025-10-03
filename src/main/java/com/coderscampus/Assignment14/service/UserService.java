package com.coderscampus.Assignment14.service;


import org.springframework.stereotype.Service;

import com.coderscampus.Assignment14.domain.User;
import com.google.gson.Gson;
@Service
public class UserService {

	
	public User convertUsernameFromJavascript(String theUser) {
		Gson gson= new Gson();
		
		User user= gson.fromJson(theUser,User.class);
		
		return user;
		
	}
	
	
}
