package com.Testingdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		 
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.letskodeit.com/practice");
		
		driver.findElement(By.id("name")).sendKeys("Testing Demo");
		
		driver.findElement(By.id("alertbtn")).click();
	
	    org.openqa.selenium.Alert alert=driver.switchTo().alert();
	    
	    String Message=alert.getText();
	    
	    System.out.println(Message);
	    
	    alert.accept();
	    
	    Thread.sleep(3000);
	    
	    driver.close();
	    
	    
	    
	    
	    
	   
	
	}
	

}
