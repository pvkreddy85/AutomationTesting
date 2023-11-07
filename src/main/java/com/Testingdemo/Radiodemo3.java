package com.Testingdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Radiodemo3 {
	
	public void RadioSelect(String ReqCars) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.letskodeit.com/practice");
		
		List<WebElement> AllRadios=driver.findElements(By.xpath("//label/input[@type='radio']"));
		
		for (WebElement Radios : AllRadios) {
			
			String Cars=Radios.getAttribute("value");
			
			if (Cars.equals(ReqCars))
			{
				
				Radios.click();	
			}	
		}
	}

	 public static void main(String[] args) {
		
		 Radiodemo3 ref=new Radiodemo3();
		 
		 ref.RadioSelect("benz");
	}
}
