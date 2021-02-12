package org.sel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hari\\eclipse-workspace\\SeleniumWork\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		Thread.sleep(2000);
		
		
		
		
		
		System.out.println("===========Table Headings========");
		
		List<WebElement> tableHead = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[1]/th"));
		for (WebElement data : tableHead) {
			System.out.println(data.getText());
			
		}
		
		System.out.println("======Column Size is:===========");
		System.out.println(tableHead.size());
		
		
		
		System.out.println("==========Get Particular Data=========");
		WebElement parData = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[7]/td[2]"));
		System.out.println(parData.getText());
		
		
		
		
		
		
		
		
	}

}
