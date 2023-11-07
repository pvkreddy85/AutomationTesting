package com.Testingdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://github.com/login");

		driver.findElement(By.id("login_field")).sendKeys("pvkreddy85@gmail.com");

		driver.findElement(By.id("password")).sendKeys("vijay@123");

		driver.findElement(By.name("commit")).click();

		driver.findElement(By.partialLinkText("Forgot")).click();

		String PageTitle = driver.getTitle();

		System.out.println(PageTitle);

		String Url = driver.getCurrentUrl();

		System.out.println(Url);

		Thread.sleep(5000);

		driver.close();
	}

}
