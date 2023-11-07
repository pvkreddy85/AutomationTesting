package com.Testingdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actions {
	
	

	public Actions(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
				
		WebElement doubleclick=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
	
		org.openqa.selenium.interactions.Actions action=new org.openqa.selenium.interactions.Actions(driver);
		
		action.doubleClick(doubleclick).perform();
		
		org.openqa.selenium.Alert alert=driver.switchTo().alert();
		
		String message=alert.getText();
		
		System.out.println(message);
		
		alert.accept();
	   
		
		
	}

}
