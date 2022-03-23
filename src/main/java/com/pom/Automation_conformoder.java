package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Automation_conformoder {
	public static WebDriver driver;
@FindBy(xpath="//button[@class='button btn btn-default button-medium']")
private WebElement oder;
public Automation_conformoder(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver, this);
	
}



public WebElement getOder() {
	return oder;
}
}
