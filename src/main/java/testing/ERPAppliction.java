package testing;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ERPAppliction {
    @BeforeClass
	public void launchbrowser() {
		System.out.println("Launched Browser Sucessfully");
	}
    @BeforeClass
	public void login() {
		System.out.println("Login Sucessfully");
	}
    @Test(priority=2)
	public void AddEmployees() {
		System.out.println("Added Employee sucessfully");
	}
    @Test(priority=1, enabled = false)
	public void DeleteEmployee() {
		System.out.println("Deleted Employee Sucessfully");
	}
    @Test(priority=3)
	public void Updateemployee() {
		System.out.println("Updated Employee Sucessfully");
	}
    @AfterClass
	public void logout() {
		System.out.println("Logout Employee Sucessfully");
	}
    @AfterTest
    public void CloseBrowser() {
    	System.out.println("Browser Closed Sucessfully");
    }


}

