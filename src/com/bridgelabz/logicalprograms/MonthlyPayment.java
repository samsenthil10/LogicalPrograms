package com.bridgelabz.logicalprograms;

public class MonthlyPayment {
	public static void main(String[] args) {
		
		double principal = Double.parseDouble(args[0]);
		double years = Double.parseDouble(args[1]);
		double rate = Double.parseDouble(args[2]);
		double n = 12 * years;
		double r = rate / (12 * 100);
		double payment = (principal * r) / (1 - Math.pow(1 + r, -n));
		System.out.println("Monthly Payment:" + payment);
	}
}