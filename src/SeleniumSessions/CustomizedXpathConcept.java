package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CustomizedXpathConcept {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\taimoor\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@name='_nkw']")).sendKeys("Mobile");
		
		//dynamic xpath: HTML tags
		//  "//input[@class='test']"				1. Example for simple
		//  "//input[contains(@id,'test')]"    		2- First function
		//  "//input[starts-with(@id,'test')]"		3- Second function
		//  "//input[ends-with(@id,'test')]"		4- Third function
		
		//Absolute xpath is not recommended
		//Performance issue
		//Can be changed at any time in future
		
		Select select = new Select(driver.findElement(By.xpath("//*[@id=\"gh-cat\"]")));
		select.selectByVisibleText("Cell Phones & Accessories");
		
		driver.findElement(By.xpath("//a[contains(text(),'register')]")).click();
		
		//for links: Custom xpath
		
		
		
		Thread.sleep(6000);
		driver.quit();
		
	}

}
