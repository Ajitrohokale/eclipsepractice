package youtube;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import conf.pathconf;

public class song {
	@Test
	public void song1() throws InterruptedException {
		System.getProperty(pathconf.web,pathconf.firefoxpath);
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.youtube.com/");
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("raj aala song");
		driver.navigate().to("https://www.youtube.com/results?search_query=raj+aala+song");
		driver.get("https://youtu.be/eIcz71oxlbU");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"thumbnail-container\"]")).click();
	}

}
