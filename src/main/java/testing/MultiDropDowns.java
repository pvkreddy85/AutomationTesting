package testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiDropDowns {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.letskodeit.com/practice");
		
		WebElement carslist = driver.findElement(By.id("carselect"));

		Select car = new Select(carslist);
		
		List<WebElement> selectedcars = car.getOptions();
		
		for (WebElement cars : selectedcars);
		
		String car1 = carslist.getText();
		
		System.out.println(car1);
		
		driver.close();

	}

}
