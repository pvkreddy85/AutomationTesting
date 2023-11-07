package Testingwindowhandlings;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowshandling1 {
	public static void main(String[] args) {
 WebDriverManager.chromedriver().setup();
 WebDriver driver=new ChromeDriver();
 driver.manage().window().maximize();
 driver.manage().deleteAllCookies();
 driver.get("https://www.letskodeit.com/practice");
 String parentwindow=driver.getWindowHandle();
 WebElement window=driver.findElement(By.id("openwindow"));
 window.click();
 Set<String> allwindws=driver.getWindowHandles();
 for(String windows:allwindws) {
		 
	 driver.switchTo().window(windows);
	 String url=driver.getCurrentUrl();
	 if(url.equals("https://www.letskodeit.com/practice"));
	 driver.manage().window().maximize();
	 break;	
	
	}		
	}}
