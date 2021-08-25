package com.bridgelabz.logicalprograms;

import java.util.Scanner;

public class TemperatureConversion {
	public static void main(String[] args) {
		double inputTemperature;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter temperature: ");
		inputTemperature = scanner.nextInt();

		System.out.println("Select Unit of Given Temperature:");
		System.out.println("Celsius");
		System.out.println("Farenheit");
		int choice = scanner.nextInt();
		temperatureConversion(inputTemperature, choice);
		scanner.close();
	}

	public static void temperatureConversion(double temperature, int choice) {
		double result = 0;
		switch (choice) {
		case 1:
			result = (temperature * 9 / 5) + 32;
			System.out.println("The temperature equals " + result + "F");
			break;
		case 2:
			result = (temperature - 32) * 5 / 9;
			System.out.println("The temperature equals " + result + "C");
			break;
		default:
			System.out.println("Invalid Option");
			return;
		}
	}
}