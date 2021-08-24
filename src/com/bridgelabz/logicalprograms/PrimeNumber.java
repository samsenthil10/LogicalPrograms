package com.bridgelabz.logicalprograms;

import java.util.*;

public class PrimeNumber {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number:");
		int number = scanner.nextInt();
		if (number == 1 || number == 0) {
			System.out.println("0 and 1 are neither prime nor composite");
		}
		else {
			for (int index = 2; index * index <= number; index++) {
				if (number % index == 0) {
					System.out.println("Given number "+number + " is not a Prime Number");
					scanner.close();
					return;
				}
			}
			System.out.println("Given number "+number + " is a Prime Number");
		}
		scanner.close();
	}
}
