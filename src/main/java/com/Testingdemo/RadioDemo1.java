package com.Testingdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioDemo1 {

	public void radioselect(String reqcars) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.get("https://www.letskodeit.com/practice");

		List<WebElement> allradios = driver.findElements(By.xpath("//label/input[@type='radio']"));

		for (WebElement radio : allradios)
		   {
			
			String cars = radio.getAttribute("value");
			
			if (cars.equals(reqcars)) 
			{
				radio.click();
			}
		}
	}
           public static void main(String[] args) {
        	   RadioDemo1 one=new RadioDemo1();
        	   one.radioselect("bmw");
        	   
		}
}
