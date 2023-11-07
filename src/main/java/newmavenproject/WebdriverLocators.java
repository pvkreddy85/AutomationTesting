package newmavenproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebdriverLocators {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();

		driver.findElement(By.id("email")).sendKeys("pvkreddy190@gmail.com");

		driver.findElement(By.id("pass")).sendKeys("7660864879");

		driver.findElement(By.name("login")).click();

		driver.findElement(By.linkText("Forgotten password?")).click();

		String pageurl = driver.getCurrentUrl();

		System.out.println(pageurl);

		String pagetitle = driver.getTitle();

		System.out.println(pagetitle);

		driver.close();
	}

}
