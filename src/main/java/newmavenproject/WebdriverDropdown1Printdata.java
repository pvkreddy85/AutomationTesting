package newmavenproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebdriverDropdown1Printdata {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.letskodeit.com/practice");

		WebElement carslist = driver.findElement(By.id("carselect"));

		Select cars = new Select(carslist);

		cars.selectByIndex(1);

		cars.selectByValue("Benz");

		cars.selectByVisibleText("2");

		WebElement selectedcar = cars.getFirstSelectedOption();

		String car = selectedcar.getText();

		System.out.println(car);

		String pageurl = driver.getCurrentUrl();

		System.out.println(pageurl);

		String pagetitle = driver.getTitle();

		System.out.println(pagetitle);
	}

}
