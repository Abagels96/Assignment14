package com.coderscampus.Assignment14.service;

import java.util.List;
import java.util.ListIterator;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coderscampus.Assignment14.repository.MessageRepository;
import com.coderscampus.Assignment14.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	UserRepository userRepo;
	@Autowired
	MessageRepository messageRepo;

	
	
	
	
	public void saveAllMessages(String username) {
List<String> listOfMessages= messageRepo.loadMessages();		
 
if (username != null ) {
	
		ListIterator<String> listIterator=	listOfMessages.listIterator();
		while(listIterator.hasNext()){
			String message= listIterator.next(); 
			System.out.println(message);
			Map<String, List<String>> messages = userRepo.savePersonalMessages(username,message );
			String list = messages.toString();
			System.out.println(list);
//            System.out.println(userRepo.getAllMessages());

		}
		
		
		}

	}
}
