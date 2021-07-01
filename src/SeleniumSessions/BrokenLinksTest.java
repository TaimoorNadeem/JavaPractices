package SeleniumSessions;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinksTest {
	
	public static WebDriver driver;

	public static void main(String[] args) throws MalformedURLException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\taimoor\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://freecrm.com/");
		driver.findElement(By.xpath("//span[normalize-space()='Log In']")).click();
		driver.findElement(By.xpath("//input[@placeholder='E-mail address']")).sendKeys("mr.taimoor.rb@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("!@#Tahira123");
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Contacts']")).click();
		driver.findElement(By.xpath("//th[@class='left aligned']")).click();
		// Add all the links and images in list
		List<WebElement> Linkslist = driver.findElements(By.tagName("a"));
		List<WebElement> activeLinks = new ArrayList<WebElement>();
		Linkslist.addAll(driver.findElements(By.tagName("img")));
		for(int i = 0; i < Linkslist.size(); i++) {
			if(Linkslist.get(i).getAttribute("href") != null) { //Exclude all the links/images - does not have any href attribute
			
				activeLinks.add(Linkslist.get(i));
			} 
		}
		 
		//get the size of active link list:
		System.out.println("Size of active links and images --->" + activeLinks.size());
		
		for(int j = 0; j<activeLinks.size(); j++) {
			HttpURLConnection connection = (HttpURLConnection)new URL(activeLinks.get(j).getAttribute("href")).openConnection();
			connection.connect();
			String response = connection.getResponseMessage();
			connection.disconnect();
			System.out.println(activeLinks.get(j).getAttribute("href") + "---> " + response);
		}
	}

}
