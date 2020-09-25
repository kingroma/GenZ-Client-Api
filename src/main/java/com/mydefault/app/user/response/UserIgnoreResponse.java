package com.mydefault.app.user.response;

import java.sql.Timestamp;

public class UserIgnoreResponse {
	private String ignoreId ; 
	
	private Timestamp registDate ;

	public String getIgnoreId() {
		return ignoreId;
	}

	public void setIgnoreId(String ignoreId) {
		this.ignoreId = ignoreId;
	}

	public Timestamp getRegistDate() {
		return registDate;
	}

	public void setRegistDate(Timestamp registDate) {
		this.registDate = registDate;
	} 
	
	
}
