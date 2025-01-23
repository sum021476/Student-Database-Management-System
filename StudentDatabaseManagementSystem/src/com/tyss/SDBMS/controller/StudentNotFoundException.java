package com.tyss.SDBMS.controller;
public class StudentNotFoundException extends Exception{
private String message;
public StudentNotFoundException(String message) {
	this.message=message;
}
public String getMessage() {
	return message;
}
}
