package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class BrowserLanuch extends BaseClass1 {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException   {
		
		  driver = getBrowser("chrome");
		
		 getUrl("https://adactinhotelapp.com/");
		WebElement userName = driver.findElement(By.id("username"));
		inputToElement(userName, "dhivyasathan");
		WebElement passWord = driver.findElement(By.id("password"));
		inputToElement(passWord, "divsathan");
		WebElement logIn = driver.findElement(By.name("login"));
		clickOnElement(logIn);
		
		
		
		
		
	}
	
}
