package com.coderscampus.Assignment14.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import com.coderscampus.Assignment14.repository.MessageRepository;

import jakarta.annotation.PostConstruct;
@Service
public class MessageService {
	@Autowired
	
	MessageRepository messageRepo;
	
	public String saveMessages(String messageContent) {
		
		messageRepo.saveMessages(messageContent);
		return messageContent;
		
	}
	
	
	   @PostConstruct
	    public void init() {
	        System.out.println("✅ MessageService bean has been created successfully!");
	    }


}
