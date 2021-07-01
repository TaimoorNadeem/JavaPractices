package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitConcept {

	public static void main(String[] args) {
		
		
		// Implicit Wait is a type of dynamic wait
		
		System.setProperty("webdriver.chrome.driver", "C://Users//Taimoor//Downloads//chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //launch Chrome
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@id='gh-btn']")).click();
		
		driver.quit();

	}

}
