package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverCode {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\taimoor\\downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		String title = driver.getTitle();
		if(title.equals("Google")) {
			System.out.println("Title of the page is correct");
		}
		else {
			System.out.println("Incorrect Title");
		}
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		
		
		driver.quit();
		
	}

}
