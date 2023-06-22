package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import conf.pathconf;

public class select2 {
	public void Drop2() throws InterruptedException {
		System.setProperty(pathconf.web,pathconf.chromepath);
		WebDriver driver =new ChromeDriver();
		driver.get(pathconf.appurl);
		driver.manage().window().maximize();
		WebElement month=driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select s2=new Select(month);
		s2.selectByIndex(11);
		Thread.sleep(2000);
		s2.selectByIndex(11);
		Thread.sleep(2000);
		s2.selectByValue("10");
		Thread.sleep(2000);
		s2.selectByVisibleText("Jul");
		
		
			
	}

}
