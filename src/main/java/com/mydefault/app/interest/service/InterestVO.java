package com.mydefault.app.interest.service;

import java.io.Serializable;

public class InterestVO implements Serializable {
	private static final long serialVersionUID = 1L ;
	
	private String interestId ; 
	
	private String interestName ;

	public String getInterestId() {
		return interestId;
	}

	public void setInterestId(String interestId) {
		this.interestId = interestId;
	}

	public String getInterestName() {
		return interestName;
	}

	public void setInterestName(String interestName) {
		this.interestName = interestName;
	}
}
