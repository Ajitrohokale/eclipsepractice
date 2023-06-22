package status11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sts11 {

	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Avinash\\Desktop\\New folder\\Webdd\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php");
		boolean sts =driver.findElement(By.xpath("(//input[@type='radio'])[2]")).isSelected();
		System.out.println("status before click  "+sts);//false
		driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
		Thread.sleep(2000);
		boolean sts1 =driver.findElement(By.xpath("(//input[@type='radio'])[2]")).isSelected();
		System.out.println("status after click  "+sts1);//true
		
		
		
		
		
		

	}

}
