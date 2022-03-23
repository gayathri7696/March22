package com.test_demo;

import java.awt.event.ActionEvent;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Main_demo.Base_class;
import com.logger_demo.Property_Configuration;
import com.object.Page_Object_Manager;
import com.pom.Automation_addresscheckout;
import com.pom.Automation_addtocart;
import com.pom.Automation_cartcheckout;
import com.pom.Automation_conformoder;
import com.pom.Automation_homepg;
import com.pom.Automation_loginpg;
import com.pom.Automation_payment;
import com.pom.Automation_shipping;
import com.pom.Automation_summarycheckout;
import com.pom.Automation_womenpg;
public class Automation_Runner extends Base_class {
	public static WebDriver driver=browser_configuration("chrome");
	public static Page_Object_Manager pom=new Page_Object_Manager(driver);
	public static Logger log=Logger.getLogger(Property_Configuration.class);
	public static void main(String[] args) throws InterruptedException, IOException {
		PropertyConfigurator.configure("log4j.properties");
		geturl("http://automationpractice.com/index.php");
		log.info("Automation Url launch");
		wait(10,TimeUnit.SECONDS);
		pom.get_Instance_Hp().getSignin_btn();
		click(pom.get_Instance_Hp().getSignin_btn());
		pom.get_Instance_loginpg().getEmail();
		String username=particular_celldata("C:\\Users\\Gayathri\\eclipse-workspace\\March22\\Automation test case.xlsx", 2, 5);
		sendkeys(pom.get_Instance_loginpg().getEmail(),username);
		pom.get_Instance_loginpg().getPassword();
		String password=particular_celldata("C:\\Users\\Gayathri\\eclipse-workspace\\March22\\Automation test case.xlsx", 8, 5);
		sendkeys(pom.get_Instance_loginpg().getPassword(), password);
		pom.get_Instance_loginpg().getSignin_btn();
		click(pom.get_Instance_loginpg().getSignin_btn());
		pom.get_Instance_Hp().getWomen();
		click(pom.get_Instance_Hp().getWomen());
		pom.get_Instance_womenpg().getComposition();
		scroll(pom.get_Instance_womenpg().getComposition());
		pom.get_Instance_womenpg().getImage();
		click(pom.get_Instance_womenpg().getImage());
		pom.get_Instance_cart().getAddtocart();
		
		click(pom.get_Instance_cart().getAddtocart());
		pom.get_Instance_cc().getCheckout();
		click(pom.get_Instance_cc().getCheckout());
		pom.get_Instance_sumcc().getSummaryckot();
		click(pom.get_Instance_sumcc().getSummaryckot());
		pom.get_Instance_addresscc().getAddresschout();
		click(pom.get_Instance_addresscc().getAddresschout());
		pom.get_Instance_shipping().getTerms();
		click(pom.get_Instance_shipping().getTerms());
		pom.get_Instance_shipping().getShipping_checkout();
		click(pom.get_Instance_shipping().getShipping_checkout());
		pom.get_Instance_payment().getPaybybank();
		click(pom.get_Instance_payment().getPaybybank());
		pom.get_Instance_order().getOder();
		click(pom.get_Instance_order().getOder());
		screenshot("img4.png");
		log.info("oder is booked for automation");
		log.warn("no warning");
		log.error("no error");
		close();

		
		
		
		
		
		/*geturl("http://leafground.com/");
		WebElement alert=driver.findElement(By.xpath("(//a[@class='wp-categories-link maxheight'])[9]"));
		click(alert);
		WebElement alertbox=driver.findElement(By.xpath("//button[@onclick='normalAlert()']"));
		click(alertbox);
		Thread.sleep(3000);
		alert("accept");
		WebElement conformbox=driver.findElement(By.xpath("//button[@onclick='confirmAlert()']"));
		click(conformbox);
		Thread.sleep(3000);
		alert("decline");
		WebElement prompt=driver.findElement(By.xpath("//button[@onclick='confirmPrompt()']"));
		click(prompt);
		Thread.sleep(3000);
		alert("prompt");
		*/
		
	}
}
