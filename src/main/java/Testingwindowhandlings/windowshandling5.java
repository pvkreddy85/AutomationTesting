package Testingwindowhandlings;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowshandling5 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.letskodeit.com/practice");
		String parentwinodw = driver.getWindowHandle();
		driver.findElement(By.id("opentab")).click();
		Set<String> allwinodws = driver.getWindowHandles();
		for (String winows : allwinodws) {
			driver.switchTo().window(winows);
			if (driver.getTitle().equals("All Courses")) {
				driver.findElement(By.xpath("//a[text()='Sign In']")).click();
				driver.findElement(By.id("email")).sendKeys("pvkreddy85@gmail.com");
				driver.findElement(By.id("login-password")).sendKeys("vijay@123");
				Thread.sleep(3000);
				driver.findElement(By.id("login")).click();

			}
		}

	}

}
