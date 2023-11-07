package com.seleniumtestingproject.RadioChecklist;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testdemo {

	

	public void radiotest(String reqcar) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.letskodeit.com/practice");
		
		List<WebElement> allradio=driver.findElements(By.xpath("//label/input[@type='radio']"));
		
		for(WebElement radio:allradio) {
		
		String cars=radio.getAttribute("id");
		
		if (cars.equals(reqcar)) 
		{
			radio.click();
			break;
		}
		
    	}
 }
         public static void main(String[] args) {
		Testdemo test=new Testdemo();
		  test.radiotest("benzradio");
         
         }


}












