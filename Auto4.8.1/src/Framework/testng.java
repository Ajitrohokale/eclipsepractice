package Framework;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class testng {
	@Test
	public void userlogin() {
		System.out.println("test is ok");
	}
	@Test
	public void m2() {
		System.out.println("TC-02 is Running");	
	}
	
	@Test
	public void m3() {
		System.out.println("TC-03 is Running");
	}
	@Test
	public void m4() {
		System.out.println("TC-04 is Running");	
	}
	@BeforeClass
	public void openBrowser() {
		System.out.println("Browser is Launched");
	}
	@AfterClass
	public void closeBrowser() {
		System.out.println("Close Browser");
	}
	@BeforeMethod
	public void login() {
		System.out.println("Application Login ");
	}
	@AfterMethod
	public void logout() {
		System.out.println("Application Logout");
	}


}
