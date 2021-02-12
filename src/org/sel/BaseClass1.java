package org.sel;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass1 {
	public static WebDriver driver;
	public static WebDriver getBrowser(String browsername) {
		
		try {
			if (browsername.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\hari\\eclipse-workspace\\SeleniumWork\\Drivers\\chromedriver.exe");
				 driver=new ChromeDriver();
				
			}else if (browsername.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver", "C:\\Users\\hari\\eclipse-workspace\\SeleniumWork\\Drivers\\IEDriverServer.exe");
				 driver=new InternetExplorerDriver();
				
			}else {
				System.out.println("Invalid browser name");
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			return driver;
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return driver;
		
		
	}
	
	public static void getUrl(String value) {
		driver.get(value);
		
	}
	
	public static  void inputToElement(WebElement element, String value) {
		try {
			element.sendKeys(value);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

	public static void clickOnElement(WebElement element) {
		try {
			element.click();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
	
	public static void mouseActions(WebElement element) {
		try {
			Actions ac = new Actions(driver);
			ac.moveToElement(element).perform();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
			
	}

public static void selectOnOption(WebElement element, String value, String Option) {
	try {
		Select s = new Select(element);
		if (Option.equalsIgnoreCase("visibletext")) {
			s.selectByVisibleText(value);
			
		}else if (Option.equalsIgnoreCase("value")) {
			s.selectByValue(value);
			
		}else if (Option.equalsIgnoreCase("index")) {
			s.selectByIndex(Integer.parseInt(value));
			
		}
	} catch (NumberFormatException e) {
		
		e.printStackTrace();
	}
	
	}


public static void RobotKey() throws AWTException {
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
}

public static  void navigateTo(String value) {
	try {
		driver.navigate().to(value);
	} catch (Exception e) {
		
		e.printStackTrace();
	}
	
}

public static void navigateBack() {
	try {
		driver.navigate().back();
	} catch (Exception e) {
		
		e.printStackTrace();
	}
	
}

public static void navigateForward() {
	try {
		driver.navigate().forward();
	} catch (Exception e) {
		
		e.printStackTrace();
	}
	
}

public static void navigateRefresh() {
	 try {
		driver.navigate().refresh();
	} catch (Exception e) {
		
		e.printStackTrace();
	}
	
}

/*public static void alert(String Option) {
	if (Option.equalsIgnoreCase("simplealert")) {
		
		
		simpleAlert.click();
		
		clickButton.click();
		

		org.openqa.selenium.Alert simple = driver.switchTo().alert();
		simple.accept();
	}
	
}*/
public static void framesUsingIndex(String Option, int index) {
	try {
		if (Option.equalsIgnoreCase("index")) {
			driver.switchTo().frame(index);
			
		}
	} catch (Exception e) {
		
		e.printStackTrace();
	}
	
}

public static void framesUsingWebElement(String Option, WebElement element) {
	try {
		if (Option.equalsIgnoreCase("webelement")) {
			driver.switchTo().frame(element);
			
		}
	} catch (Exception e) {
		
		e.printStackTrace();
	}
	
}






































}
