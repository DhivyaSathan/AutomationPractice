package org.sel;

import java.awt.AWTException;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.sun.glass.ui.Robot;

public class RobotDemo {
	public static void main(String[] args) throws AWTException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hari\\eclipse-workspace\\SeleniumWork\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement bestSellers = driver.findElement(By.xpath("(//a[@class='nav-a  '])[1]"));
		boolean displayed = bestSellers.isDisplayed();
		System.out.println(displayed);
		Thread.sleep(2000);
		Actions ac = new Actions(driver);
		ac.contextClick(bestSellers).perform();
		Thread.sleep(2000);
        java.awt.Robot r = new java.awt.Robot();
        r.keyPress(KeyEvent.VK_DOWN);
        r.keyRelease(KeyEvent.VK_DOWN);
        Thread.sleep(2000);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
		WebElement todayDeal = driver.findElement(By.xpath("(//a[@class='nav-a  '])[2]"));
		boolean displayed1 = todayDeal.isDisplayed();
		System.out.println(displayed1);
		ac.contextClick(todayDeal).perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		WebElement mobiles = driver.findElement(By.xpath("(//a[@class='nav-a  '])[3]"));
		boolean displayed2 = mobiles.isDisplayed();
		System.out.println(displayed2);
		ac.contextClick(mobiles).perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		WebElement newRealse = driver.findElement(By.xpath("(//a[@class='nav-a  '])[4]"));
		boolean displayed3 = newRealse.isDisplayed();
		System.out.println(displayed3);
		ac.contextClick(newRealse).perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		WebElement signIn = driver.findElement(By.id("nav-link-accountList"));
		boolean displayed4 = signIn.isDisplayed();
		System.out.println(displayed4);
		ac.contextClick(signIn).perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);

		String pId = driver.getWindowHandle();
		System.out.println(pId);
		String pTitle = driver.switchTo().window(pId).getTitle();
		System.out.println(pTitle);
		Thread.sleep(2000);

		Set<String> allId = driver.getWindowHandles();
		System.out.println(allId);
		for (String id : allId) {
			String allTitle = driver.switchTo().window(id).getTitle();
			System.out.println(allTitle);
			
		}
		Thread.sleep(2000);

		
		String actualTitle="Amazon Sign In" ;
		for (String id : allId) {
			if (driver.switchTo().window(id).getTitle().equals(actualTitle)) {
				WebElement phoneNum = driver.findElement(By.xpath("//input[@type='email']"));
				phoneNum.sendKeys("1234567");
				WebElement submit = driver.findElement(By.id("continue"));
				submit.click();
				break;
				
			}
			
		}
				
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
