package com.app.stream.practise;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Day2 {

    //Problem 1: Filter Even Numbers
    static void problem1(){
        List<Integer> numbers= IntStream.rangeClosed(1,20).boxed().toList();
        List<Integer> evenNumbers= numbers.stream().filter(n->n%2==0).toList();

        System.out.println("Even numbers within given range: "+ evenNumbers);
    }

    // Problem2: Count the total 1 present in array;
    static void problem2(){
        int [] numberArray= {1,0,1,0,1,1,0,1};
        int sum=  Arrays.stream(numberArray).sum();
        System.out.println("Total 1=> "+sum);
    }

    //Problem2: Convert Words to Their Lengths
    static void problem3(){
        String [] words = {"java", "developer", "stream"};
       List<Integer> wordLength= Arrays.stream(words).map(n->n.length()).toList();
       System.out.println("Length of each words respectively=> "+wordLength);
    }
	//Problem3: Remove Duplicate Integers
	static  void problem4(){
		List<Integer> numbers= Arrays.asList(4, 5, 4, 7, 5, 9);
		//Set<Integer> uniqueNumbers= numbers.stream().collect(Collectors.toSet());
		List<Integer>uniqueNumbers=numbers.stream().distinct().toList();
		System.out.println("uniqueNumbers => "+uniqueNumbers);
	}

	//Problem5: Find Maximum and Minimum
	static  void problem5(){
		List<Integer> numbers= Arrays.asList(40, 10, 90, 70, 20);
		List<Integer> sortedNumbers=numbers.stream().sorted().toList();
		System.out.println("Min=> "+sortedNumbers.get(0)+" Max=> "+sortedNumbers.get(numbers.size()-1));

		//Approach2
		IntSummaryStatistics collect=numbers.stream()
									 .mapToInt(Integer::intValue)
				                     .summaryStatistics();
		System.out.println("Max => "+collect.getMax()+" Min => "+collect.getMin());
	}

	//Problem6: Calculate sum and average
	static void problem6(){
		List<Integer>numbers=Arrays.asList(1000, 1500, 1200, 1800);
		IntSummaryStatistics collect = numbers.stream().collect(Collectors.summarizingInt(Integer::intValue));
		System.out.println("Sum => "+collect.getSum()+" Average => "+collect.getAverage());

	}
    public static void main(String[] args){
    	problem1();
    	System.out.println("----------------");
   	 	problem2();
		System.out.println("----------------");
		problem3();
		System.out.println("----------------");
		problem4();
		System.out.println("----------------");
		problem5();
		System.out.println("----------------");
		problem6();
    }
}
