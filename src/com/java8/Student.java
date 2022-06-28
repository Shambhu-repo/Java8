package com.java8;

public class Student {
private String name;
private int age;
private int marks;
private String subject;
private int mobile;
public Student(String name, int age, int marks, String subject, int mobile) {
	super();
	this.name = name;
	this.age = age;
	this.marks = marks;
	this.subject = subject;
	this.mobile = mobile;
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
public int getMarks() {
	return marks;
}
public void setMarks(int marks) {
	this.marks = marks;
}
public String getSubject() {
	return subject;
}
public void setSubject(String subject) {
	this.subject = subject;
}
public int getMobile() {
	return mobile;
}
public void setMobile(int mobile) {
	this.mobile = mobile;
}
@Override
public String toString() {
	return "Student [name=" + name + ", age=" + age + ", marks=" + marks + ", subject=" + subject + ", mobile=" + mobile
			+ "]";
}
}
