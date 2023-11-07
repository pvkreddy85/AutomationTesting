package testing;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScript5 {
	
	public static void main(String[] args) throws IOException {
		
		String Project_Location=System.getProperty("user.dir");
		
		System.out.println(Project_Location);
		
		File fi=new File(Project_Location+"\\TestData");
		
		BufferedReader br=new BufferedReader(new FileReader(fi));
		
		Properties pr=new Properties();
		
		pr.load(br);
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		String url=pr.getProperty("url");
		
		driver.get(url);
		
		String username=pr.getProperty("username");
		
		driver.findElement(By.id("email")).sendKeys(username);
		
		String password=pr.getProperty("password");
		
		driver.findElement(By.id("login-password")).sendKeys(password);

		driver.findElement(By.id("login")).click();
		
		
	}

}
