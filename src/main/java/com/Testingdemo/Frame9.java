package com.Testingdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frame9 {
	
	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://letcode.in/frame");
	
	    WebElement Frame=driver.findElement(By.xpath("//iframe[@name='firstFr']"));
	    
	    driver.switchTo().frame(Frame);
	    
	    driver.findElement(By.name("fname")).sendKeys("Vijay Kumar");
	    
	    driver.findElement(By.name("lname")).sendKeys("Reddy");
	    
	    WebElement Frame2=driver.findElement(By.xpath("//iframe[@src='innerFrame']"));
	    
	    driver.switchTo().frame(Frame2);
	    
	    driver.findElement(By.name("email")).sendKeys("pvkreddy85@gmail.com");
	    
	    driver.switchTo().defaultContent();
	    
	    Thread.sleep(3000);
	    
	    driver.findElement(By.xpath("//a[text()='Watch tutorial']")).click();
	    
	   
	    
	 
	    
	    
	
	
	
	
	
	}

}
