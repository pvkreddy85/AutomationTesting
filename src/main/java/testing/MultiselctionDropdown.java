package testing;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiselctionDropdown {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.letskodeit.com/practice");
		WebElement multi = driver.findElement(By.id("multiple-select-example"));
		Select multiselect = new Select(multi);
		List<WebElement> cars = multiselect.getOptions();
		for (WebElement select1 : cars) {
			String ref = select1.getText();
			System.out.println(ref);
		}
	}

}
