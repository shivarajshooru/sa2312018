package javatest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import  org.junit.jupiter.api.Test;


import Calcpackage.Calculator;


public class javaclass {

	@Test
	public void caladdtest() {
		assertEquals(40,Calculator.Sum(20,20));
	}
	
	@Test
	public void caltestsub() {
		assertEquals(30,Calculator.Subtract(50,20));
	}
	
	@Test
	public void caltestmul() {
		assertEquals(30,Calculator.Multiply(6,5));
	}
	
	@Test
	public void caltestdivide() {
		assertEquals(1,Calculator.Divide(1,1));
	}
	
}
