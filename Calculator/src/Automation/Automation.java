package Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Avinash\\Desktop\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	 driver.get("https://www.facebook.com/");
	  Thread.sleep(5000);
           
	 driver.get("https://www.instagram.com/");
	 
	}

}
