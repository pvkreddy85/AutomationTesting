package com.project.orangehrmtest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestOrangeHrm {
	WebDriver driver;

	@BeforeClass
	public void setUP() throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
	}

	@Test
	public void login() throws InterruptedException 
	{
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		String acturl = driver.getCurrentUrl();
		String expurl = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		acturl.equals(expurl);
		Thread.sleep(3000);
	}

	@Test
	public void Adminpage() throws InterruptedException 
	{
		driver.findElement(By.xpath("//span[text()='Admin']")).click();
		String expurl = "https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers";
		String acturl = driver.getCurrentUrl();
		expurl.equals(acturl);
		Thread.sleep(3000);
	}

	@AfterMethod
	public void logout() throws InterruptedException 
	{
		driver.findElement(By.xpath("//img[@alt='profile picture']")).click();
		driver.findElement(By.xpath("//a[.='Logout']")).click();
		String expurl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		String acturl = driver.getCurrentUrl();
	    Thread.sleep(3000);
	}
}
