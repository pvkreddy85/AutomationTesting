package testing;

public class TestNg1 {
	
	public void launchrowser() {
		System.out.println("Launched Browser Sucessfully");
	}
	public void login() {
		System.out.println("Login Sucessfully");
	}
	public void searchproduct() {	
		System.out.println("Search Product Sucesfully");
	}
	public void addtocart() {
		System.out.println("Product Added cart Sucessfully");
	}
	public void logout() {
		System.out.println("Logout Sucessfully");
	}
	public static void main(String[] args) {
		TestNg1 ref=new TestNg1();
		ref.launchrowser();
		ref.login();
		ref.searchproduct();
		ref.addtocart();
		ref.logout();
	}
}
