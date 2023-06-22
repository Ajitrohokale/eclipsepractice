package Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import conf.pathconf;

public class mi {

	public static void main(String[] args) throws InterruptedException {
		System.getProperty(pathconf.web,pathconf.firefoxpath);
		WebDriver Driver=new FirefoxDriver();
		Driver.get("https://www.facebook.com/r.php");
		Thread.sleep(2000);
		Driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Ajit"); // for first name
		Thread.sleep(2000);
		Driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Rohokale"); // for Surname
		Thread.sleep(2000);
		Driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("rohokaleajit128@gmail.com"); // for email
		Thread.sleep(2000);
		Driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("12345678");// for password
		Thread.sleep(2000);
		Driver.findElement(By.xpath("//select[@name='birthday_day']")).sendKeys("12");// ATribute not working on option value
		Thread.sleep(2000);
		Driver.findElement(By.xpath("//select[@name='birthday_month']")).sendKeys("Aug");// ATribute not working on option value
		Thread.sleep(2000);
		Driver.findElement(By.xpath("//select[@name='birthday_year']")).sendKeys("1995");// ATribute not working on option value
		Thread.sleep(2000);
		Driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click(); // Xpath by Index
	}

	}


