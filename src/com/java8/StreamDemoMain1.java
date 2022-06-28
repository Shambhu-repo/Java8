package com.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemoMain1 {

	public static void main(String[] args) {
		
		
	List<Student1> student =	StreamDemo1.getAllStudent();
	
	//data transformation // we have converted student list to student name list // is called student 
	//here i am convertingList<Student> into LIst<Integer> , which is called transformation
	//Here one customer is having one name st.getName()  this is one to one maping
	
	List<String> studentlist =student.stream().map(st->st.getName()).collect(Collectors.toList());
	System.out.println(studentlist);
	
	
	// it will give list of list of integer
	List<List<Integer>> studentlist1 =student.stream().map(st->st.getMobile()).collect(Collectors.toList());
	System.out.println(studentlist1);
	
	//here one student is having morethan one phone so we cah say : one to many or one student-> many phone
	List<Integer> l = student.stream().flatMap(st->st.getMobile().stream()).collect(Collectors.toList());
	System.out.println(l);
	
	
	// this is using filter and flatmap
	List<Integer> l1 = student.stream().filter(s1->s1.getMarks()>69).flatMap(st->st.getMobile().stream()).collect(Collectors.toList());
	System.out.println(l1);
	
	
	
	//this is for class student2
	
	double average =StreamDemo1.getAllEMployee().stream().filter(emp->emp.getGrade().equalsIgnoreCase("A")).map(emp->emp.getSalary())
	.mapToDouble(i->i).average().getAsDouble();
	System.out.println(average);
	
}

}
