package SeleniumSessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {
	
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
		List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='pcTkSc']"));
		System.out.println("Total number of suggessions "+list.size());
		try {
		for(int i = 0; i<list.size(); i++) {
			String options = list.get(i).getText().toString();
			//Thread.sleep(2000);
			System.out.println(options);
			if(options.contains("testing types")) {
				/*clickOn(driver, driver.findElement(By.xpath("//span[normalize-space()='"+options+"']")), 30);*/
				clickElementByJS(driver.findElement(By.xpath("//span[normalize-space()='"+options+"']")), driver);
			}
		}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		Thread.sleep(10000);
	}
	
	/*public static void clickOn(WebDriver driver, WebElement locator, int timeOut) {
		new WebDriverWait(driver, timeOut).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(locator));
		locator.click();
	}*/
	
	public static void clickElementByJS(WebElement element, WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
	}

}
