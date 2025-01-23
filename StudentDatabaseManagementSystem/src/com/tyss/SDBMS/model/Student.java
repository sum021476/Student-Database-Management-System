package com.tyss.SDBMS.model;

import java.util.Objects;

public class Student {
private String name;
private int age;
private int sid;
private Double cgpa;
private boolean feeStatus;
private static int id=101;
public Student(String name, int age, double cgpa, boolean feeStatus) {
	this.name = name;
	this.age = age;
	this.cgpa = cgpa;
	this.feeStatus = feeStatus;
	sid=id++;
}
@Override
public String toString() {
	return "Student [name=" + name + ", age=" + age + ", sid=" + sid + ", cgpa=" + cgpa + ", feeStatus=" + feeStatus
			+ "]";
}
@Override
public int hashCode() {
	return Objects.hash(age, cgpa, feeStatus, name, sid);
}
@Override
public boolean equals(Object obj) {
	Student s=(Student)obj;
	return this.sid==s.sid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public Double getCgpa() {
	return cgpa;
}
public void setCgpa(Double cgpa) {
	this.cgpa = cgpa;
}
public boolean isFeeStatus() {
	return feeStatus;
}
public void setFeeStatus(boolean feeStatus) {
	this.feeStatus = feeStatus;
}
public int getSid() {
	return sid;
}

}
