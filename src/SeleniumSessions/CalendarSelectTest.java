package SeleniumSessions;

import org.openqa.selenium.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CalendarSelectTest {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\taimoor\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.piac.com.pk");
		driver.findElement(By.xpath("//button[@id='popup']//span[@class='im-close']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Schedules']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@role='alert']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='dpd3']")).click();
		
		String date = "31-Sep-1992";
		String dateArray[]=date.split("-");
		String day = dateArray[0];
		String month = dateArray[1];
		
		Select select = new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")));
		select.selectByVisibleText(month);
		
		////*[@id="ui-datepicker-div"]/div[1]/table/tbody/tr[1]/td[2]
		
		String before_xpath = "//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[";
		String after_xpath = "]/td[";
		
		String dayValue = null;
		final int totalWeekDays = 7;
		boolean flag = false;
		
		
		for(int row = 1; row <= 6; row++) {
			for(int col = 1; col <= totalWeekDays; col++) {
				try {
				dayValue = driver.findElement(By.xpath(before_xpath+row+after_xpath+col+"]")).getText();
				}catch(NoSuchElementException e) {
					System.out.println("Please enter a correct date value");
					flag = false;
					break;
				}
				System.out.println(dayValue);
				if(dayValue.equals(day)) {
					
					driver.findElement(By.xpath(before_xpath+row+after_xpath+col+"]")).click();
					flag = true;
					break;					
				}
			}
			if(flag) {
				break;
			}
		}
			
	}

}
