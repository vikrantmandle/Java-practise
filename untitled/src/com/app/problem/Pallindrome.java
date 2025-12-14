package com.app.problem;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Pallindrome {

	static void isPallindrome1(String input){

		if(input==null){
			System.out.println("Enter a valid string");
			return;
		}
		int left=0;
		int right=input.length()-1;

		while (left<right){
			if(input.charAt(left)!=input.charAt(right)){
				System.out.println("String is not pallindrome");
				return;
			}
			left++;
			right--;
		}
		System.out.println("String is pallindrome");
	}

	//Sting builder approach
	static void isPallindrome2(String input){
		boolean isPallindrome = input.equals(new StringBuilder(input).reverse().toString());
		System.out.println(isPallindrome?"String is pallindrome":"not pallindrome");
	}

	//Stream based approach
	static void isPallindrome3(String input){
		boolean isPallindrome=IntStream.range(0,input.length()/2)
				.allMatch(n->input.charAt(n)==input.charAt(input.length()-n-1));
		System.out.println(isPallindrome?"String is pallindrome":"not pallindrome");
	}

	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
	//	isPallindrome1(sc.nextLine());
	//	isPallindrome2(sc.nextLine());
	//	isPallindrome3(sc.nextLine());

	}
}
