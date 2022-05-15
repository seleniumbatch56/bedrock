package jxl_operations;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.testng.annotations.Test;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class JXL_Write {

	@Test
	public void testWriteData() throws IOException, RowsExceededException, WriteException {

		FileOutputStream fos = new FileOutputStream("D:\\Batch 56\\Selenium\\Excel data\\ExcelWrite.xls");

		WritableWorkbook wb = Workbook.createWorkbook(fos);

		WritableSheet ws = wb.createSheet("TestData", 0);

		Label l = new Label(0, 0, "Satish");

		ws.addCell(l);

		l = new Label(0, 1, "Naresh");

		ws.addCell(l);

		l = new Label(0, 2, "Saddam");

		ws.addCell(l);

		l = new Label(0, 3, "Mubarak");

		ws.addCell(l);

		l = new Label(0, 4, "Arshiya");

		ws.addCell(l);

		l = new Label(0, 5, "Nandini");

		ws.addCell(l);

		l = new Label(0, 6, "Lakshmi");

		ws.addCell(l);

		l = new Label(0, 7, "Savithri");

		ws.addCell(l);
		
		l = new Label(0, 8, "Sowmya");

		ws.addCell(l);

		wb.write();
		
		wb.close();


	}
}
