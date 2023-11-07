package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHoverAction {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.letskodeit.com/practice");
		WebElement mousehover=driver.findElement(By.id("mousehover"));
		Actions action=new Actions(driver);
		action.moveToElement(mousehover).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Top']")).click();
		Thread.sleep(3000);
		driver.close();
		
	}

}
