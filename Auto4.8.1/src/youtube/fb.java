package youtube;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import conf.pathconf;

public class fb {

	public static void main(String[] args) {
		System.getProperty(pathconf.web,pathconf.firefoxpath);
		WebDriver driver=new FirefoxDriver();
		driver.get(pathconf.amazon);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("usb 256 GB");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
		
		

	}

}
