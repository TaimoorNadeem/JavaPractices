package com.test;

import org.testng.annotations.Test;

public class InvocationCountTest {
	
	@Test(invocationCount = 10)  //Need execution for 10 times
	public void sum() {
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println("Sum of a and b " + c);
	}

}
