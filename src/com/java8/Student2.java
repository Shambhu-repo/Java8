package com.java8;

public class Student2 {
private String name;
private String grade;
private int salary;
public Student2(String name, String grade, int salary) {
	super();
	this.name = name;
	this.grade = grade;
	this.salary = salary;
	
	
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getGrade() {
	return grade;
}

public void setGrade(String grade) {
	this.grade = grade;
}

public int getSalary() {
	return salary;
}

public void setSalary(int salary) {
	this.salary = salary;
}

@Override
public String toString() {
	return "Student2 [name=" + name + ", grade=" + grade + ", salary=" + salary + "]";
}

}

