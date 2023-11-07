package testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBoxes {
public void check(String reqcar) {
	
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.manage().deleteAllCookies();
	
	driver.get("https://www.letskodeit.com/practice");
	
	List<WebElement> allcheckboxes=driver.findElements(By.xpath("//input[@type='radio']"));
	
	for(WebElement check:allcheckboxes) {
		
		String cars=check.getAttribute("id");
		
		if (cars.equals(reqcar)) {
			check.click();
			
		}
		
		
	}
}

      public static void main(String[] args) {
    	  
    	  CheckBoxes ref=new CheckBoxes();
    	  ref.check("benzradio");
	}


}
