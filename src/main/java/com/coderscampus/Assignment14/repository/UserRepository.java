package com.coderscampus.Assignment14.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.coderscampus.Assignment14.domain.User;

@Repository
public class UserRepository {
	Map<String, List<String>> masterList = new HashMap<>();

	List<String> messages = new ArrayList<>();

	public List<String> savePersonalMessages(String username, String message) {

		if (message != null) {
			User user = new User();
			user.setUsername(username);
			user.setMessageContent(message);
			String messageContent = user.getMessageContent();
			messages.add(messageContent);

		}
		return messages;

	}

	public Map<String, List<String>> saveAllMessages( String username,List<String> messages) {

		masterList.put(username, messages);// validate in case this is empty
		return masterList;

	}

}
