package com.test;

import org.testng.annotations.Test;

public class TestNGFeatures {
	
	@Test
	public void loginTest() {
		System.out.println("login test"); //Most important test case for the app.
		//int i = 9/0; //Arithmetic Exception
	}
	
	@Test(dependsOnMethods = "loginTest")
	public void HomePageTest() {
		System.out.println("Home Page test");
	}
	
	@Test(dependsOnMethods = "loginTest")
	public void SearchPageTest() {
		System.out.println("Search Page test");
	}
	
	@Test(dependsOnMethods = "loginTest")
	public void RegistrationPageTest() {
		System.out.println("Registration Page test");
	}

}
