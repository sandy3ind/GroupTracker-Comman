package com.samyuktatech.comman.model;

import java.util.Date;
import java.util.List;

public class UserFriend {

	
    private Long id;	
	private Long userId;	
	private Long friendId;
	private Long sentById;
	private List<User> friends;
	
	private boolean isRequestSent;	
	private boolean isRequestAccepted;	
	private Date requestSentDate;		
	private Date requestAcceptedDate;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public List<User> getFriends() {
		return friends;
	}
	public void setFriends(List<User> friends) {
		this.friends = friends;
	}
	public boolean isRequestSent() {
		return isRequestSent;
	}
	public void setRequestSent(boolean isRequestSent) {
		this.isRequestSent = isRequestSent;
	}
	public boolean isRequestAccepted() {
		return isRequestAccepted;
	}
	public void setRequestAccepted(boolean isRequestAccepted) {
		this.isRequestAccepted = isRequestAccepted;
	}
	public Date getRequestSentDate() {
		return requestSentDate;
	}
	public void setRequestSentDate(Date requestSentDate) {
		this.requestSentDate = requestSentDate;
	}
	public Date getRequestAcceptedDate() {
		return requestAcceptedDate;
	}
	public void setRequestAcceptedDate(Date requestAcceptedDate) {
		this.requestAcceptedDate = requestAcceptedDate;
	}
	public Long getFriendId() {
		return friendId;
	}
	public void setFriendId(Long friendId) {
		this.friendId = friendId;
	}
	public Long getSentById() {
		return sentById;
	}
	public void setSentById(Long sentById) {
		this.sentById = sentById;
	}
	
	
}
