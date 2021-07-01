package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFileUploadPopUp {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Taimoor\\Downloads\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); //launch chrome
		
		driver.get("https://html.com/input-type-file/"); //Selenium does not allow any desktop popup.
		
		driver.findElement(By.xpath("//input[@id='fileupload']")).sendKeys("C:\\Users\\Taimoor\\Downloads\\bleachr app");
		
		driver.quit();

	}

}
