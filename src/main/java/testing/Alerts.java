package testing;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.letskodeit.com/practice");
		driver.findElement(By.name("enter-name")).sendKeys("Testing Training");
		driver.findElement(By.id("alertbtn")).click();
		Alert alert=driver.switchTo().alert();
		String message=alert.getText();
		System.out.println(message);
		alert.accept();
		Thread.sleep(3000);
		driver.close();
		

	}

}
