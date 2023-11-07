package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyBoardAction2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("selenium");
	    driver.findElement(By.xpath("(//input[@value='Google Search'])[2]")).click();
		//Actions action=new Actions(driver);
		//action.moveToElement(googlebtn).click();
		Thread.sleep(3000);
		driver.close();
		
	}
}
