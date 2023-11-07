package com.Testingdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiSelect {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.letskodeit.com/practice");
		
		WebElement multi=driver.findElement(By.id("multiple-select-example"));
		
		Select ref=new Select(multi);
		
		ref.selectByIndex(0);
		
		ref.selectByValue("1");
		
		ref.selectByVisibleText("peach");
		
		Thread.sleep(3000);
		
		ref.deselectByVisibleText("peach");
		
		List<WebElement> selected=ref.getAllSelectedOptions();
		
	    for (WebElement webElement : selected) {
	    	
	    	System.out.println(webElement.getText());
			
		}
		
	}

}
