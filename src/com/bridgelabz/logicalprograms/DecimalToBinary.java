package com.bridgelabz.logicalprograms;

import java.util.Scanner;

public class DecimalToBinary {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter decimal(base 10) number: ");
		int decimalNumber=scanner.nextInt();
		scanner.close();
		
		int binary[] = new int[32];    
	    int index = 31;    
	    while(decimalNumber > 0){    
	       binary[index--] = decimalNumber%2;    
	       decimalNumber = decimalNumber/2;    
	    }    
	    for(int i = 0;i < 32;i++){    
	       System.out.print(binary[i]);    
	     }    

	}
}