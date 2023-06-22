package Testng1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import conf.pathconf;

public class javascript2 {
	public void Java2script() throws InterruptedException {
		System.getProperty(pathconf.web,pathconf.firefoxpath);
		WebDriver driver=new FirefoxDriver();
		driver.get(pathconf.amazon);
		driver.manage().window().maximize();
		//Thread.sleep(2000);
		//((JavascriptExecutor)driver).executeScript("Scroll(0,2000");
		//Thread.sleep(2000);
		((JavascriptExecutor)driver).executeScript("Scroll(0,-2000");
		WebElement fblink = driver.findElement(By.xpath("//span[text()='Frequently repurchased in Supplies']"));
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",fblink);

		
		
		
		
	}
	

}
