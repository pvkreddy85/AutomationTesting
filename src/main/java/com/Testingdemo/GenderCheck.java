package com.Testingdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GenderCheck {
	
	public void GenderSelect(String ReqSex) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.facebook.com/signup");
	
	    List<WebElement> AllGender=driver.findElements(By.xpath("//input[@type='radio']/../label"));
	    
	    for (WebElement Gender : AllGender) {
	    	
	    	String sex=Gender.getText();
	    	
	    	if (sex.equalsIgnoreCase(ReqSex)) {
				Gender.click();
			}	
		}
	}

	public static void main(String[] args) {
		GenderCheck ref=new GenderCheck();
		ref.GenderSelect("Female");
		
	}
	
}
