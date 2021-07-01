package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HTMLUnitDriverConcept {
	
	//static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\taimoor\\Downloads\\chromedriver.exe");
		//driver = new ChromeDriver();
		
		//Html Unit driver is not available in Selenium 3.x version
		//htmlunitdriver -- to use this concept, We have to download htmlunitdriver JAR file.
		
		
		//Advantages:
		//1- Testing is happening behind the scenes.
		//2. Very Fast -- execution of test cases really fast(Highest performance)
		
		
		//Limitations:
		//1. Not suitable for actions class -- user actions-- (mousemovement, doubleClick, drag and drop)
		//2. Also known as headless browser or Ghost browser
			//HtmlUnit Driver -- Java
			//PhantomJS -- JavaScript
		WebDriver driver = new HtmlUnitDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://freecrm.com/");
		
		System.out.println("Before Login Title is --> "+driver.getTitle());
		driver.findElement(By.xpath("//span[normalize-space()='Log In']")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[@placeholder='E-mail address']")).clear();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='E-mail address']")).sendKeys("mr.taimoor.rb@gmail.com");
		
		//driver.findElement(By.xpath("//input[@placeholder='Password']")).clear();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("!@#Tahira123");
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
		Thread.sleep(6000);
		String after = driver.getTitle();
		System.out.println("After Login Title is --> "+after);
		
	}

}
