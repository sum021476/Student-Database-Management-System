package com.tyss.SDBMS.controller;

public class InvalidChoice extends Exception{
	private String message;
	public InvalidChoice(String message) {
		this.message=message;
	}
	public String getMessage() {
		return message;
	}
}
