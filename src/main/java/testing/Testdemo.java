package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testdemo {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://github.com/login");
	    String Titleofthepage =driver.findElement(By.tagName("h1")).getText();
	    System.out.println(Titleofthepage);
	    Thread.sleep(3000);
	    driver.close();
	    
	
	}

}
