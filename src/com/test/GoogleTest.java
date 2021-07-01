package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest { //Test keywork should be used to design test class
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\taimoor\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
	}
	
	@Test(priority=1, groups="Title")
	public void googleTitleTest() {
		String title = driver.getTitle();
		System.out.println(title);
		if(driver.getTitle().equals("Google")) {
			System.out.println("priority=1 -- Title of the page is correct");
		}
	}
	
	@Test(priority=2, groups="G_Image")
	public void googleLogoTest() {
		boolean img =driver.findElement(By.xpath("//img[@alt='Google']")).isDisplayed();
		if(img == true) {
			System.out.println("priority=2 -- Verified that the Google image is available on the page");
		}
	}
	
	@Test(priority=6, groups = "test")
	public void test1() {
		System.out.println("priority=6");
	}
	
	@Test(priority=4, groups = "test")
	public void test2() {
		System.out.println("priority=4");
	}
	
	@Test(priority=5, groups = "test")
	public void test3() {
		System.out.println("priority=5");
	}
	
	@Test(priority=3, groups ="Gmail_Link")
	public void gmailLinkTest() {
		boolean gmailLink = driver.findElement(By.xpath("//a[normalize-space()='Gmail']")).isDisplayed();
		if(gmailLink == true) {
			System.out.println("priority=3 -- User can click on the Gmail link available on the page");
		}
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
