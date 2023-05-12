package com.pack1.excel;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FetchParticularCellValue 
{
	public static void getCellValue(int rowNo, int colNo)
	{
		try
		{
			// Open the Excelsheet in read mode
			FileInputStream fis = new FileInputStream("D:\\Class_Recording\\JDWExcelData.xlsx");
			
			// Load the Excel sheet in to the Workbook
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			
			// Go to sheet
			XSSFSheet sheet = workbook.getSheet("JDW");
			
			// Go to row
			XSSFRow row = sheet.getRow(rowNo);
			
			// Go to column
			XSSFCell cell = row.getCell(colNo);
			
			CellType cellType = cell.getCellType();
			
			switch(cellType)
			{
				case STRING:
					String val = cell.getStringCellValue();
					System.out.println(val);
					break;
					
				case NUMERIC:
					double val1 = cell.getNumericCellValue();
					System.out.println(val1);
					break;
				
				case BOOLEAN:
					boolean b1 = cell.getBooleanCellValue();
					System.out.println(b1);
					break;
			}
			
		}
		catch (Exception e) 
		{
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) 
	{
		getCellValue(2, 4);
	}

}
