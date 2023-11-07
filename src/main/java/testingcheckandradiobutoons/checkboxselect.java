package testingcheckandradiobutoons;

import java.awt.Checkbox;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class checkboxselect {
	
	public  static  void checkbox(String checkcars) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.letskodeit.com/practice");
		
		List<WebElement> allcheckboxs= driver.findElements(By.xpath("//label/input[@type='checkbox']"));
       
		for(WebElement checkbox:allcheckboxs) {
    	
		String checkcars1=checkbox.getAttribute("id");
    	
		if(checkcars1.equalsIgnoreCase(checkcars1)) {
    	
		checkbox.click();
    	
		break;
    	  }    	
        }
	}
 	public static void main(String[] args) {
	
 		checkbox("benzcheck");
 	}
}
