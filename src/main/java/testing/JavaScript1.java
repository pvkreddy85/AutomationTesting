package testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScript1 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.letskodeit.com/practice");
		JavascriptExecutor js=((JavascriptExecutor)driver);
	    WebElement facebookicon	=driver.findElement(By.className("fab fa-facebook-square dynamic-link-icon"));
	    js.executeScript("arguments[0].ScrollIntoView();",facebookicon);
	    js.executeScript("arguments[0].Click();",facebookicon);
	}
}
