package popups;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import conf.pathconf;

public class map {
	@Test
	public void maps() throws InterruptedException {
		System.getProperty(pathconf.web,pathconf.firefoxpath);
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.google.com/maps");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		((JavascriptExecutor)driver).executeAsyncScript("Scroll(0,2000");
		
		
	}
}
