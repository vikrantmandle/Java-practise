package com.app.problem;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays_sort_strings {
	static  String [] input=new String[]{"banana","cherry","go","plums","pineapple","pear","berry"};

	//Sorting string based on arrays sort approach
	static void problem1(){
		Arrays.sort(input);
		System.out.println(Arrays.toString(input));

	}

	//Sorting in reverse order
	static  void problem1_1(){

		Arrays.sort(input, Comparator.reverseOrder());
		System.out.println(Arrays.toString(input));
	}

	//Sorting using stream operations (Ascending order)
	static void problem1_2(){
		String [] sorted=Arrays.stream(input).sorted().toArray(String[]::new);
		System.out.println(Arrays.toString(sorted));
	}

	//Sorting using stream operations (Reverse order)
	static void problem1_3(){
		String [] reverseSorted= Arrays.stream(input).sorted(Comparator.reverseOrder()).toArray(String[]::new);
		System.out.println(Arrays.toString(reverseSorted));
	}

	//Sorting as per string length (Ascending order)
	static void problem1_4(){
		Arrays.sort(input,Comparator.comparing(String::length));
		System.out.println(Arrays.toString(input));

	}

	//Sorting when input is separated by space
	static void problem1_5(){
		String data = "banana apple cherry plums pineapple pear";

			String [] sorted= Arrays.stream(data.split(" "))
					        .sorted()
							.toArray(String[]::new);
			System.out.println(Arrays.toString(sorted));
	}

	//String containing number as input
	static void problem1_6(){

		String inputData= "123 235 5673 756";
		Integer[] output=Arrays.stream(inputData.split(" ")).map(Integer::parseInt).sorted().toArray(Integer[] :: new);

		System.out.println(Arrays.toString(output));
	}

	public static void main(String [] args){
		problem1(); //Sorting based on Arrays sort (Ascending order)
		problem1_1(); //Sorting in reverse order
		problem1_2(); //Sorting using stream API
		problem1_3(); //Sorting using strem API ( Reverse order)
		problem1_4(); //Sorting as per string length (Ascending order)
		problem1_5(); //Sorting when input is space separated.
		problem1_6(); //Sorting on integers given as string
	}
}
