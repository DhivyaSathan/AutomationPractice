package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AutomationPracticeSignIn extends BaseClass1 {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		/*System.setProperty("webdriver.chrome.driver", "C:\\Users\\hari\\eclipse-workspace\\SeleniumWork\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();*/
		
		 driver = getBrowser("chrome");
		 
		//driver.get("http://automationpractice.com/index.php");
		 getUrl("http://automationpractice.com/index.php");
		
		
		//driver.manage().window().maximize();
		
		WebElement signIn = driver.findElement(By.xpath("//a[@class='login']"));
		//signIn.click();
		clickOnElement(signIn);
		
		
		WebElement emailId = driver.findElement(By.id("email"));
		//emailId.sendKeys("dhivyasathan1212@gmail.com");
		//Thread.sleep(2000);
		inputToElement(emailId, "dhivyasathan1212@gmail.com");

		WebElement passWord = driver.findElement(By.id("passwd"));
		//passWord.sendKeys("divsathan123");
		//Thread.sleep(2000);
		inputToElement(passWord, "divsathan123");

		WebElement submit = driver.findElement(By.xpath("//i[@class='icon-lock left']"));
		//submit.click();
		//Thread.sleep(2000);
		clickOnElement(submit);

		WebElement womens = driver.findElement(By.xpath("//a[text()='Women']"));
		//Actions ac = new Actions(driver);
		//ac.moveToElement(womens).perform();
		//Thread.sleep(2000);
		mouseActions(womens);

		WebElement tshirt = driver.findElement(By.xpath("(//a[text()='T-shirts'])[1]"));
		//ac.moveToElement(tshirt).perform();
		//ac.click(tshirt).perform();
		mouseActions(tshirt);
		clickOnElement(tshirt);
		
		
		WebElement image = driver.findElement(By.xpath("(//img[@class='replace-2x img-responsive'])[2]"));
		//ac.click(image).perform();
		//Thread.sleep(2000);
		clickOnElement(image);

		WebElement increment = driver.findElement(By.xpath("//i[@class='icon-plus']"));
		//ac.click(increment).perform();
		//Thread.sleep(2000);
		clickOnElement(increment);

		WebElement size = driver.findElement(By.name("group_1"));
		//Select s = new Select(size);
		//s.selectByVisibleText("M");
		//Thread.sleep(2000);
		selectOnOption(size, "M", "visibletext");

		WebElement color = driver.findElement(By.id("color_13"));
		//color.click();
		//Thread.sleep(2000);
		clickOnElement(color);

		WebElement clickOk = driver.findElement(By.name("Submit"));
		//clickOk.click();
		//Thread.sleep(2000);
		clickOnElement(clickOk);

		WebElement proceedCheckOut = driver.findElement(By.xpath("//a[@class='btn btn-default button button-medium']"));
		//proceedCheckOut.click();
		//Thread.sleep(3000);
		clickOnElement(proceedCheckOut);

		WebElement summeryCheck = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
		//summeryCheck.click();
		//Thread.sleep(3000);
		clickOnElement(summeryCheck);

		WebElement address = driver.findElement(By.name("processAddress"));
		//address.click();
		//Thread.sleep(3000);
		clickOnElement(address);
		
		WebElement agree = driver.findElement(By.name("cgv"));
		//agree.click();
		clickOnElement(agree);
		

		WebElement shipping = driver.findElement(By.xpath("//span[contains(text(),'								Proceed to checkout')]"));
		//shipping.click();
		//Thread.sleep(3000);
		clickOnElement(shipping);

		WebElement payment = driver.findElement(By.xpath("//span[text()=' Payment']"));
		//payment.click();
		//Thread.sleep(3000);
		clickOnElement(payment);

		WebElement payByBankWire = driver.findElement(By.xpath("//a[@class=\"bankwire\"]"));
		//payByBankWire.click();
		clickOnElement(payByBankWire);
		
		WebElement confirmOrder = driver.findElement(By.xpath("//span[text()='I confirm my order']"));
		//confirmOrder.click();
		clickOnElement(confirmOrder);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
