package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicityWait {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
		
	    driver.findElement(By.id("btn1")).click();
	    
	    driver.findElement(By.xpath("//b[text()='Textbox1']")).sendKeys("Testing");
	    
	   // driver.findElement(By.id("btn2")).click();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
