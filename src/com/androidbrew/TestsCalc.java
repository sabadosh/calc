package com.androidbrew;

import static org.junit.Assert.*;

import org.junit.Test;
import static com.androidbrew.Calculation.*; 

public class TestsCalc {
	

	@Test
	public void testAdd() {
		Double x = 4.0;
		Double y = 2.0;
		String operation = "+";
		Double result = 6.0;
		Calculation object = new Calculation();
		object.calculate(x,y,operation);
		assertEquals(result, object.getTotal());
	
	}
	
	@Test
	public void testSubtract() {
		Double x = 4.0;
		Double y = 2.0;
		String operation = "-";
		Double result = 2.0;
		Calculation object = new Calculation();
		object.calculate(x,y,operation);
		assertEquals(result, object.getTotal());
	
	}
	
	@Test
	public void testMultiply() {
		Double x = 4.0;
		Double y = 2.0;
		String operation = "*";
		Double result = 8.0;
		Calculation object = new Calculation();
		object.calculate(x,y,operation);
		assertEquals(result, object.getTotal());
	
	}
	
	@Test
	public void testDivide() {
		Double x = 4.0;
		Double y = 2.0;
		String operation = "/";
		Double result = 2.0;
		Calculation object = new Calculation();
		object.calculate(x,y,operation);
		assertEquals(result, object.getTotal());
	
	}
	
	@Test
	public void testCos() {
		Double x = 90.0;
		String operation = "cos";
		Double result = Math.cos(x);
		Calculation object = new Calculation();
		object.setTotal(x);
		object.calculate(operation);
		assertEquals(result, object.getTotal());
	
	}
	
	@Test
	public void testSin() {
		Double x = 90.0;
		String operation = "sin";
		Double result = 1.0;
		Calculation object = new Calculation();
		object.calculate(x,operation);
		assertEquals(result, object.getTotal());
	
	}
	
	@Test
	public void testSqr() {
		Double x = 9.0;
		String operation = "sqr";
		Double result = 81.0;
		Calculation object = new Calculation();
		object.calculate(x,operation);
		assertEquals(result, object.getTotal());
	
	}
	
	@Test
	public void testSqrt() {
		Double x = 81.0;
		String operation = "sqrt";
		Double result = 9.0;
		Calculation object = new Calculation();
		object.calculate(x,operation);
		assertEquals(result, object.getTotal());
	
	}

	
}
