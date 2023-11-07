package com.Testingdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClickAlert {
	
	public static void main(String[] args) throws InterruptedException {
	
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.manage().deleteAllCookies();
	
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");

	WebElement rightclick=driver.findElement(By.xpath("//span[text()='right click me']"));
	
	Actions action=new org.openqa.selenium.interactions.Actions(driver);
	
	action.contextClick(rightclick).perform();
	
	WebElement right=driver.findElement(By.xpath("//span[.='Delete']"));
	
	action.click(right).perform();
	
	org.openqa.selenium.Alert alert=driver.switchTo().alert();
	
	String message=alert.getText();
	 
	System.out.println(message);
 
	alert.accept();
	
	Thread.sleep(3000);
	
	driver.close();
	
	}
}
