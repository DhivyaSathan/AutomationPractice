package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javafx.scene.control.Alert;

public class ConfirmAlert {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hari\\eclipse-workspace\\SeleniumWork\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		WebElement confirmAlert = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		confirmAlert.click();
		
		WebElement clickButton = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		clickButton.click();
		
		//org.openqa.selenium.Alert cAlert = driver.switchTo().alert();
		//cAlert.accept();
		
		
		org.openqa.selenium.Alert cAlert = driver.switchTo().alert();
		cAlert.dismiss();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
