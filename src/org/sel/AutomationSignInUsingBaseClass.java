package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AutomationSignInUsingBaseClass extends BaseClass1 {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		 driver = getBrowser("chrome");
		 getUrl("http://automationpractice.com/index.php");
		
		WebElement signIn = driver.findElement(By.xpath("//a[@class='login']"));
		clickOnElement(signIn);
		
		WebElement emailId = driver.findElement(By.id("email"));
		inputToElement(emailId, "dhivyasathan1212@gmail.com");

		WebElement passWord = driver.findElement(By.id("passwd"));
		inputToElement(passWord, "divsathan123");

		WebElement submit = driver.findElement(By.xpath("//i[@class='icon-lock left']"));
		clickOnElement(submit);

		WebElement womens = driver.findElement(By.xpath("//a[text()='Women']"));
		mouseActions(womens);

		WebElement tshirt = driver.findElement(By.xpath("(//a[text()='T-shirts'])[1]"));
		mouseActions(tshirt);
		clickOnElement(tshirt);
		
		WebElement image = driver.findElement(By.xpath("(//img[@class='replace-2x img-responsive'])[2]"));
		clickOnElement(image);

		WebElement increment = driver.findElement(By.xpath("//i[@class='icon-plus']"));
		clickOnElement(increment);

		WebElement size = driver.findElement(By.name("group_1"));
		selectOnOption(size, "M", "visibletext");

		WebElement color = driver.findElement(By.id("color_13"));
		clickOnElement(color);

		WebElement clickOk = driver.findElement(By.name("Submit"));
		clickOnElement(clickOk);

		WebElement proceedCheckOut = driver.findElement(By.xpath("//a[@class='btn btn-default button button-medium']"));
		clickOnElement(proceedCheckOut);

		WebElement summeryCheck = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
		clickOnElement(summeryCheck);

		WebElement address = driver.findElement(By.name("processAddress"));
		clickOnElement(address);
		
		WebElement agree = driver.findElement(By.name("cgv"));
		clickOnElement(agree);

		WebElement shipping = driver.findElement(By.xpath("//span[contains(text(),'								Proceed to checkout')]"));
		clickOnElement(shipping);

		WebElement payment = driver.findElement(By.xpath("//span[text()=' Payment']"));
		clickOnElement(payment);

		WebElement payByBankWire = driver.findElement(By.xpath("//a[@class=\"bankwire\"]"));
		clickOnElement(payByBankWire);
		
		WebElement confirmOrder = driver.findElement(By.xpath("//span[text()='I confirm my order']"));
		clickOnElement(confirmOrder);
		

}
}
