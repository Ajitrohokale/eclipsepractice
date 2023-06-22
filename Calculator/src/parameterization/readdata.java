package parameterization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

@SuppressWarnings("unused")
public class readdata {
	public void read() throws EncryptedDocumentException, IOException {
		File f =new File("C:\\Users\\Avinash\\Desktop\\New folder\\Test data\\ajit.xlsx");
		FileInputStream fis= new FileInputStream(f);
		Workbook wb=WorkbookFactory.create(fis);
		String sheet=wb.getSheetAt(0).getRow(0).getCell(0).getStringCellValue();
		
		System.out.println(sheet);
		fis.close();
	}

}
