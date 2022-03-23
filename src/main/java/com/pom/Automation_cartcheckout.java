package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Automation_cartcheckout {
	public static WebDriver driver;
	@FindBy(xpath="(//a[@href='http://automationpractice.com/index.php?controller=order'])[3]")
	private WebElement checkout;

	

	public Automation_cartcheckout(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}



	public WebElement getCheckout() {
		return checkout;
	}
	

}
