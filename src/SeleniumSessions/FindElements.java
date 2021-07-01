package SeleniumSessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\taimoor\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//How many links are there in a web page?
		//How you can provide text for every link?
		
		
		//Target:
		//Get the total counts on the page
		//Get the text of each link on page
		
		List <WebElement> LinkList = driver.findElements(By.tagName("a"));
		
		System.out.println(LinkList.size());
		
		for(int i = 0; i<LinkList.size(); i++) {
			System.out.println(LinkList.get(i).getText());
			//Will show the blank links as well
		}
		
		//driver.quit();
	}
	
}
