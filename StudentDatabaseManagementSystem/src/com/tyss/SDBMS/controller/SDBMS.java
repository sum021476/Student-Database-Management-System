package com.tyss.SDBMS.controller;

public interface SDBMS {
	void addStudent();
	void searchStudent();
	void displayAllStudent();
	void removeStudent();
	void displayFeePaidStudents();
	void displayFeeNotPaidStudents();
	void updateStudentCGPA();
	void sortStudentBasedOnCGPAInDesc();
}
