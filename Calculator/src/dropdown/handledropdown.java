package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class handledropdown {
	public void web() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Avinash\\Desktop\\New folder\\Webdd\\chromedriver.exe");
	}
	public void demo1() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Avinash\\Desktop\\New folder\\Webdd\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		driver.manage().window().maximize();
		WebElement day=driver.findElement(By.xpath("//*[@id=\"month\"]"));
		Select s1=new Select(day);
		List<WebElement> ar =s1.getOptions();//get option from from month 
		System.out.println(ar.size());
		for(int i=0; i<ar.size()-1;i++) {
			System.out.println(ar.get(i).getText());
			
		}
	}
	public void dayoption() {
		handledropdown web1 = new handledropdown();
		web1.web();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		driver.manage().window().maximize();
		WebElement month=driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select s2 =new Select(month);
		List<WebElement>ar=s2.getOptions();
		System.out.println(ar.size());
		for(int j=0;j<ar.size();j++) {
			System.out.println(ar.get(j).getText());
			
		}
		
	}
}
