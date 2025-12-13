package com.app.problem;

import java.util.Arrays;

public class Array_sort {

	//sort the array in ascending format: [Bubble sort approach]
	static void problem1(int[] input) {
		for (int i = 0; i < input.length - 1; i++) {
			for (int j = 0; j < input.length - i - 1; j++) {
				if (input[j] > input[j + 1]) {
					int temp = input[j];
					input[j] = input[j + 1];
					input[j + 1] = temp;
				}
			}
		}
		for (int num : input) {
			System.out.print(num + " ");
		}
		System.out.println();
	}

	//Sort the array in ascending order : [Arrays sort method]
	static void problem1_1(int[] arr) {
		Arrays.sort(arr);
		for (int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();
	}

	//Sort the array in ascending order : [Stream operations]
	static void problem1_2(int[] arr) {
		int[] output = Arrays.stream(arr).sorted().toArray();
		System.out.println(Arrays.toString(output));
		System.out.println();
	}

	public static void main(String[] args) {
		problem1(new int[]{5, 2, 9, 1, 3}); //Bubble sort approach
		problem1_1(new int[]{33, 22, 12, 98, 111}); //Arrays sort method
		problem1_2(new int[]{33, 22, 12, 98, 111}); //Stream based sorting
	}
}
