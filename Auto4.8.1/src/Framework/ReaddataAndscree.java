package Framework;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import conf.pathconf;

public class ReaddataAndscree {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.getProperty(pathconf.web,pathconf.firefoxpath);
		WebDriver driver= new FirefoxDriver();
		driver.get(pathconf.appurl);
		Demo d=new Demo(driver);
		//testcase1
		d.enterUserId(Utility.readdata(1,0));
		d.enterPass(Utility.readdata(1,1));
		Utility.takescreenshot(driver);
		d.loginbtnclick();
		Utility.takescreenshot(driver);
		driver.navigate().to(pathconf.appurl);
		
		//TestCase 02
		d.enterUserId(Utility.readdata(2,0));
		d.enterPass(Utility.readdata(2,1));
		Utility.takescreenshot(driver);
		d.loginbtnclick();
		Utility.takescreenshot(driver);
		driver.navigate().to(pathconf.appurl);
		
		//TestCase 03
		d.enterUserId(Utility.readdata(3,0));
		d.enterPass(Utility.readdata(3,1));
		Utility.takescreenshot(driver);
		d.loginbtnclick();
		Utility.takescreenshot(driver);
		driver.navigate().to(pathconf.appurl);
		
		//TestCase 04
		d.enterUserId(Utility.readdata(4,0));
		d.enterPass(Utility.readdata(4,1));
		Utility.takescreenshot(driver);
		d.loginbtnclick();
		Utility.takescreenshot(driver);
		driver.navigate().to(pathconf.appurl);
		
		//TestCase 05
		d.enterUserId(Utility.readdata(5,0));
		d.enterPass(Utility.readdata(5,1));
		Utility.takescreenshot(driver);
		d.loginbtnclick();
		Utility.takescreenshot(driver);
		driver.navigate().to(pathconf.appurl);
		
		
		
		
		
	}

}
