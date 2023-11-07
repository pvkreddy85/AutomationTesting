package testing;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts2 {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.letskodeit.com/practice");
		
		driver.findElement(By.name("enter-name")).sendKeys("This is Selenium Training");
	
		driver.findElement(By.id("confirmbtn")).click();
		
		Alert alert=driver.switchTo().alert();
		
		String Alert=alert.getText();
		
		System.out.println(Alert);
		
		//alert.accept();
		
		alert.dismiss();
		
		Thread.sleep(3000);
		
		driver.close();
		
		
	}

}
