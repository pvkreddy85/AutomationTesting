package seleniumtestingpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Githublogin {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.Github.com/login");
		driver.findElement(By.id("login_field")).sendKeys("pvkreddy190@gmail.com");
	    driver.findElement(By.id("password")).sendKeys("7660864878");
	    driver.findElement(By.name("commit")).click();
	    Thread.sleep(6000);
	    driver.close();
}  

}
