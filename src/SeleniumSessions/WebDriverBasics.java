package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		
		//1. Launch Firefox Browser
		//geckodriver
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Taimoor\\Downloads\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getCurrentUrl());
		driver.quit();
	
	}

}
