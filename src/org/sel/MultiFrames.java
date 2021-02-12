package org.sel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiFrames extends BaseClass1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hari\\eclipse-workspace\\SeleniumWork\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Frames.html");
		Thread.sleep(2000);
		WebElement multiFrame = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		multiFrame.click();
		Thread.sleep(2000);

		WebElement frame1 = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		//driver.switchTo().frame(frame1);
		framesUsingWebElement("webelement", frame1);
		Thread.sleep(2000);
		
		WebElement frame2 = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html'][contains(@style,'height: 250px;')]"));
		//driver.switchTo().frame(frame2);
		framesUsingWebElement("webelement", frame2);

		

		WebElement textBox = driver.findElement(By.xpath("(//input[@type='text'])"));
textBox.sendKeys("selenium");

List<WebElement> noOfFrames = driver.findElements(By.tagName("iframe"));
System.out.println(noOfFrames.size());


		
		
		
		
		
		
	}

}
