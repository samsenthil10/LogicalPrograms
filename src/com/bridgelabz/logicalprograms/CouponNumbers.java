package com.bridgelabz.logicalprograms;

import java.util.*;

public class CouponNumbers {

	public static int generateNumber(int numberOfCoupons) {
		return (int)(Math.random() * numberOfCoupons)+1;
	}

	public static void generateDistinctCoupons(int numberOfCoupons) {
		HashSet<Integer> couponCodes = new HashSet<>();
		int countRandomNumbersRequired=0;
		while (couponCodes.size() != numberOfCoupons) {
			int randomNumber = generateNumber(numberOfCoupons);
			countRandomNumbersRequired++;
			couponCodes.add(randomNumber);
		}
		System.out.println("The total numbers generated are : " + countRandomNumbersRequired);
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int numberOfCoupons;
		System.out.print("Enter the number of coupons needed: ");
		numberOfCoupons = scanner.nextInt();
		scanner.close();
		generateDistinctCoupons(numberOfCoupons);
	}
}