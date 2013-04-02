package com.androidbrew;

import java.util.Scanner;
import static com.androidbrew.Calc.availableOperations;

public class Console {
	public static Double getArgumentFromConsole(){
		Double arg = 0.0;
		try {
			Scanner scan = new Scanner(System.in);
			arg = scan.nextDouble();
			} 
		catch (Exception e) {
				System.out.print("Enter proper double value:");
				return getArgumentFromConsole(); 
			}
		return arg;
	}
	
	public static String getOperationFromConsole(){
		Scanner scan = new Scanner(System.in);
		String input = scan.next();
		boolean equals = false;
		for (String operation:availableOperations) {
			if (input.equals(operation)) {
				equals = true;
				break;
			}			
		}
		if (!equals) {
			System.out.print("Enter proper operator:");
			input = getOperationFromConsole();
		}
		return input;
	}
	
}
