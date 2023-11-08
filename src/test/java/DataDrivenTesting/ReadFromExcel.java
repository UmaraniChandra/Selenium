package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//step1: convert physical file into java readable object
		FileInputStream fis=new FileInputStream("./src/test/resources/Book1.xlsx");
		
		//step 2:open Workbook
		//workbookFactory.create(fis)-->throws EncryptedDocumentException and
		Workbook wb=WorkbookFactory.create(fis);
		
		//step3:Get control over Sheet
		Sheet sh=wb.getSheet("Sheet1");
		//step4:Get control over row
		Row r=sh.getRow(3);
		Row r1=sh.getRow(1);
		
		
		//step5:Get control over cell
		Cell c=r.getCell(1);
		Cell c1=r1.getCell(1);
		
		
		//step6:read data
		System.out.println(c.getStringCellValue());
		System.out.println(c1.getNumericCellValue());
		
		//step7:close workbook
		wb.close();
	}

}
