package com.coderscampus.Assignment14.service;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coderscampus.Assignment14.domain.User;
import com.coderscampus.Assignment14.repository.UserRepository;
import com.google.gson.Gson;
@Service
public class UserService {
@Autowired
UserRepository userRepo;
	
	
	
public void	saveMessages(String username, String message) {
	
	if(username!= null) {
		
	List<String> messages= userRepo.savePersonalMessages(username, message);
Map<String,List<String>>
allMessages=userRepo.saveAllMessages(username, messages);
	
	
}
	
	
} }
