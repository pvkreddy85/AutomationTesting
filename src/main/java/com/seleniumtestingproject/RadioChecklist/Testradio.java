package com.seleniumtestingproject.RadioChecklist;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testradio {
	

public static void Radiobutselect(String Reqcars) {
		 
    WebDriverManager.chromedriver().setup();
    
    WebDriver driver=new ChromeDriver();
    
    driver.manage().window().maximize();
    
    driver.manage().deleteAllCookies();
    
    driver.get("https://www.letskodeit.com/practice");
    
    List<WebElement> selectedcars=driver.findElements(By.xpath("//label/input[@type='radio']"));
		
    for(WebElement cars:selectedcars) {
    	
    	String Selectcar=cars.getAttribute("value");
    	
    	if (Selectcar.equals(Reqcars)) {
    		
    		cars.click();
    		break;
    		
    	 }
       }	
	}

    public static void main(String[] args) throws IOException {
    	Testradio car=new Testradio();
    	Radiobutselect("benz");
    	
    	
		
	
    	
    	
    	
    		
	}
}
