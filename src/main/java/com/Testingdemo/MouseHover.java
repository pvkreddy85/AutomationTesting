package com.Testingdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover {
	
	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.letskodeit.com/practice");
	
	    WebElement mouse=driver.findElement(By.id("mousehover"));
	    
	    org.openqa.selenium.interactions.Actions action= new org.openqa.selenium.interactions.Actions(driver);
	    
	    action.moveToElement(mouse).perform();
	    
	    Thread.sleep(3000);
	    
	    driver.findElement(By.xpath("//a[text()='Reload']")).click();
	    
	    Thread.sleep(3000);
	
        driver.close();
	}

}
