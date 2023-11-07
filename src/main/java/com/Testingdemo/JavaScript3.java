package com.Testingdemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScript3 {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		driver.get("https://www.letskodeit.com/practice");
		
		JavascriptExecutor js=((JavascriptExecutor)driver);
		
		WebElement facebook=driver.findElement(By.xpath("//a[@class='fab fa-instagram dynamic-link-icon']"));
		
		js.executeScript("arguments[0].scrollIntoView()",facebook);
		
		js.executeScript("arguments[0].click", facebook);
		
	}

}
