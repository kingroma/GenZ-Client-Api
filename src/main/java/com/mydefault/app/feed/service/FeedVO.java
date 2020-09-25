package com.mydefault.app.feed.service;

import java.io.Serializable;
import java.sql.Timestamp;

public class FeedVO implements Serializable{
	private static final long serialVersionUID = 1L ;
	
	private String userId ;
	
	private String registUserId ; 
	
	private String feedId ; 
	
	private String feedTitle ;
	
	private String feedText ; 
	
	private Timestamp registDate ;
	
	private Timestamp updateDate ;

	private String requestUserId ; 
	
	private String lastFeedId ;
	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getFeedId() {
		return feedId;
	}

	public void setFeedId(String feedId) {
		this.feedId = feedId;
	}

	public String getFeedTitle() {
		return feedTitle;
	}

	public void setFeedTitle(String feedTitle) {
		this.feedTitle = feedTitle;
	}

	public String getFeedText() {
		return feedText;
	}

	public void setFeedText(String feedText) {
		this.feedText = feedText;
	}

	public Timestamp getRegistDate() {
		return registDate;
	}

	public void setRegistDate(Timestamp registDate) {
		this.registDate = registDate;
	}

	public Timestamp getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Timestamp updateDate) {
		this.updateDate = updateDate;
	}

	public String getRequestUserId() {
		return requestUserId;
	}

	public void setRequestUserId(String requestUserId) {
		this.requestUserId = requestUserId;
	}

	public String getLastFeedId() {
		return lastFeedId;
	}

	public void setLastFeedId(String lastFeedId) {
		this.lastFeedId = lastFeedId;
	}

	public String getRegistUserId() {
		return registUserId;
	}

	public void setRegistUserId(String registUserId) {
		this.registUserId = registUserId;
	}

	
}
