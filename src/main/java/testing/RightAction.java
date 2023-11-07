package testing;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightAction {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	    WebElement Right=driver.findElement(By.xpath("//span[text()='right click me']"));
	    Actions action=new Actions(driver);
	    action.contextClick(Right).perform();
	    WebElement Copy=driver.findElement(By.xpath("//span[.='Copy']"));
	    action.click(Copy).perform();
	    Alert alert=driver.switchTo().alert();
	    System.out.println(alert.getText());
	    alert.accept();
	    Thread.sleep(3000);   
	    driver.close();
	}

}



