package com.bridgelabz.logicalprograms;

import java.util.*;

public class Binary {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number");
		int number = scanner.nextInt();
		String binaryString = Integer.toBinaryString(number);
		int paddingSize = 8-(binaryString.length()%8);
		scanner.close();

		for(int i=0;i<paddingSize;i++) {
			binaryString = "0" + binaryString;
		}

		for(int i=0;i<binaryString.length();i+=8) {
			String temp = binaryString.substring(i,i+4);
			binaryString = binaryString.substring(0,i) + binaryString.substring(i+4,i+8) + temp + binaryString.substring(i+8);
		}
		System.out.println("The transformed number = "+Integer.parseInt(binaryString,2));
	}
}
