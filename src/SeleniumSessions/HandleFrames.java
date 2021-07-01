package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrames {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C://Users//Taimoor//Downloads//chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //launch Chrome
		driver.manage().window().maximize(); //maximize window
		driver.manage().deleteAllCookies(); //delete all cookies
		
		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://ui.cogmento.com/");
		driver.findElement(By.xpath("//input[@placeholder='E-mail address']")).sendKeys("mr.taimoor.rb@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("!@#Tahira123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click(); // "//input['@type='submit']" -->Customize xpath
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='item-text']")).click();
		driver.switchTo().frame("mainpanel");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Contacts")).click();
		Thread.sleep(4000);
		
		driver.quit();

	}

}
