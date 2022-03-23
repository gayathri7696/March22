package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Automation_summarycheckout {
	public static WebDriver driver;
	@FindBy(xpath="//a[@href='http://automationpractice.com/index.php?controller=order&step=1']")
	private WebElement summaryckot;

	public Automation_summarycheckout(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getSummaryckot() {
		return summaryckot;
	}

}
