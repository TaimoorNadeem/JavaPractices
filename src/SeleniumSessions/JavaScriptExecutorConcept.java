package SeleniumSessions;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorConcept {
	
		static WebDriver driver;
	

		public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\taimoor\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://freecrm.com/");
		
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//span[normalize-space()='Log In']")).click();
		driver.findElement(By.xpath("//input[@placeholder='E-mail address']")).sendKeys("mr.taimoor.rb@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("!@#Tahira123");
		//driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
		
		WebElement loginBtn = driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")); //login button
		flash(loginBtn, driver); //Highlights the bug
		drawBorder(loginBtn, driver); //Draw a border
		Thread.sleep(2000);
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		int i=1;
		do {
		FileUtils.copyFile(src, new File("C:\\Users\\Taimoor\\Desktop\\MyPractices\\JavaPractices\\src\\ScreenShots\\ButtonBug("+i+").png"));
		i++;
		}
		while(i<=1); 
		//driver.quit();
		
		//Generate Alert
		
		generateAlert(driver, "There is an issue with login button on login page");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		clickElementByJS(loginBtn, driver); //click on any Element by JavaScript
		Thread.sleep(2000);
		//driver.navigate().refresh(); //1. Refresh the page using selenium
		//Thread.sleep(2000);
		refreshBrowserByJS(driver); //2. Refresh by JavaScriptExecutor
		Thread.sleep(4000);
		System.out.println(getTitleByJS(driver)); //Get the title of the page through JSExecutor
		//Get the page text
		System.out.println(getPageInnerText(driver));
		//scrollPageDown(driver);
		driver.findElement(By.xpath("//i[@class='settings icon']")).click();
		driver.findElement(By.xpath("//i[@class='power icon']")).click();
		Thread.sleep(4000);
		WebElement forgotPassword = driver.findElement(By.linkText("Forgot your password?"));
		scrollIntoView(forgotPassword, driver);
	}
		
		//Library Code for Debugging purpose (Highlight specific element within logIn page)
	
	public static void flash(WebElement element, WebDriver driver) throws IOException {
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		String bgColor = element.getCssValue("backgroundColor");
		for(int i = 1; i < 10; i++) {
			changeColor("rgb(0, 200, 0)", element, driver);
			changeColor(bgColor, element, driver);
		}
	}
	
	public static void changeColor(String color, WebElement element, WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;  
		js.executeScript("arguments[0].style.backgroundColor = '"+color+"'", element);
		try {
			Thread.sleep(20);
		} 
		catch (InterruptedException e) {
		}
	}
	
	public static void drawBorder(WebElement element, WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.border = '3px solid red'", element);
	}
	
	public static void generateAlert(WebDriver driver, String message) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("alert('"+message+"')");
	}
	
	public static void clickElementByJS(WebElement element, WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
	}
	
	public static void refreshBrowserByJS(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("history.go(0)");
	}
	
	public static String getTitleByJS(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String title = js.executeScript("return document.title;").toString();
		return title;
		
	}
	
	public static String getPageInnerText(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String pageText = js.executeScript("return document.documentElement.innerText;").toString();
		return pageText;
	}
	
	public static void scrollPageDown(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}
	
	public static void scrollIntoView(WebElement element, WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		
	}
}
