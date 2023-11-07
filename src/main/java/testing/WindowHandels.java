package testing;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandels {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.letskodeit.com/practice");
		
		String Parentwindow=driver.getWindowHandle();
		
		WebElement windows=driver.findElement(By.id("openwindow"));
		
		windows.click();
		
		Set<String> allwindows=driver.getWindowHandles();
		
		for(String window1:allwindows) {
		
		driver.switchTo().window(window1);
			
		String url=driver.getCurrentUrl();
		
		if (url.equals("https://www.letskodeit.com/courses")) {
			
			driver.manage().window().maximize();
			
		}
		
	}}
}
