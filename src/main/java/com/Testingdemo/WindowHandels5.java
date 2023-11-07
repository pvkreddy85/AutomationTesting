package com.Testingdemo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandels5 {
	
	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.letskodeit.com/practice");
		
		String ParentWindow=driver.getWindowHandle();
		
		WebElement Windows=driver.findElement(By.id("openwindow"));
		
		Windows.click();
		
		Set<String> AllWindows=driver.getWindowHandles();
		
		for (String Window : AllWindows) {
			
			driver.switchTo().window(Window);
			
			String url=driver.getCurrentUrl();
			
			if (url.equals("https://www.letskodeit.com/courses")) {
				
				driver.manage().window().maximize();
				
				Thread.sleep(3000);
				
				driver.quit();
				
			}
		}
		
	}

}
