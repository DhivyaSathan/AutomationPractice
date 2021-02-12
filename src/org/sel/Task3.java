package org.sel;

import java.awt.AWTException;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.sun.corba.se.spi.orbutil.fsm.Action;
import com.sun.glass.ui.Robot;

public class Task3 {
	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hari\\eclipse-workspace\\SeleniumWork\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.in/");
		
		WebElement bestSeller = driver.findElement(By.xpath("(//a[@class='nav-a  '])[1]"));
		Actions ac =new Actions(driver);
		ac.moveToElement(bestSeller).perform();
		ac.contextClick(bestSeller).perform();
		java.awt.Robot r = new java.awt.Robot();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement todayDeal = driver.findElement(By.xpath("(//a[@class='nav-a  '])[2]"));
		ac.contextClick(todayDeal).perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement mobiles = driver.findElement(By.xpath("(//a[@class='nav-a  '])[3]"));
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		String pId = driver.getWindowHandle();
		System.out.println(pId);
		
		String pTitle = driver.switchTo().window(pId).getTitle();
		System.out.println(pTitle);
		
		Set<String> allId = driver.getWindowHandles();
		System.out.println(allId);
		
		String actualTitle = "Amazon.in Today's Deals: Great Savings. Every Day.";
		for (String id : allId) {
			if (driver.switchTo().window(id).equals(actualTitle)) {
				WebElement enter = driver.findElement(By.xpath("//img[@alt='OP8T']"));
				enter.click();
				
			}
			
		}
		
		
				
		
		



















		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
