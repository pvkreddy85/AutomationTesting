package com.Testingdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frame7 {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		
		WebElement TxtBox=driver.findElement(By.className("frmTextBox"));
	
	    org.openqa.selenium.interactions.Actions action=new org.openqa.selenium.interactions.Actions(driver);
	    
	    action.moveToElement(TxtBox).perform();
	    
	    WebElement Frame=driver.findElement(By.id("frm2"));
	    
	    driver.switchTo().frame(Frame);
	    
	    WebElement Menu=driver.findElement(By.id("selectnav2"));
	    
	    action.moveToElement(Menu).perform();
	    
	    Select ref=new Select(Menu);
	    
	    ref.selectByVisibleText("Home");
	    
	   
	
	
	}
}
