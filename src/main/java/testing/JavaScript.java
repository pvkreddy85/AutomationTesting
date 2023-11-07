package testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScript
{
	public static void main(String[] args) 
	
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		// driver.manage().deleteAllCookies();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		WebElement ele = driver.findElement(By.className("frmTextBox"));
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("argumets[0].value='Testing'", ele);
	}

}
