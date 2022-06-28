package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MapReduceExample {
	
public static void main(String[] args) {
	List<Integer> numbers = Arrays.asList(3,5,8,9,7,5,4,9,-9);
	
	
	//using map() method
	//System.out.println(sum);
	
	// using reduce() method
	Integer reducSum =numbers.stream().reduce(0,(a,b)->a+b);
      System.out.println(reducSum);
      
      //using method reference
   Optional<Integer> reduceWithMEthodReference=   numbers.stream().reduce(Integer::sum);
System.out.println("reduce with method reference " + reduceWithMEthodReference.get());

//multiply
Integer multiply =numbers.stream().reduce(1,(a,b)->a*b);
System.out.println("from multiply "+ multiply);


//big number
int big =numbers.stream().reduce(0,(a,b)->a>b?a:b);
System.out.println(big);

}

}
