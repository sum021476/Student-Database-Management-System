package com.tyss.SDBMS.view;
import com.tyss.SDBMS.controller.SDBMSImpl;
import com.tyss.SDBMS.controller.StudentNotFoundException;

import java.util.Scanner;
import com.tyss.SDBMS.controller.SDBMS;
public class User {
public static void main(String[]args) {
	SDBMS s=new SDBMSImpl();
	Scanner sc= new Scanner(System.in);
	System.out.println("************Welcome to Student Database Management System**************");
		boolean flag=true;
	while(flag) {	
		System.out.println("1.Add Student\n2.Search Student\n3.Display All Student Details\n4.Remove Student Details\5.Display FeePaid Students Details\n6.Display Fee Not Paid Students\n7.Update Student CGPA\n8.Sort Student Based On CGPA In Descending Order\n9.Exit");
		System.out.println("Enter your Choice");
		int choice=sc.nextInt();

		switch(choice) {
		case 1:{
			s.addStudent();
		}break;
		case 2:{
			s.searchStudent();
		}break;
		case 3:{
			s.displayAllStudent();
		}break;
		case 4:{
			s.removeStudent();
		}break;
		case 5:{
			s.displayFeePaidStudents();
		}break;
		case 6:{
			s.displayFeeNotPaidStudents();
		}break;
		case 7:{
			s.updateStudentCGPA();
		}break;
		case 8:{
			s.sortStudentBasedOnCGPAInDesc();
		}break;
		case 9:{
			flag=false;
		}break;
		default:{
			try {
				throw new StudentNotFoundException("Invalid Choice");
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
		}
		System.out.println("---------------------------------------");
	}
}
}
