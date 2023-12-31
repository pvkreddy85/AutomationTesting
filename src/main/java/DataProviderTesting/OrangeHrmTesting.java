package DataProviderTesting;
    
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHrmTesting {
	
	WebDriver driver;	
	
	@DataProvider(name="OrangeHrmLoginData")
   
	public Object[][] getTestData() {
		
		Object[][] data =new Object[2][2];
		
		data[0][0]="Admin";
		data[0][1]="admin123";
		
		data[1][0]="Admin";
		data[1][1]="admin110";
		
		return data;
	}
	
	@BeforeTest
	public void setup() throws InterruptedException {
	WebDriverManager.chromedriver().setup();
    driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    Thread.sleep(5000);
	}
	
	
    @Test(dataProvider="OrangeHrmLoginData")
	
    public void OrangeHrmLogin(String username, String password) throws InterruptedException {
		
    	driver.findElement(By.name("username")).sendKeys(username);
		
		driver.findElement(By.name("password")).sendKeys(password);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(3000);
    }
	
		 @AfterMethod
			public void logout() throws InterruptedException 
		   {
				driver.findElement(By.xpath("//img[@alt='profile picture']")).click();
				driver.findElement(By.xpath("//a[.='Logout']")).click();
				Thread.sleep(6000);

		    }
		 }


