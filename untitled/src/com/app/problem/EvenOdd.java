package com.app.problem;

import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class EvenOdd {

	static void isEvenOrOdd(int input){

		//Old school approach
		boolean isEven=false;
		isEven=input%2==0;
		System.out.println(isEven?"Number is even":"Number is odd");

		//Stream approach
		IntStream.of(input).filter(n->n%2==0).findAny().ifPresentOrElse(  x -> System.out.println("Even"),
				() -> System.out.println("Odd"));
	}

	static void partitionEvenOdd(){
		int [] input = {1,2,3,4,5,6,7,8};
		Map<Boolean, List<Integer>> result = IntStream.of(input).boxed().collect(Collectors.partitioningBy(n -> n % 2 == 0));
		System.out.println("Even: " + result.get(true));
		System.out.println("Odd: " + result.get(false));
	}

	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		isEvenOrOdd(sc.nextInt());
		partitionEvenOdd();
	}
}
