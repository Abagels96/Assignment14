package com.coderscampus.Assignment14.domain;

public class User {
private Long userId;
private String username;
private String messageContent;
public Long getUserId() {
	return userId;
}
public void setUserId(Long userId) {
	this.userId = userId;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getMessageContent() {
	return messageContent;
}
public void setMessageContent(String messageContent) {
	this.messageContent = messageContent;
}
@Override
public String toString() {
	return "User [userId=" + userId + ", username=" + username + ", messageContent=" + messageContent + "]";
}



}
