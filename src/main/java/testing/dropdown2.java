package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdown2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/dropdown");
		
		WebElement dropdown=driver.findElement(By.id("dropdown"));
		
		Select ref=new Select(dropdown);      //syntax:- Select refenrence=new Select(WebElement)
		
		ref.selectByIndex(0);
		
		WebElement drp=ref.getFirstSelectedOption(); ///getFirstSelectedOption() used to get the selected  option from dropdown
		
		System.out.println(drp.getText());
		
		Thread.sleep(3000);
		
		driver.close();		
	}

}
