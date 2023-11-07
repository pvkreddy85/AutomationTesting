package Javascript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demojavascript2 {

	public static void main(String[] args) {
	
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver=new ChromeDriver();
	
	//ChromeOptions options=new ChromeOptions();
	
	//options.addArguments("---remote-allow-origins=*");
	
	driver.manage().deleteAllCookies();
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

	driver.get("https://www.letskodeit.com/practice");
	
	JavascriptExecutor js=((JavascriptExecutor)driver);
	
	WebElement instagramicon=driver.findElement(By.xpath("//a[@class='fab fa-instagram dynamic-link-icon']"));
	
	js.executeScript("arguments[0].ScrollIntoView();",instagramicon);
	
	js.executeScript("arguments[0].Click;",instagramicon);
	
	}
}
