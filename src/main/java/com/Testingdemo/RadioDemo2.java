package com.Testingdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioDemo2 {
	
	public void radioselect(String Reqcars) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.letskodeit.com/practice");
		
		List<WebElement> allradio=driver.findElements(By.xpath("//label/input[@type='radio']"));
	
	    for (WebElement cars : allradio) {
       
	    String car=cars.getAttribute("value");
	    
	    if (car.equals(Reqcars)) 
	    {
	    	
	    	cars.click();			
		  }
	    	
		}
	}
	
    public static void main(String[] args) {
		
    	RadioDemo2 ref=new RadioDemo2();
    	ref.radioselect("bmw");  	
	}
}
