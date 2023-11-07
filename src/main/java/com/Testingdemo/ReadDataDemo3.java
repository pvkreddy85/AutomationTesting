package com.Testingdemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadDataDemo3 {

	public static void main(String[] args) throws IOException {
		
		File f3=new File("C:\\Users\\asus\\Desktop\\Java\\seleniumtestingproject\\Properties File");
		
		BufferedReader br=new BufferedReader(new FileReader(f3));
		
		Properties pr=new Properties();
		
		pr.load(br);
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		String url=pr.getProperty("url");
		
		driver.get(url);
		
		String uname=pr.getProperty("username");
		
		driver.findElement(By.id("email")).sendKeys(uname);
	
	    String pwd=pr.getProperty("password");
	    
	    driver.findElement(By.id("login-password")).sendKeys(pwd);
	
	    driver.findElement(By.id("login")).click();
	
	}
	
}
