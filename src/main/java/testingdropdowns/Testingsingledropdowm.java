package testingdropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testingsingledropdowm {

	public static void main(String[] args) {
	WebDriverManager.chromiumdriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://the-internet.herokuapp.com/dropdown");
	WebElement dropdown=driver.findElement(By.id("Dropdown"));
    Select ref=new Select(dropdown);
    ref.selectByIndex(2);
    ref.selectByVisibleText("Option 1");	
	}

}
