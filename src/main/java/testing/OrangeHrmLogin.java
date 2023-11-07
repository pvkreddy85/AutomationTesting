package testing;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHrmLogin {

	WebDriver driver;

	Properties pr;

	@BeforeTest
	public void datasetup() throws IOException {

		File fi = new File("C:\\Users\\asus\\Desktop\\Java\\seleniumtestingproject\\TestData");

		BufferedReader br = new BufferedReader(new FileReader(fi));

		pr = new Properties();

		pr.load(br);
	}

	@BeforeClass
	public void setup() throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

		driver.manage().deleteAllCookies();

		String url = pr.getProperty("url");

		driver.get(url);

		Thread.sleep(3000);

	}

	@BeforeMethod
	public void OrangeHrmLogin() throws InterruptedException {

		String username = pr.getProperty("username");

		driver.findElement(By.name("username")).sendKeys(username);

		String password = pr.getProperty("password");

		driver.findElement(By.name("password")).sendKeys(password);

		driver.findElement(By.xpath("//button[@type='submit']")).click();

		String acturl = driver.getCurrentUrl();

		String expurl = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";

		System.out.println("LogIn Page::" + acturl.equals(expurl));

		Thread.sleep(3000);
	}

	@Test
	public void AdminPage() throws InterruptedException {

		driver.findElement(By.xpath("//span[text()='Admin']")).click();

		String expurl = "https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers";

		String acturl = driver.getCurrentUrl();

		//System.out.println("Admin Page ::" + expurl.equals(acturl));

		Assert.assertEquals(expurl, acturl);
		
		System.out.println("Im in Admin Page");
		
		Thread.sleep(3000);
	}

	@Test
	public void LeavePage() throws InterruptedException {

		driver.findElement(By.xpath("//span[text()='Leave']")).click();

		String expurl = "https://opensource-demo.orangehrmlive.com/web/index.php/leave/viewLeaveList";

		String acturl = driver.getCurrentUrl();

		//System.out.println("Leave Page ::" + expurl.equals(acturl));
		
		Assert.assertEquals(expurl, acturl);
		
		System.out.println("Im in Leave Page");

		Thread.sleep(3000);
	}

	@AfterMethod
	public void LogOut() throws InterruptedException {

		driver.findElement(By.xpath("//img[@alt='profile picture']")).click();

		driver.findElement(By.xpath("//a[text()='Logout']")).click();

		String expurl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

		String acturl = driver.getCurrentUrl();

		System.out.println("LogOut Page::" + expurl.equals(acturl));

		Thread.sleep(3000);
	}

	@AfterClass
	public void TearDown() throws InterruptedException {

		Thread.sleep(3000);

		driver.close();
	}

}
