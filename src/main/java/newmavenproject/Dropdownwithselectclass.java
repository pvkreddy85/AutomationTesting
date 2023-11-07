package newmavenproject;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdownwithselectclass {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.letskodeit.com/practice");

		WebElement elemet = driver.findElement(By.id("carselect"));

		Select ref = new Select(elemet);

		List<WebElement> Dropdown = ref.getOptions();

		for (WebElement elements:Dropdown ) {
		
			String data = elements.getText();

			System.out.println(data);
		}
	}
}
