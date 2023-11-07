package com.Testingdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://jqueryui.com/droppable/");
		
		WebElement frames=driver.findElement(By.className("demo-frame"));
   
	    driver.switchTo().frame(frames);
	    
	    WebElement drag=driver.findElement(By.id("draggable"));
	    
	    WebElement drop=driver.findElement(By.id("droppable"));
	    
	    org.openqa.selenium.interactions.Actions action=new org.openqa.selenium.interactions.Actions(driver);
	    
	    action.dragAndDrop(drag, drop).perform(); 
	    
	 
	    
	}

}
