package SeleniumSessions;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindowPopUp {

	public static void main(String[] args) throws InterruptedException {
		
		//Pop-Ups Types
		//1. Alerts -- JavaScript Pop-Up -- Alert API (accept, dismiss)
		//2. File Upload pop up -- Browse Button (if type=file, sendKeys)
		//3. Browse Window pop up - Advertisement pop up(WindowHandler API - getWindowHandles())
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\taimoor\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.webroot.com/services/popuptester1.htm");
		
		Set<String> handler = driver.getWindowHandles();
		
		java.util.Iterator<String> it = handler.iterator();
		
		String parentWindowID = it.next(); 
		
		System.out.println("Parent window id: "+parentWindowID);
		
		String childWindowID = it.next();
		
		System.out.println("Child Window ID: "+childWindowID);
		
		driver.switchTo().window(childWindowID);
		
		System.out.println("Child window pop up title is "+driver.getTitle());
		
		Thread.sleep(6000);
		
		driver.close();
		
		driver.switchTo().window(parentWindowID);
		
		System.out.println("Parent window pop up title is "+driver.getTitle());
		
		Thread.sleep(6000);
		
		driver.findElement(By.xpath("//p[contains(text(),'When you click on a link to go to a desired Websit')]//img[@alt='try test']")).click();
		
		Thread.sleep(3000);
		
		Set<String> hd = driver.getWindowHandles();
		
		java.util.Iterator<String> itr = hd.iterator();
		
		String parent = itr.next();
		
		System.out.println(parent);
		
		String child = itr.next();
		
		System.out.println(child);
		
		driver.switchTo().window(child);
		Thread.sleep(4000);
		driver.close();
		driver.switchTo().window(parent);
		
		Thread.sleep(6000);
		
		driver.quit();

	}

}
