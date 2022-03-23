package com.logger_demo;

import org.apache.commons.codec.binary.Base64;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Encode_Decode {
	static String decodestring(String pass) {
		byte[] decoded_string=Base64.decodeBase64(pass);
		return(new String(decoded_string)) ;
		
	}
public static void main(String[] args) {
	String str="SD95CF";
	byte[] encoded_string=Base64.encodeBase64(str.getBytes());
	System.out.println("encoded string: "+new String(encoded_string));
	byte[] decoded_string=Base64.decodeBase64(encoded_string);
	System.out.println("decoded string: "+new String(decoded_string));
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Gayathri\\eclipse-workspace\\March22\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://adactinhotelapp.com/");
	WebElement username=driver.findElement(By.id("username"));
	username.sendKeys("Gayathri7696");
	WebElement password=driver.findElement(By.id("password"));
	password.sendKeys(decodestring("U0Q5NUNG"));
	
}
}
