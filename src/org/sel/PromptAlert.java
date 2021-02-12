package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hari\\eclipse-workspace\\SeleniumWork\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		WebElement promtAlert = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
		promtAlert.click();
		
		WebElement clickButton = driver.findElement(By.xpath("(//button[@class='btn btn-info'])"));
		clickButton.click();
		org.openqa.selenium.Alert alert = driver.switchTo().alert();
		alert.sendKeys("selenium");
		
		alert.accept();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
