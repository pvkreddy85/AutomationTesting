package testing;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleWindowHandling1 {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.letskodeit.com/practice");
	 
		String ParentWindow=driver.getWindowHandle();
	     
	    driver.findElement(By.id("opentab")).click();
	    
	    Set<String> AllWindows=driver.getWindowHandles();
	    
	    for(String window:AllWindows) {
	    	
	    driver.switchTo().window(window);
	    
	    String title=driver.getTitle();
	    
	    if (title.equals("All Courses")) {
	    	
	    driver.findElement(By.xpath("//a[text()='Sign In']")).click();
	    
	    driver.findElement(By.id("email")).sendKeys("pvkreddy85@gmail.com");
	    
	    driver.findElement(By.id("login-password")).sendKeys("vijay@123");
	    
	    driver.findElement(By.id("login")).click();
			
		}
	    }
	
	}

}
