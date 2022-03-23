package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Automation_addtocart {
	public static WebDriver driver;
	@FindBy(xpath="(//span[text()='Add to cart'])[1]")
	 private WebElement addtocart;
	 
	public WebElement getAddtocart() {
		return addtocart;
	}

	public Automation_addtocart(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	

}
