package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Automation_addresscheckout {
	public static WebDriver driver;
	@FindBy(name="processAddress")
	private WebElement addresschout;

	public Automation_addresscheckout(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddresschout() {
		return addresschout;
	}
	

}
