package com.coderscampus.Assignment14.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.coderscampus.Assignment14.domain.User;

@Repository
public class UserRepository {
	Map <String,List<String>>  masterList= new HashMap<>();
	
	List<String> messages= new ArrayList <>();
	
public  List<String> savePersonalMessages(User user,String message) {
		
		if (message!= null) {
		messages.add(message);
		}
		return messages;
		
		
		
	}
	
	public void saveAllMessages(List<String> messages,String username ) {

		
		masterList.put(username,messages);// validate in case this is empty
		
	}

	
	
}
