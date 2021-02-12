package org.sel;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowsHandling extends BaseClass1 {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hari\\eclipse-workspace\\SeleniumWork\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		WebElement close = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		close.click();
		Thread.sleep(2000);

		WebElement flights = driver.findElement(By.xpath("//a[text()='Flights']"));
		boolean displayed = flights.isDisplayed();
		System.out.println(displayed);
		Thread.sleep(2000);

		Actions ac = new Actions(driver);
		ac.contextClick(flights).perform();
		Thread.sleep(2000);
		
		RobotKey();

		/*Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);*/

		WebElement offerZone = driver.findElement(By.xpath("//a[text()='Offer Zone']"));
		boolean displayed1 = offerZone.isDisplayed();
		System.out.println(displayed1);
		ac.contextClick(offerZone).perform();
		/*r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);*/
		RobotKey();
		Thread.sleep(2000);

		WebElement logIn = driver.findElement(By.xpath("//a[text()='Login']"));
		boolean displayed2 = logIn.isDisplayed();
		System.out.println(displayed2);
		ac.contextClick(logIn).perform();
		/*r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);*/
		RobotKey();
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
		
		String actualTitle = "Here's the amazing journey that you've had with Flipkart";
		for (String id : allId) {
			if (driver.switchTo().window(id).getTitle().equals(actualTitle)) {
				WebElement email = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
				email.sendKeys("123456");
				Thread.sleep(2000);

				WebElement passWord = driver.findElement(By.xpath("(//input[@type='password'])"));
				passWord.sendKeys("asdfghj");
				Thread.sleep(2000);

				WebElement submit = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
				submit.click();
				
				break;
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
