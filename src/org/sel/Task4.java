package org.sel;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Task4 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hari\\eclipse-workspace\\SeleniumWork\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/w3css/w3css_tables.asp");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		System.out.println("----------- particular data ------------");
		WebElement columnData = driver.findElement(By.xpath("//table[@class='w3-table w3-bordered w3-striped w3-border test w3-hoverable']/tbody/tr[1]/th[3]"));
System.out.println(columnData.getText());

WebDriverWait wait = new WebDriverWait(driver, 50);
wait.until(ExpectedConditions.visibilityOf(columnData));

System.out.println("---------------------All Data ------------");
List<WebElement> allData = driver.findElements(By.xpath("//table[@class='w3-table w3-bordered w3-striped w3-border test w3-hoverable']/tbody[2]/tr/td"));
	for (WebElement data : allData) {
		System.out.println(data.getText());
		
	}
	WebDriverWait wait1 = new WebDriverWait(driver, 50);
	wait.until(ExpectedConditions.visibilityOf(columnData));
	
	
	System.out.println("---------------column head ------------");
	List<WebElement> columnHead = driver.findElements(By.xpath("//table[@class='w3-table w3-bordered w3-striped w3-border test w3-hoverable']/tbody[1]/tr/th"));
	for (WebElement data : columnHead) {
		System.out.println(data.getText());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
