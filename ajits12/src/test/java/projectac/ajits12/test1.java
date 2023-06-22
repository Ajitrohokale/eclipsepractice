package projectac.ajits12;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pom.classes.HomePage;


public class test1 {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\\\Users\\\\Avinash\\\\Desktop\\\\Ajit\\\\firefox\\\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.myinsuranceclub.com/");
		driver.manage().window().maximize();
		HomePage homepage=new HomePage(driver);
		homepage.clickterminsu();
		homepage.clickcalPremiumbtm();
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.MILLISECONDS);
		homepage.clickmalebtn();
		homepage.clickfemalebtn();
		homepage.sendage();
		
		
		
		
		
	}

}
