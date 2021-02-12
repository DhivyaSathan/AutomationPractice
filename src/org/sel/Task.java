package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class Task {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hari\\eclipse-workspace\\SeleniumWork\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		Thread.sleep(2000);
		driver.get("https://www.homedepot.com/b/India-Ink/N-5yc1vZ5oj");
		driver.manage().window().maximize();
		
		WebElement allDepartment = driver.findElement(By.xpath("(//a[@data-id='departmentsFlyout'])[1]"));
		Actions ac = new Actions(driver);
		ac.moveToElement(allDepartment).perform();
		Thread.sleep(2000);

		WebElement cellingFans = driver.findElement(By.xpath("(//a[text()='Lighting & Ceiling Fans'])[1]"));
		ac.moveToElement(cellingFans).perform();
		Thread.sleep(2000);

		WebElement cellingFansAccess = driver.findElement(By.xpath("(//a[text()='Ceiling Fans & Accessories'])[1]"));
		ac.moveToElement(cellingFansAccess).perform();
		Thread.sleep(2000);

		WebElement cellingFanRemote = driver.findElement(By.xpath("(//a[text()='Ceiling Fans With Remotes'])"));
		ac.moveToElement(cellingFanRemote).perform();
		ac.click(cellingFanRemote).perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
		
				
		
	}



