package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo1 {

	

  
  
 //List<Student1> students= new ArrayList<Student1>();
	
	public static List<Student1> getAllStudent(){
  
 // List<Student1> students = new ArrayList<Student1>();
  
  return Stream.of(
  new Student1("Shambhu",20,67,"java",Arrays.asList(245789,35897)),
  new Student1("Anil",21,68,"php",Arrays.asList(245789,35897)),
  new Student1("Aashis",22,69,"python",Arrays.asList(245789,35897)),
  new Student1("Tekie",23,70,"rubby",Arrays.asList(245789,35897)),
  new Student1("Anup",24,71,"script",Arrays.asList(245789,35897))
  ).collect(Collectors.toList());
 
	}
	
	
	public static List<Student2> getAllEMployee(){
		
		return Stream.of(
				  new Student2("Shambhu","A",35897),
				 new Student2("Shambhu","A",37897),
                 new Student2("Shambhu","B",30897),
                new Student2("Shambhu","A",30897),
                new Student2("Shambhu","B",25897),
                new Student2("Shambhu","A",25897)
				  ).collect(Collectors.toList());
	}
}
  
  
  
  
  
  
  