package com.tyss.SDBMS.controller;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;
import com.tyss.SDBMS.model.Student;
public class SDBMSImpl implements SDBMS {
//database
	LinkedHashMap<Integer,Student>db= new LinkedHashMap<Integer,Student>();
	Scanner sc=new Scanner(System.in);
	@Override
	public void addStudent() {
		System.out.println("Enter Student name");
		String name=sc.next();
		System.out.println("Enter Student age");
		int age=sc.nextInt();
		System.out.println("Enter Student CGPA");
		double CGPA= sc.nextDouble();
		System.out.println("Enter Student Fee Status");
		boolean Fee= sc.nextBoolean();
		Student s=new Student(name,age,CGPA,Fee);
		db.put(s.getSid(),s);
		System.out.println("Student Added Successfully");
	}
	@Override
	public void displayAllStudent() {
		Set<Integer>s=db.keySet();
		for(Integer ele:s) {
			System.out.println(db.get(ele));
		}
	}

	@Override
	public void searchStudent() {
	System.out.println("Enter SID");
	int sid=sc.nextInt();
	if(db.containsKey(sid)) {
		System.out.println(db.get(sid));
	}
	else {
		try {
			throw new StudentNotFoundException("Student Not Found Exception");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
		
	}

	
	@Override
	public void removeStudent() {
		System.out.println("Enter SID");
		int sid=sc.nextInt();
		if(db.containsKey(sid)) {
			db.remove(sid);
			System.out.println("Student Successfully removed");
		}
		else {
			try {
				throw new StudentNotFoundException("Student Not Found Exception");
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
	}

	@Override
	public void displayFeePaidStudents() {
		Set<Integer>s=db.keySet();
		for(Integer ele:s) {
			Student sn= db.get(ele);
			if(sn.isFeeStatus()) {
				System.out.println(sn);
			}
		}
	}

	@Override
	public void displayFeeNotPaidStudents() {
		Set<Integer>s=db.keySet();
		for(Integer ele:s) {
			Student sn= db.get(ele);
			if(!sn.isFeeStatus()) {
				System.out.println(sn);
			}
		}
		
	}

	@Override
	public void updateStudentCGPA() {
		System.out.println("Enter SID");
		int sid=sc.nextInt();
		if(db.containsKey(sid)) {
			Student s= db.get(sid);
			System.out.println("Old CGPA:"+s.getCgpa());
			System.out.println("Enter new CGPA");
			double cgpa=sc.nextDouble();
			s.setCgpa(cgpa);
			System.out.println("Student CGPA Updated Successfully");
		}
		else {
			try {
				throw new StudentNotFoundException("Student Not Found Exception");
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		
	}

	@Override
	public void sortStudentBasedOnCGPAInDesc() {
		
		ArrayList<Student> a= new ArrayList<Student>();
		Set<Integer> s=db.keySet();
		for(Integer i: s) {
			a.add(db.get(i));
		}
		SortByCgpaInDesc byCgpaInDesc= new SortByCgpaInDesc();
		Collections.sort(a,byCgpaInDesc);
		for(Student ele: a) {
			System.out.println(ele);
		}
	}

}
