package dropdown;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

import conf.pathconf;

public class StsAndDrop {//status drop down and screenshot
	public void StDASs() throws InterruptedException, IOException {
		System.setProperty(pathconf.web, pathconf.chromepath);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(pathconf.appurl);
		WebElement malebtn1 =driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		boolean sts1=malebtn1.isDisplayed();
		boolean sts2=malebtn1.isEnabled();
		boolean sts3=malebtn1.isSelected();
		System.out.println("before click is Displayed "+sts1);
		System.out.println("before click is Enabled "+sts2);
		System.out.println("before click is Selected "+sts3);
		driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
		Thread.sleep(2000);
		WebElement malebtn2 =driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		malebtn2.click();
		boolean sts4=malebtn2.isDisplayed();
		boolean sts5=malebtn2.isEnabled();
		boolean sts6=malebtn2.isSelected();
		System.out.println("After clicking is displayed "+sts4);
		System.out.println("After click is enabled " +sts5);
		System.out.println("After click is selected "+sts6);
		WebElement day=driver.findElement(By.xpath("//select[@id='day']"));
		Select Day=new Select(day);
		List<WebElement> op=Day.getOptions();
		System.out.println(op.size());
		for(int i=0;i< op.size();i++) {
			System.out.println(op.get(i).getText());
		}
		WebElement m=driver.findElement(By.xpath("//select[@id='month']"));
		Select Month=new Select(m);
		Month.selectByIndex(1);
		Month.selectByValue("5");
		Month.selectByVisibleText("Nov");
			
	}
	public void screenshot() throws IOException {
		System.setProperty(pathconf.web, pathconf.chromepath);
		WebDriver driver=new ChromeDriver();
		driver.get(pathconf.appurl);
		driver.manage().window().maximize();
		Date d=new Date();
		String d3 =d.toString().replace(";","_");
		File Screen=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File des=new File("C:\\Users\\Avinash\\Desktop\\New folder\\ScreenShot\\image"+d3+".jpg");
		Files.copy(Screen ,des );
		
	}

}
