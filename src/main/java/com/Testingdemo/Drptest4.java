package com.Testingdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drptest4 {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new  ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.letskodeit.com/practice");
		
		WebElement carslist=driver.findElement(By.id("carselect"));
		
		Select cars=new Select(carslist);
		
		cars.selectByIndex(2);
		
		WebElement selectoption=cars.getFirstSelectedOption();
		
		System.out.println(selectoption.getText());
	
	    Thread.sleep(3000);
	    
	    String PageTitle=driver.getTitle();
	    
	    System.out.println(PageTitle);
	    
	    String Pageurl=driver.getCurrentUrl();
	    
	    System.out.println(Pageurl);
	    
	    driver.close();
	
	}

}
