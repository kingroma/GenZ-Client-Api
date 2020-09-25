package com.mydefault.app.user.response;

import java.sql.Timestamp;

public class UserFollowResponse {
	private String followId ; 
	
	private Timestamp registDate ;

	public String getFollowId() {
		return followId;
	}

	public void setFollowId(String followId) {
		this.followId = followId;
	}

	public Timestamp getRegistDate() {
		return registDate;
	}

	public void setRegistDate(Timestamp registDate) {
		this.registDate = registDate;
	}

	
	
	
}
