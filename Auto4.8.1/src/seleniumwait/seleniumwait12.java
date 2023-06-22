package seleniumwait;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import conf.pathconf;

public class seleniumwait12 {
	public void SW() {
		System.getProperty(pathconf.web,pathconf.firefoxpath);
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Automation step by step");
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[5]/center/input[1]")).click();
		driver.findElement(By.name("abcd")).click();
		driver.close();
		driver.quit();
		
	}
	public static void main(String[] args) {
		seleniumwait12 s= new seleniumwait12();
		s.SW();
	}

}
