package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingleFrames extends BaseClass {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		// WebDriver driver = getBrowser("chrome");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hari\\eclipse-workspace\\SeleniumWork\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 
		 getUrl("https://v1.hdfcbank.com/assets/popuppages/netbanking.htm");
		
		//driver.get("https://v1.hdfcbank.com/assets/popuppages/netbanking.htm");
		
		WebElement continu = driver.findElement(By.xpath("(//a[text()='Continue to NetBanking'])[2]"));
		continu.click();
		
		
		
		driver.switchTo().frame("login_page");
		
		WebElement customerId = driver.findElement(By.name("fldLoginUserId"));
		customerId.sendKeys("asdfg");
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
