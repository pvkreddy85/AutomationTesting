package com.Testingdemo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandels6 {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.letskodeit.com/practice");
		
		String ParentWindow=driver.getWindowHandle();
		
		WebElement Windows=driver.findElement(By.id("opentab"));
		
		Windows.click();
		
		Set<String> AllWindows=driver.getWindowHandles();
		
		for (String Window : AllWindows) {
			
			driver.switchTo().window(Window);
			
			if (driver.equals("All Courses")) {
				
				driver.findElement(By.xpath("//a[text()='Sign In']")).click();
				
				driver.findElement(By.id("email")).sendKeys("pvkreddy85@gmail.com");
				
				driver.findElement(By.id("login-password")).sendKeys("vijay@123");
				
				driver.findElement(By.id("login")).click();
				
			}
			
		}
		
		
		
	}
	
}
