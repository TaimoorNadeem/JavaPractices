package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Taimoor\\Downloads\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.symbios.pk/register");
		
		driver.manage().window().maximize();
		
		//There are basically 8 kind of locators available.
		
		//1. XPath Locator (Should not used for herarical elements)
		// Absolute xPath should not be used
		// Relative xPath should be used always
		
		/*Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("Taimoor Nadeem"); // Relative xPath example
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("mr.taimoor.rb@gmail.com");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("!@#Tahira123");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='confirm']")).sendKeys("!@#Tahira123");*/
		
		Thread.sleep(2000);
		
		//2. Id Locator most prefferable (drawback is that there could be a case id is not present)
		
		
		
		/*driver.findElement(By.id("firstname")).sendKeys("Taimoor Nadeem");
		
		driver.findElement(By.id("email")).sendKeys("mr.taimoor.rb@gmail.com");
		
		driver.findElement(By.id("password")).sendKeys("!@#Tahira123");
		
		driver.findElement(By.xpath("//input[@id='confirm']")).sendKeys("!@#Tahira123");*/
		
		//3. name  (drawback is that there could be a case name is not present)
		
		
		
		/*driver.findElement(By.name("firstname")).sendKeys("mr.taimoor.rb@gmail.com");
		
		driver.findElement(By.name("email")).sendKeys("mr.taimoor.rb@gmail.com");
		
		driver.findElement(By.name("password")).sendKeys("!@#Tahira123");
		
		driver.findElement(By.name("confirm")).sendKeys("!@#Tahira123");
		
		Thread.sleep(4000);*/
		
		//4. LinkText for specifically links
		
		driver.findElement(By.linkText("login here")).click();
		
		driver.findElement(By.linkText("Sign up")).click();
		
		driver.findElement(By.id("firstname")).sendKeys("Taimoor Nadeem");
		
		driver.findElement(By.id("email")).sendKeys("mr.taimoor.rb@gmail.com");
		
		driver.findElement(By.id("password")).sendKeys("!@#Tahira123");
		
		driver.findElement(By.xpath("//input[@id='confirm']")).sendKeys("!@#Tahira123");
		
		Thread.sleep(2000);
		
		//5. partialLinkText: Not Useful or Not recommended (Only used for a very big link text)
		
		//6. Css Selector preffered on third after xPath
		
		driver.findElement(By.cssSelector("#firstname")).sendKeys("Taimoor Nadeem");
		
		//7. Class Name can be duplicated for different elements (Not recommended)
		
		//8. 
		
		driver.quit();

	}

}
