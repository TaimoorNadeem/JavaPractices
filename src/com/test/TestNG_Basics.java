package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Basics {
	
/*@BeforeSuite -- Set System Property For Chrome Browser
@BeforeTest -- Lauch Chrome Browser
@BeforeClass -- Login To App

@BeforeMethod -- Enter URL
@Test -- Google Title Test
@AfterMethod -- Logout From App

@BeforeMethod -- Enter URL
@Test -- Google Logo Test
@AfterMethod -- Logout From App

@BeforeMethod -- Enter URL
@Test -- Search Test
@AfterMethod -- Logout From App

@AfterClass -- Close Browser
@AfterTest -- Delete All The Cookies
PASSED: searchTest
PASSED: googleLogoTest
PASSED: googeTitleTest
*/
	
	//PreConditions -- Starting with Before
	
	@BeforeSuite //1
	public void setUp() {
		System.out.println("@BeforeSuite -- Set System Property For Chrome Browser");
	}
	
	@BeforeTest //2
	public void launchBrowser() {
		System.out.println("@BeforeTest -- Lauch Chrome Browser");
	}
	
	
	@BeforeClass //3
	public void login() {
		System.out.println("@BeforeClass -- Login To App");
	}
	
	/*
	 * @BeforeMethod
	 * @TestCase_1
	 * @After Method
	 * 
	 * @BeforeMethod
	 * @TestCase_2
	 * #After Method
	 * 
	 */
	
	@BeforeMethod //4
	public void enterUrl() {
		System.out.println("@BeforeMethod -- Enter URL");
	}
	
	//Test Cases -- Starting with Test
	@Test //5
	public void googeTitleTest() {
		System.out.println("@Test -- Google Title Test");	
	}
	
	@Test
	public void searchTest() {
		System.out.println("@Test -- Search Test");
	}
	
	@Test
	public void googleLogoTest() {
		System.out.println("@Test -- Google Logo Test");
	}
	
	//Post Conditions -- Starting with After
	@AfterMethod //6
	public void logout() {
		System.out.println("@AfterMethod -- Logout From App");
	}
	
	@AfterClass //7
	public void clossBrowser() {
		System.out.println("@AfterClass -- Close Browser");
	}
	
	@AfterTest //8
	public void deleteAllCookies() {
		System.out.println("@AfterTest -- Delete All The Cookies");
	}
	
}
