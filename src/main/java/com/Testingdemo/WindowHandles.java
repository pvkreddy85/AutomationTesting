package com.Testingdemo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandles {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.letskodeit.com/practice");
		
		String ParentWindow=driver.getWindowHandle();

	    WebElement windows=driver.findElement(By.id("ParentWindow"));
	    
	    windows.click();
	    
	   Set<String> AllWindows= driver.getWindowHandles();
	   
	   for (String winodw : AllWindows) {
		   
		   driver.switchTo().window(winodw);
		   
		  String Url =driver.getCurrentUrl();
		   
		   if (Url.equals("https://www.letskodeit.com/courses")) {
			   
			   driver.manage().window().maximize();
			
		}
		
	}
	
	
	
	
	}

}
