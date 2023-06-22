package Framework;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class Utility {//screen shot
	public  static String readdata(int row,int cell) throws IOException {
		FileInputStream f=new FileInputStream("C:\\Users\\Avinash\\Desktop\\Testing Xl Sheet\\Testing Sheet.xlsx");
		Sheet sht= WorkbookFactory.create(f).getSheet("Sheet1");
		String data=sht.getRow(row).getCell(cell).getStringCellValue();
		return data;
		
	}
	public static void takescreenshot(WebDriver driver) throws IOException {
		Date d= new Date();
		String date=d.toString().replace(":","_");
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest= new File("C:\\Users\\Avinash\\Desktop\\Ajit\\Screenshot\\image"+date+".jpg");
		Files.copy(src,dest);
		
	}
	
	

}
