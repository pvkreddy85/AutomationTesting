package com.Testingdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DrpTest3 {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://the-internet.herokuapp.com/dropdown");

		WebElement drpdown = driver.findElement(By.id("dropdown"));

		Select ref = new Select(drpdown);

		// ref.selectByIndex(1);

		// ref.selectByValue("2");

		ref.selectByVisibleText("Option 1");

		WebElement selectoption = ref.getFirstSelectedOption();

		System.out.println(selectoption.getText());

		Thread.sleep(3000);

		driver.close();
	}

}
