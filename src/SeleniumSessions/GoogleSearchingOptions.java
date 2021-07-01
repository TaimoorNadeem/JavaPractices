package SeleniumSessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchingOptions {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\taimoor\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://google.com/");
		
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("testing");
		List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@role='option']"));
		System.out.println("Total number of search queries "+list.size());
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).getText());
			Thread.sleep(2000);
			if(list.get(i).getText().equals("testing types")) {
			list.get(i).click();
			break;
			}
			
		}
	}

}
