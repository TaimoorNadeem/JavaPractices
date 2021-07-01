package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropdown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Taimoor\\Downloads\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.symbios.pk/register");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("Taimoor Nadeem"); // Relative xPath example
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("05/30/1992");
		
		driver.findElement(By.xpath("//a[normalize-space()='30']")).click();
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("mr.taimoor.rb@gmail.com");
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("!@#Tahira123");
		
		driver.findElement(By.xpath("//input[@id='confirm']")).sendKeys("!@#Tahira123");
		
		Select country = new Select(driver.findElement(By.id("country_id")));
		
		country.selectByVisibleText("Pakistan");
		
		Select zone = new Select(driver.findElement(By.id("zone_id")));
		
		zone.selectByVisibleText("Islamabad Capital Territory");
		
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Islamabad");
		
		driver.findElement(By.xpath("//input[@id='telephone']")).sendKeys("0483728142");
		
		driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys("+923208823907");
		
		driver.findElement(By.xpath("//textarea[@id='address_1']")).sendKeys("Plot 292, I-9/3, Street 3");
		
		Thread.sleep(10000);
		
		WebElement ignoreEmail = driver.findElement(By.id("newsletter"));
		
		if(ignoreEmail.isSelected() == true) {
			System.out.println("User is subscribed for the News Letter Emails");
		}
		else {
			System.out.println("User haven't subscribed for the News Letter Emails");
		}
		
		driver.findElement(By.xpath("//input[@name='agree']")).click();
		
		driver.findElement(By.xpath("//input[@name='agree']")).click();
		
		driver.findElement(By.xpath("//button[normalize-space()='Sign Up']")).click();
		
		Thread.sleep(10000);
		
		/*Alert alert = driver.switchTo().alert(); //Capture alert message
		
		if(alert.getText() == "Warning: E-Mail Address is already registered!.") {
			System.out.println("You are already registered with this email");
		}*/
		
		driver.quit();

	}

}
