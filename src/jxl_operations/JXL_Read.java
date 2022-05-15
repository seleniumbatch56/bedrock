package jxl_operations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class JXL_Read {
	
	@Test
	public void testReadData() throws BiffException, IOException {
		
		FileInputStream fis = new FileInputStream("D:\\Batch 56\\Selenium\\Excel data\\Languages.xls");
		
		Workbook wb = Workbook.getWorkbook(fis);
		
		Sheet s = wb.getSheet(0);
		
		int rows = s.getRows();
		
		int columns = s.getColumns();
		
		System.out.println("Total No.of Rows: "+ rows);
		
		System.out.println("Total No.of Columns: "+ columns);
		
		//String data = s.getCell(0,0).getContents();
		
		//System.out.println(data);
		
		for(int i=0; i<s.getRows() ;i++) {
			
			 String data = s.getCell(0,i).getContents();
			 
			 System.out.println(data);
			
		}
	}

}
