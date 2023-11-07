package com.Testingdemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadDataDemo {

	
	public static void main(String[] args) throws IOException {
		
		
		File f1=new File("C:\\Users\\asus\\Desktop\\Java\\seleniumtestingproject\\Properties File");
		
		BufferedReader br=new BufferedReader(new FileReader(f1));
		
		Properties pr=new Properties();
		
		pr.load(br);
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		String urlapp=pr.getProperty("url");
		
		driver.get(urlapp);
		
		String uname=pr.getProperty("username");
		
		driver.findElement(By.id("email")).sendKeys(uname);
		
		String pwd=pr.getProperty("password");
		
		driver.findElement(By.id("login-password")).sendKeys(pwd);
		
		driver.findElement(By.id("login")).click();
		
		
		
	}
}
