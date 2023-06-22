package seleniumwait;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

import conf.pathconf;

public class Amazon {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		System.getProperty(pathconf.web,pathconf.firefoxpath);
		WebDriver driver=new FirefoxDriver();
		driver.get(pathconf.amazon);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("USB 256 GB");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		File ss= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[7]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a")).click();
		driver.findElement(By.xpath("//select[@id='quantity']")).sendKeys("2");
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		Date d=new Date();
		String date=d.toString().replace(":","_");
		File dest= new File("C:\\Users\\Avinash\\Desktop\\Ajit\\Screenshot\\image"+date+".jpg");
		FileHandler.copy(ss,dest);
	}

}
