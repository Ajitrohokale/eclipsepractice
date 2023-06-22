package youtube;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import conf.pathconf;

public class autosuggestion {

	public static void main(String[] args) throws InterruptedException {
		System.getProperty(pathconf.web,pathconf.firefoxpath);
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/webhp?hl=en&sa=X&ved=0ahUKEwiTyPbe3_v9AhW07zgGHaMvAoIQPAgI");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mclaren");
		Thread.sleep(5000);
		List<WebElement> elements= driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
		System.out.println(elements.size());
		for (int i=0;i<=elements.size()-1;i++) {
			String txt=elements.get(i).getText();
			System.out.println(txt);
			if(txt.contains("mclaren 720")){
				elements.get(i).click();
				break;
			}else
				System.out.println("not availble");
		}

		
		
	}

}
