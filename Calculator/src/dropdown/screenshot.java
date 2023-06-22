package dropdown;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import conf.pathconf;

public class screenshot {
	public void takeSS() throws IOException {
		System.setProperty(pathconf.web,pathconf.chromepath);
		WebDriver driver=new ChromeDriver();
		driver.get(pathconf.appurl);
		driver.manage().window().maximize();
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\Avinash\\Desktop\\New folder\\Screenshot\\image.jpg");
		Files.copy(src,dest);
		
	}
	public void tssfcd() throws IOException { //tssfcd=take screenshot for current date
		System.setProperty(pathconf.web,pathconf.chromepath);
		WebDriver driver=new ChromeDriver();
		driver.get(pathconf.appurl);
		driver.manage().window().maximize();
		File TSS= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest1=new File("C:\\Users\\Avinash\\Desktop\\New folder\\Screenshot\\image"+currentdate()+".jpg");
		Files.copy(TSS,dest1);
		
		
		
	}
	public static  String currentdate() {
		Date d=new Date();
		String date=d.toString().replace(":","_");
		return date;
	}
	public void scree3() throws IOException {
		System.setProperty(pathconf.web, pathconf.chromepath);
		WebDriver driver=new ChromeDriver();
		driver.get(pathconf.appurl);
		driver.manage().window().maximize();
		Date date1= new Date();
		String  date=date1.toString().replace(";", "_");
		File tss2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File des=new File("C:\\Users\\Avinash\\Desktop\\New folder\\Screenshot\\image"+date+".jpg");
		Files.copy(tss2, des);
		
	}

}
	