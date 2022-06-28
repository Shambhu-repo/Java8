package com.java8;

import java.util.List;

public class Student1 {
private String name;
private int age;
private int marks;
private String subject;
private List<Integer> mobile;
public Student1(String name, int age, int marks, String subject, List<Integer> mobile) {
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
public List<Integer> getMobile() {
	return mobile;
}
public void setMobile(List<Integer> mobile) {
	this.mobile = mobile;
}
@Override
public String toString() {
	return "Student1 [name=" + name + ", age=" + age + ", marks=" + marks + ", subject=" + subject + ", mobile="
			+ mobile + "]";
}



}