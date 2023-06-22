package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@SuppressWarnings("unused")
public class FBSing {
   public void FN() {
	   System.setProperty("webdriver.chrome.driver","C:\\Users\\Avinash\\Desktop\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver Driver= new ChromeDriver();
		Driver.get("https://en-gb.facebook.com/reg/");
		
	   
   }
}
