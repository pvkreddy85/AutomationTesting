package newmavenproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebdriverDropdowns {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://the-internet.herokuapp.com/dropdown");

		WebElement dropdown = driver.findElement(By.id("dropdown"));

		Select ref = new Select(dropdown);

		ref.selectByIndex(2); // Paramter is Interger

		// ref.selectByVisibleText("Option 2"); // Parameter is String

		// ref.selectByValue("2"); // Parameter is String

		WebElement option = ref.getFirstSelectedOption();    /// getFirstSelectedOption is used to know the selected option
															/// from dropdown
		System.out.println(option.getText());
	}

}
