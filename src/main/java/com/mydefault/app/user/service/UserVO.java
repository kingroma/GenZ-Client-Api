package com.mydefault.app.user.service;

import java.io.Serializable;
import java.sql.Timestamp;

public class UserVO implements Serializable {
	private static final long serialVersionUID = 1L ;
	
	private String userId ; 
	
	private String userPw ; 
	
	private String userName ; 
	
	private String userNickname ; 
	
	private String userSi ;
	
	private String userGu ; 
	
	private String userDong ; 
	
	private Timestamp registDate ; 
	
	private Timestamp updateDate ; 
	
	private String userToken ; 
	
	// ======== friend 
	private String friendId ; 
	
	private String friendNickname ;
	
	// ======== group
	private String groupId ; 
	
	private String groupNickname ; 
	
	// ======== category
	private String categoryId ; 
	
	private String categoryName ; 
	
	private Integer categoryLevel ; 
	
	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPw() {
		return userPw;
	}

	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserNickname() {
		return userNickname;
	}

	public void setUserNickname(String userNickname) {
		this.userNickname = userNickname;
	}

	public String getUserSi() {
		return userSi;
	}

	public void setUserSi(String userSi) {
		this.userSi = userSi;
	}

	public String getUserGu() {
		return userGu;
	}

	public void setUserGu(String userGu) {
		this.userGu = userGu;
	}

	public String getUserDong() {
		return userDong;
	}

	public void setUserDong(String userDong) {
		this.userDong = userDong;
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

	public String getUserToken() {
		return userToken;
	}

	public void setUserToken(String userToken) {
		this.userToken = userToken;
	}

	public String getFriendId() {
		return friendId;
	}

	public void setFriendId(String friendId) {
		this.friendId = friendId;
	}

	public String getFriendNickname() {
		return friendNickname;
	}

	public void setFriendNickname(String friendNickname) {
		this.friendNickname = friendNickname;
	}
	
	public String getGroupId() {
		return groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getGroupNickname() {
		return groupNickname;
	}

	public void setGroupNickname(String groupNickname) {
		this.groupNickname = groupNickname;
	}
	
	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public Integer getCategoryLevel() {
		return categoryLevel;
	}

	public void setCategoryLevel(Integer categoryLevel) {
		this.categoryLevel = categoryLevel;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "[UserVO userId=" + userId + ", userPw=" + userPw + ", userToken=" + userToken + "]";
	}
}
