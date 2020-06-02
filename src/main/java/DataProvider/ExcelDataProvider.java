package DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	
	XSSFWorkbook wb;
	
	// Created constructor. Codes inside constructor will be executed first.
	public ExcelDataProvider(){
		
		File file = new File("./TestData/ApplicationData.xlsx");
		
		try {
			FileInputStream fis = new FileInputStream(file);
			wb = new XSSFWorkbook(fis);
		} catch (Exception e) {
			System.out.println("Exception is : " + e.getMessage());
		}
	}
	
	public String getData(String sheetName,int row,int col){
		String data=wb.getSheet(sheetName).getRow(row).getCell(col).getStringCellValue();
		return data;
	}

}
