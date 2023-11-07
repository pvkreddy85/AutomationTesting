package com.seleniumtestingproject.RadioChecklist;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Allcheckboxes {
	
	public static void Allcheckboxes(String reqcars) {
		 
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.letskodeit.com/practice");
		
		List<WebElement> allcheckboxs= driver.findElements(By.xpath("//label/input[@type='checkbox']"));
		
		for(WebElement checkboxs:allcheckboxs) {
			
			String checkcars=checkboxs.getAttribute("value");
			
			if (checkcars.equals(reqcars)) {
				
				checkboxs.click();
				break;				
			}
		}
	}
	
           public static void main(String[] args) {
			Allcheckboxes check=new Allcheckboxes();
			Allcheckboxes("benz");
		}
}
