package org.sel;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task2 {

public static void main(String[] args) throws InterruptedException, IOException  {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hari\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
WebDriver driver=new ChromeDriver();	

driver.get("https://www.facebook.com/");
WebElement cAcnt = driver.findElement(By.id("u_0_2"));
cAcnt.click();

driver.manage().window().maximize();

Thread.sleep(4000);
WebElement fName = driver.findElement(By.name("firstname"));
fName.sendKeys("dhivya");

Thread.sleep(2000);

WebElement lName = driver.findElement(By.name("lastname"));
lName.sendKeys("sathan");

Thread.sleep(2000);

WebElement eMail = driver.findElement(By.name("reg_email__"));
eMail.sendKeys("dhivyasathan@gmail.com");

Thread.sleep(2000);
WebElement rePassword = driver.findElement(By.name("reg_email_confirmation__"));
rePassword.sendKeys("dhivyasathan@gmail.com");
Thread.sleep(2000);

WebElement passWord = driver.findElement(By.name("reg_passwd__"));
passWord.sendKeys("divsathan");

Thread.sleep(2000);

WebElement day = driver.findElement(By.id("day"));
Select s=new Select(day);
s.selectByValue("2");

Thread.sleep(2000);

WebElement month = driver.findElement(By.name("birthday_month"));
Select s1=new Select(month);
s1.selectByValue("6");

Thread.sleep(2000);

WebElement year = driver.findElement(By.name("birthday_year"));
Select s2=new Select(year);
s2.selectByVisibleText("1992");

Thread.sleep(2000);

WebElement sex = driver.findElement(By.xpath("//label[text()='Female']"));
sex.click();

Thread.sleep(2000);

WebElement submit = driver.findElement(By.name("websubmit"));
submit.click();


TakesScreenshot ts= (TakesScreenshot) driver;
File srcFile = ts.getScreenshotAs(OutputType.FILE);
File resFile = new File("C:\\Users\\hari\\eclipse-workspace\\Selenium\\Screenshot\\sample2.png");
FileUtils.copyFile(srcFile, resFile);





	
	
	
}
		
		
	}

