package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpHandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Taimoor\\Downloads\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.name("proceed")).click(); //Clicking on Sign in button
		
		Thread.sleep(5000);
		
		Alert alert = driver.switchTo().alert();
		
		System.out.println(alert.getText());
		
		String alertMessage = "Please enter a valid user name";
		
		if(alert.getText().contentEquals(alertMessage)) {
			System.out.println("Correct Alert Message");
		}
		else {
			System.out.println("In-Correct message");
		}
		
		alert.accept(); //click on OK button
		//alert.dismiss(); //For Cancel button
		
		driver.quit();

	}

}
