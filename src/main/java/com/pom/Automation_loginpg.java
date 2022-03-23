package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Automation_loginpg {
	public WebDriver driver;
	@FindBy(id="email")
	private WebElement email;
	public Automation_loginpg(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getSignin_btn() {
		return signin_btn;
	}
	@FindBy(name="passwd")
	private WebElement password;
	@FindBy(id="SubmitLogin")
	private WebElement signin_btn;

}
