package com.mahendra;


import org.apache.poi.ss.usermodel.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelUtil {

	private static Workbook book;
	private static Sheet sheet;
	
	public static Object[][] readExcelData(String filePath ){		
		try {
		FileInputStream fis = new FileInputStream(new File(filePath));
		book = WorkbookFactory.create(fis);
		sheet = book.getSheet("Sheet1");
		int rows = sheet.getPhysicalNumberOfRows();
		// Count the non-empty cells in FIRST ROW
		int cols = sheet.getRow(0).getPhysicalNumberOfCells();
		Object[][] data = new Object[rows-1][cols];
		for(int i=1; i<rows; i++) {
			Row row = sheet.getRow(i);
			for (int j = 0; j<cols ;j++) {
				data[i-1][j]=row.getCell(j).toString();
			}
		}
			return data;
		}catch(IOException ex) {
			ex.printStackTrace();
			return null;
		}
	}
}
