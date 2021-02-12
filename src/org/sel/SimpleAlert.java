package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlert  {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		 //driver = getBrowser("chrome");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hari\\eclipse-workspace\\SeleniumWork\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//getUrl(url);
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		WebElement simpleAlert = driver.findElement(By.xpath("(//a[@class='analystic'])[1]"));
		simpleAlert.click();
		Thread.sleep(2000);
		
		WebElement clickButton = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		clickButton.click();
		Thread.sleep(2000);

		org.openqa.selenium.Alert simple = driver.switchTo().alert();
		simple.accept();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
