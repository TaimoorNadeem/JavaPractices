package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectCalendarByJS {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\taimoor\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://beta.spicejet.com/");
		/*driver.get("https://www.piac.com.pk");
		driver.findElement(By.xpath("//button[@id='popup']//span[@class='im-close']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Schedules']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@role='alert']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[@id='dpd3']")).click();
		
		WebElement date = driver.findElement(By.xpath("//input[@id='dpd3']"));*/
		WebElement date = driver.findElement(By.xpath("//div[contains(text(),'Thu, 17 Jun 2021')]"));
		String dateVal = "30-12-2021";
		selectDateByJS(driver, date, dateVal);
		Thread.sleep(10000);
		
	}
	
	public static void selectDateByJS(WebDriver driver, WebElement element, String dateVal) {
		
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].setAttribute('value','"+dateVal+"');", element);
	}
}
