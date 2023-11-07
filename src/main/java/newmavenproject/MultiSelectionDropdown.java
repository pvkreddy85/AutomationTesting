package newmavenproject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiSelectionDropdown {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.letskodeit.com/practice");

		WebElement dropdownm = driver.findElement(By.id("multiple-select-example"));

		Select dropdown = new Select(dropdownm);

		dropdown.selectByIndex(0);

		dropdown.selectByValue("orange");

		dropdown.selectByVisibleText("peach");

		Thread.sleep(3000);

		dropdown.deselectByVisibleText("peach");

		List<WebElement> selectall = dropdown.getAllSelectedOptions();

		for (WebElement options : selectall)
		{
			
			System.out.println(options.getText());
		}
		
		Thread.sleep(3000);

		driver.close();
	}
}
