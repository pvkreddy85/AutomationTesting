package testing;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Application {
	
	@BeforeTest
	public void LaunchBrowser() {
		System.out.println("Launched Browser Sucessfully");
	}
	@BeforeClass
    public void login() {
    	System.out.println("Login Sucessfully");
    }
	@Test(priority=2)
	public void AddEmployee() {
		System.out.println("Added Employee Sucessfully");
	}
	@Test(priority=1, enabled = false)
	public void DeleteEmployee() {
		System.out.println("Deleted Employee Sucessfully");
	}
	@Test(priority=3)
	public void UpdateEmployee() {
		System.out.println("Updated Employee Sucessfully");
	}
	@AfterClass
	public void Logout() {
		System.out.println("Logout Sucessfully");
	}
	@AfterTest
    public void CloseBrowser() {
    	System.out.println("Browser Closed sucessfully");
    }
	
	
	
}
