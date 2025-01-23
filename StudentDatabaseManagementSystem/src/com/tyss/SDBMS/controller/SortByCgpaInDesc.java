package com.tyss.SDBMS.controller;

import java.util.Comparator;

import com.tyss.SDBMS.model.Student;

public class SortByCgpaInDesc implements Comparator<Student> {
	@Override
public int compare(Student o1,Student o2) {
//	Double d1= o1.getCgpa();
//	Double d2=o2.getCgpa();
//	return d2.compareTo(d1);
		return o2.getCgpa().compareTo(o1.getCgpa());
}
}
