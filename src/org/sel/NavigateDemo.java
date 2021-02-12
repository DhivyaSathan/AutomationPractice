package org.sel;

import org.openqa.selenium.WebDriver;

public class NavigateDemo extends BaseClass1{
	public static WebDriver driver;
	public static void main(String[] args) {
		 driver = getBrowser("chrome");
		 getUrl("https://www.facebook.com/");
		 navigateTo("https://www.amazon.in/");
		 navigateBack();
		 navigateForward();
		 navigateRefresh();
	}

}
