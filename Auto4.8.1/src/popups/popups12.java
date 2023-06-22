package popups;

import java.util.Iterator;
import java.util.Set;

//import java.util.Iterator;
//import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class popups12 {
	public static void main(String[] args) throws InterruptedException {
		System.getProperty("webdriver.gecko.driver","C:\\Users\\Avinash\\Desktop\\Ajit\\firefox\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@id='windowButton']")).click();
		Set<String> id= driver.getWindowHandles();
		System.out.println(id.size());
		System.out.println(id);
		Iterator<String> Itr=id.iterator();
		while(Itr.hasNext()) {
		//String mainWin=Itr.next();
		String childpop=Itr.next();
		driver.switchTo().window(childpop);
		Thread.sleep(2000);
		driver.manage().window().minimize();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.close();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Ajit");
			
		
	}
	

	}
}


	
