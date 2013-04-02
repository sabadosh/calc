package com.androidbrew;

import static com.androidbrew.Console.*;

public class Calc {

	/**
	 * @param args
	 */
	public static String[] availableOperations = {"+", "-", "*", "/", "cos", "sin", "sqr", "sqrt"};
	
	public static void main(String[] args) {
		Calculation calculation = new Calculation();
		System.out.println("-------------------------------");
		System.out.print(" Enter the argument:");
		Double x = getArgumentFromConsole();
		int i = 0;
		while (true){     
			System.out.print(" Enter the operation:");
			String operation = getOperationFromConsole();
			if (!(operation.equals("+") || operation.equals("-") || operation.equals("*") || operation.equals("/"))) {
				if (i==0) {
		        	calculation.setTotal(x);
		        	calculation.calculate(operation);
		        	i++;
				} else {
					calculation.calculate(operation);
		        	i++;
				}
			} else {	
					System.out.print(" Enter the argument:");
					Double y = getArgumentFromConsole();
					if (i==0) {
						calculation.calculate(x, y, operation);
					} else {
						calculation.calculate(y, operation);
					}
					i++;
			}
					System.out.println("-------------------------------");
					System.out.println("Result:" + calculation.getTotal());
					System.out.println();
					System.out.println();
				}
		}
	

}
