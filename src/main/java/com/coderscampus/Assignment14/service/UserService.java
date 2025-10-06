package com.coderscampus.Assignment14.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coderscampus.Assignment14.domain.User;
import com.coderscampus.Assignment14.repository.UserRepository;
import com.google.gson.Gson;
@Service
public class UserService {
@Autowired
UserRepository userRepo;
	
	
	
public void	saveMessages(User user, String message) {
	
	if(user!= null) {
	userRepo.savePersonalMessages(user, message);}
	
	
}
	
	
}
