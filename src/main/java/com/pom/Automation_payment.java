package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Automation_payment {
	public static WebDriver driver;
	@FindBy(className="bankwire")
	private WebElement paybybank;

	public Automation_payment(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getPaybybank() {
		return paybybank;
	}
	

}
