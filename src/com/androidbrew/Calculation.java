package com.androidbrew;

public class Calculation {
	
//	private Double total;
	private Double total = 0.0;

	public Double getTotal() {
		return this.total;
	}
	
	public void setTotal(Double total) {
		this.total = total;
	}
	
	public void calculate(Double x, Double y, String operation) {
		if (operation.equals("+")) {
			total = total + (x + y);
		} 
		else if (operation.equals("-")) {
			total = total + (x - y);
		}
		else if (operation.equals("*")) {
			total = total + (x * y);
		}
		else if (operation.equals("/")) {
			if (y != 0.0) { 
				total = total + (x / y);
			} else {
				System.out.println("Division by zero not allowed");
				System.out.println("Enter proper values");
			}
		}		
	}
	
	public void calculate(Double y, String operation) {
		if (operation.equals("+")) {
			total = total +  y;
		} 
		else if (operation.equals("-")) {
			total = total - y;
		}
		else if (operation.equals("*")) {
			total = total * y;
		}
		else if (operation.equals("/")) {
			if (y != 0.0) { 
				total = total / y;
			} else {
				System.out.println("Division by zero not allowed");
				System.out.println("Enter proper values");
			}
//			total = total / y;
		}		
	}
	
	public void calculate(String operation) {
		if (operation.equals("cos")) {
			total = Math.cos(total);
		} 
		else if (operation.equals("sin")) {
			total = Math.sin(total);
		}
		else if (operation.equals("sqr")) {
			total = total * total;			
		}
		else if (operation.equals("sqrt")) {
			if (total >= 0){
				total = Math.sqrt(total);
		    } else {
		    	System.out.println("Argument must be >0");
		    	System.out.println("Enter proper values");
			}
		}
	}

}
