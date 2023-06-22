package Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import conf.pathconf;

public class variableweb {
	public static void main(String[] args) throws InterruptedException {
		System.getProperty(pathconf.web,pathconf.firefoxpath);
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(pathconf.appurl);
		Demo d=new Demo(driver);
		//Test case 1
		d.enterUserId("Tester1");
		d.enterPass("1251");
		d.loginbtnclick();
		driver.navigate().to(pathconf.appurl);
		Thread.sleep(2000);
		//test case 2
		d.enterUserId("Tester2");
		d.enterPass("12541");
		d.loginbtnclick();
		driver.navigate().to(pathconf.appurl);
		Thread.sleep(2000);
		//test case 03
		d.enterUserId("Tester03");
		d.enterPass("12548");
		d.loginbtnclick();
		driver.navigate().to(pathconf.appurl);
		Thread.sleep(2000);
		
	}	
}


