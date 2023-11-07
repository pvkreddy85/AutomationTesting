package testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Allselectedoptions {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.letskodeit.com/practice");
		WebElement multiselection = driver.findElement(By.id("multiple-select-example"));
		Select ref = new Select(multiselection);
		ref.selectByIndex(0);
		ref.selectByValue("Orange");
		ref.selectByVisibleText("Peach");
		Thread.sleep(3000);
		List<WebElement> multi = ref.getAllSelectedOptions();
		System.out.println("Selected Values of Dropdown");
		for (WebElement multiple : multi)
		{
			System.out.println(multiple.getText());
		}
		Thread.sleep(3000);

		driver.close();

	}
}
