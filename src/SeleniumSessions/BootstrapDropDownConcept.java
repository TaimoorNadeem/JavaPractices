package SeleniumSessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropDownConcept {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\taimoor\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.jquery-az.com/jquery/demo.php?ex=152.0_1");
		driver.findElement(By.xpath("//button[normalize-space()='jQuery, JavaScript, CSS']")).click();
		List<WebElement> list = driver.findElements(By.xpath("//ul[@class='dropdown-menu']//li//label"));
		System.out.println(list.size());
		for(int i =0; i<list.size(); i++) {
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().contains("Bootstrap")) {
			Thread.sleep(2000);
			list.get(i).click();
			break;
			}
			
		}
		
	}

}
