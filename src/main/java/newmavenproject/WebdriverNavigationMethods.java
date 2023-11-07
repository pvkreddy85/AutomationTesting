package newmavenproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebdriverNavigationMethods {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.get("https://www.instagram.com/");
		
		driver.navigate().back();     // Instagrm to facebook
		driver.navigate().forward();  // facebook  to instagram
		
		driver.navigate().refresh();
	}

}
