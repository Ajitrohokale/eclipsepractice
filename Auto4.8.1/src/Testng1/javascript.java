package Testng1;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import conf.pathconf;

public class javascript {
	public void script() throws InterruptedException {
		System.getProperty(pathconf.web,pathconf.firefoxpath);
		WebDriver driver =new FirefoxDriver();
		driver.get(pathconf.amazon);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		((JavascriptExecutor)driver).executeScript("scroll(0,2000)");
        Thread.sleep(2000);
		((JavascriptExecutor)driver).executeScript("scroll(0,-2000)");

	}
	public static void main(String[] args) throws InterruptedException {
		//javascript js=new javascript();
		//js.script();
		javascript2 js2=new javascript2();
		js2.Java2script();

	}

}
