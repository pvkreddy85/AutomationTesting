package testingcheckandradiobutoons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testingradio {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://www.letskodeit.com/practice");
        driver.findElement(By.id("bmwradio")).click();
	    Thread.sleep(3000);
        driver.close();
	}
}