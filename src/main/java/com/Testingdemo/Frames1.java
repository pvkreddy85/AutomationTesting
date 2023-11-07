package com.Testingdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames1 {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://jqueryui.com/droppable/");
		
		WebElement Frame=driver.findElement(By.className("demo-frame"));
	
	    driver.switchTo().frame(Frame);
	    
	    WebElement drap=driver.findElement(By.id("draggable"));
	
	    WebElement drop=driver.findElement(By.id("droppable"));
	    
	    Actions action =new Actions(driver);
	    
	    action.dragAndDrop(drap, drop).perform();
	
	}

}
