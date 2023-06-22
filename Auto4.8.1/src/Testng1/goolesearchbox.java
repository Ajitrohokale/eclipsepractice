package Testng1;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class goolesearchbox {
	@Test
	public void searchbox() {
		System.getProperty("webdriver.gecko.driver","C:\\\\Users\\\\Avinash\\\\Desktop\\\\Ajit\\\\firefox\\\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@type=\"search\"]")).isDisplayed();
		driver.findElement(By.xpath("//input[@type=\"search\"]")).isEnabled();
		driver.findElement(By.xpath("//input[@type=\"search\"]")).isSelected();
		
	}

}
