package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Automation_homepg {
	public WebDriver driver;
@FindBy(className="login")
private WebElement Signin_btn;
@FindBy(className="sf-with-ul")
private WebElement women;
public WebElement getWomen() {
	return women;
}

public Automation_homepg(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver, this);
	
}

public WebElement getSignin_btn() {
	return Signin_btn;
}
}
