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

public class ajit {

	public static void main(String[] args) throws IOException {
		System.getProperty(pathconf.web,pathconf.firefoxpath);
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/campaign/landing.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("edfds");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("1234567890");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("77777777");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("12578@");
		driver.findElement(By.xpath("//select[@id='day']")).sendKeys("12");
		driver.findElement(By.xpath("//select[@id='month']")).sendKeys("Feb");
		driver.findElement(By.xpath("//select[@id='year']")).sendKeys("1980");
		driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
		Date d=new Date();
		String s=d.toString().replace(":", "_");
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\Avinash\\Desktop\\Ajit\\Screenshot\\image"+s+".jpg");
		FileHandler.copy(src,dest);
		//driver.findElement(By.xpath(""))

	}

}
