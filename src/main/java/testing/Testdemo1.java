
package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Testdemo1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.letskodeit.com/practice");
		WebElement selection=driver.findElement(By.id("multiple-select-example"));
		Select ref=new Select(selection);
		ref.selectByIndex(0);
		ref.selectByValue("2");
		ref.selectByVisibleText("Peach");
		Thread.sleep(3000);
		ref.deselectAll();
		driver.close();
	}

}
