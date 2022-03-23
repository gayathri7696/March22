package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Automation_shipping {
	public static WebDriver driver;
	@FindBy(id="cgv")
	private WebElement terms;
	
	public Automation_shipping(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	public WebElement getTerms() {
		return terms;
	}
	public WebElement getShipping_checkout() {
		return shipping_checkout;
	}
	@FindBy(name="processCarrier")
	private WebElement shipping_checkout;
	

}
