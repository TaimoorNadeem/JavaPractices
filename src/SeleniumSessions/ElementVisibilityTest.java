package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVisibilityTest {
	
		public static WebDriver driver;

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\taimoor\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://api.cogmento.com/register/");
		
		//1. isDisplayed() method: applicable for all Elements
		
		boolean btn = driver.findElement(By.name("action")).isDisplayed();
		System.out.println(btn); // Should return true
		
		//2. isEnabled() method:
		
		boolean btn1 = driver.findElement(By.name("action")).isEnabled();
		System.out.println(btn1);
		
		//3. isSelected() method: only applicable for checkbox, dropdown and radio button
		// if a check box in ticked it will return true		
		
	}
}
