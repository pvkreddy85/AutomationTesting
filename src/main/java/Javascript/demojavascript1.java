package Javascript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demojavascript1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		
		driver.get("https://www.letskodeit.com/practice");
		
		//Thread.sleep(3000);
			
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		
		
		WebElement facebookicon = driver.findElement(By.xpath("//a[@class='fab fa-facebook-square dynamic-link-icon']"));
		
		js.executeScript("arguments[0].ScrollIntoView();", facebookicon);
		
	    js.executeScript("arguments[0].click();", facebookicon);
	}
}
