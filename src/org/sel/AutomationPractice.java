package org.sel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutomationPractice {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hari\\eclipse-workspace\\SeleniumWork\\Drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/search?q=automation+practice&rlz=1C1CHBF_enIN851IN851&oq=automation+prac&aqs=chrome.0.0i457j0j69i57j0l2j69i60l3.7616j0j7&sourceid=chrome&ie=UTF-8");
		WebElement automation = driver.findElement(By.xpath("//span[text()='Automation Practice']"));
		automation.click();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		WebElement signIn = driver.findElement(By.xpath("//a[@class='login']"));
		signIn.click();
		
		Thread.sleep(2000);
		WebElement email = driver.findElement(By.id("email_create"));
		email.sendKeys("dhivyasathan1212@gmail.com");
		
		Thread.sleep(2000);
		WebElement submit = driver.findElement(By.id("SubmitCreate"));
		submit.click();
		

WebElement intial = driver.findElement(By.xpath("(//label[@class='top'])[2]"));
		intial.click();
		
		Thread.sleep(2000);
		WebElement fName = driver.findElement(By.name("customer_firstname"));
		fName.sendKeys("Dhivya");
		
		Thread.sleep(2000);
		
		WebElement lName = driver.findElement(By.name("customer_lastname"));
		lName.sendKeys("Sathan");
		
		Thread.sleep(2000);
		
		
		Thread.sleep(2000);
		WebElement passWord = driver.findElement(By.name("passwd"));
		passWord.sendKeys("divsathan123");
		
		Thread.sleep(2000);
		WebElement day = driver.findElement(By.id("days"));
		Select s=new Select(day);
		s.selectByIndex(2);
		
		Thread.sleep(2000);
		WebElement month = driver.findElement(By.id("months"));
		Select s1=new Select(month);
		s1.selectByValue("6");
		
		Thread.sleep(2000);
		WebElement year = driver.findElement(By.name("years"));
		Select s2=new Select(year);
		s2.selectByValue("1992");
		
		Thread.sleep(2000);
		WebElement firstName = driver.findElement(By.name("firstname"));
		firstName.sendKeys("Dhivya");
		
		Thread.sleep(2000);
		WebElement lastName = driver.findElement(By.id("lastname"));
		lastName.sendKeys("Sathan");
		
		Thread.sleep(2000);
		WebElement company = driver.findElement(By.id("company"));
		company.sendKeys("GreenTech");
		
		Thread.sleep(2000);
		WebElement address = driver.findElement(By.name("address1"));
		address.sendKeys("8A, modhilal nehru street");
		
		Thread.sleep(2000);
		WebElement address2 = driver.findElement(By.name("address2"));
		address2.sendKeys("needamangalam");
		
		Thread.sleep(2000);
		WebElement address3 = driver.findElement(By.name("city"));
		address3.sendKeys("Tiruvarur");
		
		Thread.sleep(2000);
		WebElement state = driver.findElement(By.name("id_state"));
		Select s3=new Select(state);
		s3.selectByValue("5");
		
		Thread.sleep(2000);
		WebElement postCode = driver.findElement(By.name("postcode"));
		postCode.sendKeys("00000");
		
		Thread.sleep(2000);
		WebElement country = driver.findElement(By.name("id_country"));
		Select s4=new Select(country);
		s4.selectByValue("21");
		
		Thread.sleep(2000);
		WebElement addtional = driver.findElement(By.name("other"));
		addtional.sendKeys("nothing to write");

		Thread.sleep(2000);
		WebElement homePhone = driver.findElement(By.name("phone"));
		homePhone.sendKeys("04374 223344");

		Thread.sleep(2000);
		WebElement mobNum = driver.findElement(By.name("phone_mobile"));
		mobNum.sendKeys("9789310980");
		
				
		Thread.sleep(2000);
		WebElement register = driver.findElement(By.xpath("//span[text()='Register']"));
		register.click();
		
		Thread.sleep(2000);
		WebElement signOut = driver.findElement(By.xpath("//a[@class='logout']"));
		signOut.click();
		
		
		
			
		
	}

}
