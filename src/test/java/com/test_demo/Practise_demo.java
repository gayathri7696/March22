package com.test_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Main_demo.Base_class;

public class Practise_demo extends Base_class {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver=browser_configuration("chrome");
		
	/*

		geturl("http://leafground.com/");
		
		//mouse Hover
		WebElement mouse_over=driver.findElement(By.xpath("//a[@href='pages/mouseOver.html']"));
		click(mouse_over);
		WebElement testleaf_course=driver.findElement(By.className("btnMouse"));
		click(testleaf_course);
		mouse_hover(testleaf_course);
		//String s=testleaf_course.getText();
		//System.out.println(s);
		WebElement list =driver.findElement(By.xpath("(//a[@href='#'])[2]"));
		click(list);
		Thread.sleep(2000);
		alert("accept");
		
		navigate("http://leafground.com/home.html");
		
		//frames
		WebElement frames=driver.findElement(By.xpath("//a[@href='pages/frame.html']"));
		click(frames);
		frame_in(0);
		WebElement click=driver.findElement(By.id("Click"));
		click(click);
		frame_out();
		frame_in(1);
		frame_in(0);
		WebElement nested_frames=driver.findElement(By.id("Click1"));
		click(nested_frames);
		
		
		
		*/
	
		
		geturl("https://www.hyrtutorials.com/p/window-handles-practice.html");
		WebElement w1=driver.findElement(By.id("newWindowBtn"));
		click(w1);
		window_handles(1);
		WebElement first_name=driver.findElement(By.id("firstName"));
		sendkeys(first_name, "gayathri");
		window_handles(0);
		WebElement w2=driver.findElement(By.id("newWindowsBtn"));
		click(w2);
		window_handles(1);
		 
		
	}

}
