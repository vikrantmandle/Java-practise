package com.app.stream.practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Day4 {

	static void problem1() {
		String[] input = {"", "abc", "123", "45", "a12", "@#", "789", "12@3"};

		// Returning numbers as List of String
		List<String> numbers = Arrays.stream(input)
				.filter(s -> !s.isEmpty() && s != null)
				.filter(s -> s.matches("\\d+"))
				.toList();
		System.out.println(numbers);

		//Returning numbers as list of nunbers
		List<Integer> output = Arrays.stream(input)
				.filter(s -> !s.isEmpty() && s != null)
				.filter(s -> s.matches("\\d+"))
				.map(Integer::parseInt)
				.toList();
		System.out.println(output);

		//Without Stream based approach
		List<String> numberOutput = new ArrayList<>();
		for (String s : input) {
			if (s != null && !s.isEmpty() && s.matches("\\d+")) {
				numberOutput.add(s);
			}
		}
		System.out.println(numberOutput);
	}

	public static void main(String[] args) {
		problem1();
	}
}
