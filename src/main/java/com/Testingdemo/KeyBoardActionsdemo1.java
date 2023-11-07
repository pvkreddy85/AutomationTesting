package com.Testingdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyBoardActionsdemo1 {
	
	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.google.com/");
		
		WebElement Key=driver.findElement(By.name("q"));
		
		Actions action=new Actions(driver);
		
		action.keyDown(Keys.SHIFT).sendKeys(Key, "Selenium").perform();
		
		Thread.sleep(3000);
		
		driver.close();
	}

}
