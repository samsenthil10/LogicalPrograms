package com.bridgelabz.logicalprograms;
import java.util.*;

public class FibonacciSeries {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of terms in Fibonacci Series: ");
		int fibonacciSeriesNumberOfTerms = scanner.nextInt();
		int previousNumber = 0;
		int currentNumber = 1;
		System.out.print(previousNumber + ", " + currentNumber);
		for (int iterator = 2; iterator <= fibonacciSeriesNumberOfTerms; iterator++) {
			int nextNumber = previousNumber + currentNumber;
			previousNumber = currentNumber;
			currentNumber = nextNumber;
			System.out.print(", " + nextNumber);
		}
		scanner.close();
	}
}