package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesTesting1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		
		WebElement textbox = driver.findElement(By.className("frmTextBox"));

		Actions actions = new Actions(driver);

		actions.moveToElement(textbox).perform();

		driver.switchTo().frame(driver.findElement(By.id("frm1")));
		
		WebElement menu=driver.findElement(By.id("selectnav2"));
		
		actions.moveToElement(menu).perform();
	    
		Select ref=new Select(menu);
	    
		Thread.sleep(3000);
	    
		ref.selectByVisibleText("Contact");
		
		Thread.sleep(3000);
		
		driver.close();
		
	}
	
}
