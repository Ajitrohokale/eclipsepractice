package Automation;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Resize {
public void Resize1() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Avinash\\Desktop\\New folder\\chromedriver_win32\\chromedriver.exe");
	WebDriver Driver= new ChromeDriver();
	 Driver.get("https://www.facebook.com/");
	 //Driver.manage().window().maximize();
	
	 //Driver.findElement(By.xpath("//input[@name='email']")).sendKeys("");
	 //Driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("");
	 //Driver.findElement(By.xpath("//button[@name='Create new account']")).click();
	  // Driver.findElement(By.xpath("//a[text()='Forgotten password']")).click();
	 
}
}
