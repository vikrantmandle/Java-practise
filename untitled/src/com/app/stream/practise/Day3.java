package com.app.stream.practise;

import java.util.*;
import java.util.stream.Collectors;

public class Day3 {

	//Problem1: Group by a property (groupingBy + counting / toList)
	static void problem1(){
		List<String> data = Arrays.asList("apple", "banana", "car", "dog", "pear", "hi", "bye");
		Map<Integer, List<String>> collect = data.stream().collect(Collectors.groupingBy(String::length));
		System.out.println(collect);
	}

	//Problem 2 — Partitioning by predicate
	static void problem2(){
		List<Integer>numbers= Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		Map<Boolean, List<Integer>> collect = numbers.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));
		System.out.println(collect);
	}

	//Problem3: Flatten nested collections (flatMap)
	static void problem3(){
		List<List<Integer>> data = new ArrayList<>();
		data.add(Arrays.asList(1, 2, 3));
		data.add(Arrays.asList(4, 5));
		data.add(Arrays.asList(6, 7, 8));

		List<Integer> list = data.stream().flatMap(n -> n.stream()).toList();
		System.out.println(list);
	}

	//Problem 4 — Find second largest (or second highest) number (distinct + sorted + skip)
	static void problem4(){
		List<Integer>numbers= Arrays.asList(5,5,5);
		Optional<Integer> secondHighestNum = numbers.stream()
				.sorted(Comparator.reverseOrder())
				.distinct()
				.skip(1)
				.findFirst();
		System.out.println(secondHighestNum.orElse(0));
	}

	//Problem 5 — Given list of comma-separated number-strings, flatten + parse + filter + sort
	static void problem5(){
		List<String> data= Arrays.asList("1,2,3", "3,4,5", "6,abc,7", "8,9,10", "10,2,4");
		List<Integer> list = data.stream().flatMap(n -> Arrays.stream(n.split(",")))
				.filter(s -> s.matches("\\d+"))
				.map(Integer::parseInt)
				.distinct()
				.sorted(Comparator.reverseOrder())
				.toList();
		System.out.println(list);
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
	}
}
