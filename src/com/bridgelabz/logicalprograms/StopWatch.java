package com.bridgelabz.logicalprograms;
import java.util.*;

public class StopWatch {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Press S to Click Start Time: ");
		String clockButton =scanner.next();
		long startTime =0 ,stopTime =0;
		if(clockButton.equalsIgnoreCase("s")) {
			startTime= System.currentTimeMillis();
		}
		else {
			System.out.println("Invalid Key Pressed!");
			scanner.close();
			return;
		}
		System.out.print("Press S to Click Stop Time: ");
		clockButton =scanner.next();
		if(clockButton.equalsIgnoreCase("s")) {
			stopTime =System.currentTimeMillis();
		}
		else {
			System.out.println("Invalid Key Pressed!");
			scanner.close();
			return;
		}
		startTime=startTime/1000;
		stopTime=stopTime/1000;
		long totalTime = stopTime-startTime;
		System.out.println(totalTime);
		scanner.close();
	}
}
