package com.bridgelabz.logicalprograms;

import java.util.*;

public class ReverseNumber {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int remainder, reverseNumber = 0;
		System.out.print("Enter the number to be reversed: ");
		int number = scanner.nextInt();
		while (number > 0) {

			remainder = number % 10;
			reverseNumber = (reverseNumber * 10) + remainder;
			number = number / 10;
		}
		System.out.println("The reversed Number is: " + reverseNumber);
		scanner.close();
	}
}