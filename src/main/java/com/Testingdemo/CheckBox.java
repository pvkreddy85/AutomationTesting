package com.Testingdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {
	
	public static void CheckBoxSelect(String ReqCar) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.letskodeit.com/practice");
	
		List<WebElement> AllCheckBoxes=driver.findElements(By.xpath("//label/input[@type='checkbox']"));
		
		for (WebElement CheckBox : AllCheckBoxes) {
		
			String Cars=CheckBox.getAttribute("value");
		
		if (Cars.equals(ReqCar)) {
			
			CheckBox.click();
		   }
		
		}	
	}

     public static void main(String[] args) {
    	 CheckBoxSelect("bmw");
	}

}
