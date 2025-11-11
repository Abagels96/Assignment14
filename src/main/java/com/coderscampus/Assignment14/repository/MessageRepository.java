package com.coderscampus.Assignment14.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class MessageRepository {
	List<String> messages = new ArrayList<>();

	public void saveMessages(String message, String username) {

		if (message != null && !message.isBlank()) {
			messages.add(username + " : " + message);

		}

	}
	public List<String> loadMessages() {
		return new ArrayList<>(messages);

	}

}
