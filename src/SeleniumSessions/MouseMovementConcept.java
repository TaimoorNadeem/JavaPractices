package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovementConcept {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C://Users//Taimoor//Downloads//chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //launch Chrome
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		Actions action = new Actions(driver);
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		action.moveToElement(driver.findElement(By.linkText("ADD-ONS"))).build().perform();
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Visa Services")).click();
		
		driver.quit();

	}

}
