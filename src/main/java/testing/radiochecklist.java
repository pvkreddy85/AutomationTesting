package testing;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class radiochecklist {
	
	public static void checktest(String reqcars) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.letskodeit.com/practice");
		
		List<WebElement> allradio=driver.findElements(By.xpath("//input[@type='radio']"));
		
		for(WebElement radio:allradio) {
			
			String cars=radio.getAttribute("value");
		
		    if (cars.equals(reqcars)) {
				
		    	radio.click();
		    	
			}
		}
				
	}

     public static void main(String[] args) {
		checktest("honda");
    	 
	}


}
