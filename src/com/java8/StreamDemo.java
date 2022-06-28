package com.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> li=new ArrayList<String>();
		li.add("test1");
		li.add("test2");
		li.add("test23");
		li.add("test234");
		li.add("test2345");
		li.add("test23456");
  for(String str:li) {
	  if(str.contains("234")) {
		  System.out.println(str);
	  }
  }

  System.out.println("My firsst attempt");
  li.stream().filter(stm->stm.contains("test1")).forEach(stm->System.out.println("Myfistt attempt " + stm));
  System.out.println("My firsst attempt");
  //Stream does not store the data
  //Intermediate and terminal operation
  li.stream().filter(str->str.contains("234")).forEach(System.out::println);
  li.stream().filter(str->str.contains("234")).forEach(System.out::println);
	
  
  List<Student> students = new ArrayList<Student>();
  students.add(new Student("Shambhu",20,67,"java",45789));
  students.add(new Student("Anil",21,68,"php",457890));
  students.add(new Student("Aashis",22,69,"python",4578910));
  students.add(new Student("Tekie",23,70,"rubby",457891245));
  students.add(new Student("Anup",24,71,"script",457894587));

  List<Integer> marks = new ArrayList<Integer>();
  
  System.out.println("mobile no in 7/28/2021");
  List<Integer> marks1 =students.stream().filter(st->st.getAge()>20).map(s->s.getMobile()).collect(Collectors.toList());
  marks1.stream().forEach(System.out::println);
  System.out.println("mobile no in 7/28/2021");
  
  //student age is greater than 21
  students.stream().filter(st->st.getAge()>21).forEach(st->System.out.println(st.getName()));
  //student age is greater than 21 and subject
students.stream().filter(st->st.getAge()>21).filter(st->st.getSubject().equals("java")).forEach(st->System.out.println(st.getName()));
	//get the list of those students whereage is 21 and subject is php
List<Student> stu = students.stream().filter(st->st.getAge()>21 &&st.getSubject().equals("java")).collect((Collectors.toList()));
stu.stream().forEach(System.out::println);

//only need marks in list
List<Integer> mark = students.stream().map(m->m.getMarks()).collect(Collectors.toList());
mark.stream().forEach(System.out::println);

//collect those name where marks>50

//give me sum of marks for students having subject as java
int sum=students.stream().filter(st->st.getSubject().equals("java")) //collected student list having subject
.map(m->m.getMarks())     //collecting marks only here for student having subject java
.reduce(0,(total,m)->total+m);  // added all the marks and returned total
System.out.println("sum of marks :"  + sum);


	
	}

}
