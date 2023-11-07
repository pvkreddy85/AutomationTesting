package com.seleniumtestingproject.RadioChecklist;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import testingcheckandradiobutoons.checkboxselect;

public class Checkboxselect {

	
	public static void testingcheck(String reqcars) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.letskodeit.com/practice");
		
		List<WebElement> selectcheckbox=driver.findElements(By.xpath("//label/input[@type='checkbox']"));
		
		for(WebElement checkboxs:selectcheckbox) {
			
			String carsselect=checkboxs.getAttribute("id");
			
			if(carsselect.equals(reqcars)) {
				
				checkboxs.click();
				break;
				
			}
		}
	}
        
         public static void main(String[] args) {
			Checkboxselect Test1=new Checkboxselect();
			testingcheck("hondacheck");
		}

}


