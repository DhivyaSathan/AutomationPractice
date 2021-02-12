package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseHover {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hari\\eclipse-workspace\\SeleniumWork\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		Thread.sleep(2000);
		
		WebElement dresses = driver.findElement(By.xpath("(//a[text()='Dresses'])[2]"));
		Actions ac=new Actions(driver);
		ac.moveToElement(dresses).perform();
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(dresses));
		WebElement eveDress = driver.findElement(By.xpath("(//a[text()='Evening Dresses'])[2]"));
		ac.moveToElement(eveDress).click().perform();
		
		
		
		
		
		
		
		
		
		
	}

}
