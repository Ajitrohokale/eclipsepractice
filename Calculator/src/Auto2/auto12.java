package Auto2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class auto12 {
	public void webdriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Avinash\\Desktop\\New folder\\Webdd\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//by xpath by attribute
		driver.get("https://www.facebook.com/reg/");
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Ajit");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Rohokale");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("7248920513");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("au121995");
		driver.findElement(By.xpath("//select[@id=\"day\"]")).sendKeys("12");
		driver.findElement(By.xpath("//select[@name='birthday_month']")).sendKeys("Aug");
		driver.findElement(By.xpath("//select[@name='birthday_year']")).sendKeys("1995");
		driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		}
	
	}
