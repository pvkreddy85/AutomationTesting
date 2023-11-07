package com.seleniumtestingproject.RadioChecklist;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Allradios {
	


	public void radioselect(String reqcars) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.letskodeit.com/practice");
		
		List<WebElement> allradio=driver.findElements(By.xpath("//label/input[@type='radio']"));
		
		for(WebElement radio:allradio) {
			
			String cars=radio.getAttribute("id");
			
			if (cars.equals(reqcars)){
				
				radio.click();
				break;
				
			}
		}
	}

	 public static void main(String[] args) {
		Allradios radio=new Allradios();
		radio.radioselect("bmwradio");
		
	}
	
}
