package testing;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioCheckTest1 {

	public void radioselct(String reqcars) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.letskodeit.com/practice");
		List<WebElement> Allradio = driver.findElements(By.xpath("//input[@type='radio']"));
		for (WebElement radio : Allradio) {
			String cars = radio.getAttribute("id");
			if (cars.equals(reqcars)) {
				radio.click();
			}

		}

	}

	public static void main(String[] args) {
		RadioCheckTest1 ref = new RadioCheckTest1();
		ref.radioselct("benzradio");
	}

}
