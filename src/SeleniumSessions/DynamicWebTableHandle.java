package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTableHandle {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\taimoor\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://ui.cogmento.com/");
		driver.findElement(By.xpath("//input[@placeholder='E-mail address']")).sendKeys("mr.taimoor.rb@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("!@#Tahira123");
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
		
		driver.findElement(By.xpath("//span[normalize-space()='Contacts']")).click();
		driver.findElement(By.xpath("//th[@class='left aligned']")).click();
		
		////*[@id="main-content"]/div/div[2]/div/table/tbody/tr[1]/td[2]/a
		////*[@id="main-content"]/div/div[2]/div/table/tbody/tr[2]/td[2]/a
		////*[@id="main-content"]/div/div[2]/div/table/tbody/tr[3]/td[2]/a
		////*[@id="main-content"]/div/div[2]/div/table/tbody/tr[4]/td[2]/a

		/*try {
		String before_xpath = "//*[@id=\"main-content\"]/div/div[2]/div/table/tbody/tr[";
		String after_xpath = "]/td[2]/a";
		
		
		for(int i=1; i<=4; i++) {
			String name = driver.findElement(By.xpath(before_xpath + i + after_xpath)).getText();
			System.out.println(name);
			if(name.contains("Junaid Nadeem")) {
				driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div[2]/div/table/tbody/tr["+i+"]/td[1]/a")).click();
			}
			Thread.sleep(5000);
		}
		}
		catch(Exception e) {
			
		}*/
		//2. Method 2
		//Dynamic xPath --> //a[text()='Junaid Nadeem']//parent::td//preceding-sibling::td//div[@class='ui fitted read-only checkbox']//input[@name='id' and @type='checkbox']
		driver.findElement(By.xpath("//td[normalize-space()='Stree 5, Sargodha, Pakistan, 40000, Pakistan']")).click();
		Thread.sleep(3000);
		driver.quit();
		
	}

}
