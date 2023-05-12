package com.pack1.excel;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SetData
{
	public static void setCellData(String sheetName, int rowNum, int colNum, String res) throws Exception
	{
		FileInputStream fis = new FileInputStream("D:\\Class_Recording\\JDWExcelData.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = workbook.getSheet(sheetName);
		
		XSSFRow row = sheet.getRow(rowNum);
		
		XSSFCell cell = row.createCell(colNum);
		
		cell.setCellType(CellType.STRING);
		cell.setCellValue(res);
		
		// Open Excel sheet in write mode
		FileOutputStream fos = new FileOutputStream("D:\\Class_Recording\\JDWExcelData.xlsx");
		workbook.write(fos);
		fos.close();
		System.out.println("Result Updated");
	}
	public static void main(String[] args) throws Exception
	{
		setCellData("JDW", 3, 5, "PASS");
		setCellData("JDW", 4, 5, "FAIL");
		
	}

}
