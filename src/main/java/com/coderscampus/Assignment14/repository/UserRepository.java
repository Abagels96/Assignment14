package com.coderscampus.Assignment14.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.coderscampus.Assignment14.domain.User;

@Repository
public class UserRepository {
	
//	List<String> chatLog= new ArrayList<>();
//	chatLog.add(username,message);

	Map<String, List<String>> messages = new HashMap<>();

	public Map<String, List<String>>  savePersonalMessages(String username, String message) {
		if (message != null&& !message.isBlank()) {
			
			List<String> justText=messages.getOrDefault(username,new ArrayList<>() ) ;
		justText.add(message);
			// I need a declaration that will actually add the message chatGPT is hallucinating and  being dumb
			messages.put(username,justText);
        
		}
		
		return messages;

	}
	




}
