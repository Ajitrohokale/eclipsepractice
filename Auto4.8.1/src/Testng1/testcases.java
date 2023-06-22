package Testng1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import conf.pathconf;

public class testcases {
	@Test
	public void test1() {
		System.getProperty(pathconf.web,pathconf.firefoxpath);
		WebDriver driver=new FirefoxDriver();
		driver.get(pathconf.appurl);
		driver.manage().window().maximize();
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Sign up for Facebook | Facebook");
			}

}
