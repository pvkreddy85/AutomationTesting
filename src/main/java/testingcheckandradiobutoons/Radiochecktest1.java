package testingcheckandradiobutoons;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Radiochecktest1 {
	
	public void radioselect(String reqcar) {
	
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.manage().deleteAllCookies();
	
	driver.get("https://www.letskodeit.com/practice");
	
	List<WebElement> allradios=driver.findElements(By.xpath("//input[@type='radio']"));
	
	for(WebElement radios:allradios)
	{
	String cars=radios.getAttribute("value");
	if(cars.equalsIgnoreCase(reqcar)) 
	{
	radios.click();
	break;
	}
		
	}
	}
  public static void main(String[] args) {
	  Radiochecktest1 test=new  Radiochecktest1();
	  test.radioselect("Honda");
	  
}
	
}	






	

