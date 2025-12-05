package com.app.stream.practise;

import com.app.practise.data.Employee;
import com.app.practise.data.Transaction;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Day1 {

	//helper method to check first letter of name is vowel
	private static boolean isVowel(String name) {
		Character c = name.toLowerCase().charAt(0);
		return "aeiou".indexOf(c) != -1;
	}

	static void problem1() {
		List<String> names = Arrays.asList("Shubman", "Hardik", "Surya", "Jadeja", "Shami", "Ashwin", "Pant", "Gill", "Dhoni", "KL", "Samson", "Kuldeep", "Chahal", "Siraj", "Prithvi", "Axar", "Umesh", "Harshal", "Krunal", "Deepak");

		//filtering names whose first letter is a vowel
		List<String> filteredNames = names.stream().filter(Day1::isVowel).toList();
		filteredNames.forEach(System.out::println);
	}

	//Problem2: sum of squares of given integer list
	static void problem2() {
		List<Integer> numberList = IntStream.rangeClosed(1, 100).boxed().toList();
		//
		int sum = numberList.stream().map(n -> n * n).reduce(0, (a, b) -> a + b);
		System.out.println("Sum of squares of given numbers = " + sum);
	}

	//Problem3: find unique fruits and count
	static void problem3() {
		List<String> fruits = Arrays.asList("apple", "banana", "apple", "orange", "banana", "grape", "strawberry", "orange");

		long count = fruits.stream().distinct().count();
		Set<String> uniqueFruits = new HashSet<>(fruits);
		Map<String, Long> fruitOccurances = fruits.stream().collect(Collectors.groupingBy(f -> f, Collectors.counting()));

		System.out.println("Count of Unique fruits = " + count);
		System.out.println("Unique fruits=> " + uniqueFruits);
		System.out.println("Occurance of fruits=> " + fruitOccurances);

		// getting fruits with occurance 1
		fruits.stream().filter(f -> fruitOccurances.get(f) == 1)
				.distinct()
				.forEach(System.out::println);
	}

	//Problem4: Printing employee data (with Names) where salary is greater than 50k
	static void problem4() {
		List<Employee> employeeList = Employee.populateEmployee();

//        List<String> filteredEmployee = employeeList.stream().
//                filter(emp -> emp.getSalary() > 50000).
//                map(Employee::getName).toList();
//        filteredEmployee.forEach(System.out::println);


		//Employee Name with salary
		List<Employee> filteredEmployee = employeeList.stream().
				filter(emp -> emp.getSalary() > 50000).toList();
		filteredEmployee.forEach(System.out::println);
	}

	//Problem5: Transaction budget for each of the category
	static void problem5() {
		List<Transaction> transactions = Transaction.populateDefaultTransactions();

//		Set<String> category = transactions.stream().map(Transaction::getCategory).collect(Collectors.toSet());
//		category.forEach(System.out::println);
		Map<String, Integer> summarizedData = transactions.
				stream().
				collect(Collectors.groupingBy(Transaction::getCategory, Collectors.summingInt(Transaction::getBudget)));

		System.out.println("Summarized Data=>" + summarizedData);
	}

	public static void main(String[] args) {
		problem1();
		System.out.println("------------------------");
		problem2();
		System.out.println("------------------------");
		problem3();
		System.out.println("------------------------");
		problem4();
		System.out.println("------------------------");
		problem5();

	}
}
