package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathBY {
	public void Atribute() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Avinash\\Desktop\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver Driver= new ChromeDriver();
		Driver.get("https://www.facebook.com/r.php");		
		Driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Ajit"); // for first name
		Driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Rohokale"); // for Surname
		Driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("rohokaleajit128@gmail.com"); // for email
		Driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("12345678");// for password
		Driver.findElement(By.xpath("//select[@name='birthday_day']")).sendKeys("12");// ATribute not working on option value
		Driver.findElement(By.xpath("//select[@name='birthday_month']")).sendKeys("Aug");// ATribute not working on option value
		Driver.findElement(By.xpath("//select[@name='birthday_year']")).sendKeys("1995");// ATribute not working on option value
		Driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click(); // Xpath by Index
	}
	public void Text() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Avinash\\Desktop\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/reg/");
		driver.findElement(By.xpath("//input[type()='text']")).sendKeys("Ajit");
		
		
	}
	public void contains() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Avinash\\Desktop\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/reg/");
		driver.findElement(By.xpath("//input[@type()='text']")).sendKeys("Ajit");
		
		
	}
	public void index() {
		
		
		
	}
	

}
