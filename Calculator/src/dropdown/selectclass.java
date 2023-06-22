package dropdown;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import conf.pathconf;
public class selectclass { //for drop down
	public void dropdown() throws InterruptedException {
		System.setProperty(pathconf.web,pathconf.chromepath);//import from conf package>pathconf class
		WebDriver driver=new ChromeDriver();
		driver.get(pathconf.appurl);
		driver.manage().window().maximize();
		WebElement month=driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select s1=new Select(month);
		Thread.sleep(2000);
		s1.selectByIndex(1);//selection start from value 1= feb 
		Thread.sleep(3000);
		s1.selectByValue("4");//selection by value 4= april
		Thread.sleep(3000);
		s1.selectByVisibleText("Aug");
		Thread.sleep(3000);
		s1.deselectAll();
		
		
		
			
	}
	

}
