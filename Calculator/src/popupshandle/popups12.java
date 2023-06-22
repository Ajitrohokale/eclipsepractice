package popupshandle;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import conf.pathconf;

public class popups12 {
	public void popup() throws InterruptedException {
		System.getProperty(pathconf.web,pathconf.chromepath);
		WebDriver driver=new ChromeDriver();
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
			
		}
		
	}

}
