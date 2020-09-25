package com.mydefault.app.generic.response;

import java.util.HashMap;

public class DefaultResponseMap<T> extends HashMap<String, Object> {
	
	private static final long serialVersionUID = 1L;

	public static final int SUCCESS_STATUS = 200 ; 
	
	public static final int NOT_FOUND_RESULT = 300 ; 
	
	public static final int PARAMETER_ERROR_STATUS = 400 ; 
	
	public static final int SERVER_ERROR_STATUS = 500 ; 
	
	private Integer status = SUCCESS_STATUS;
	
	private String message = null ; 
	
	private String errorMessage = null ; 
	
	private T result = null ;
	
	public DefaultResponseMap(){
		this.put("status", this.status);
		this.put("errorMessage", this.errorMessage);
		this.put("message", this.message);
		this.put("result", result);
	}
	
	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
		this.put("status", this.status);
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
		this.put("errorMessage", this.errorMessage);
	}
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
		this.put("message", this.message);
	}

	public T getResult() {
		return result;
	}

	public void setResult(T result) {
		this.result = result;
		this.put("result", this.result);
	}
	
	@Override
	public String toString() {
		return "[DefaultResponseMap status = " + status + " message = " + message + " errorMessage = " + errorMessage + " result = " + result + " ]"  ;
		
	}
}
