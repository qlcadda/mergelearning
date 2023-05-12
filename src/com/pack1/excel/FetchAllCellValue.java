package com.pack1.excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FetchAllCellValue {

	public static void main(String[] args) throws Exception
	{
		FileInputStream fis = new FileInputStream("D:\\Class_Recording\\JDWExcelData.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = workbook.getSheet("JDW");
		
		int lstRowNum= sheet.getLastRowNum();
		for(int i=0; i<lstRowNum; i++)
		{
			Row row = sheet.getRow(i);
			Cell cell = row.getCell(1);
			CellType cellType = cell.getCellType();
			switch(cellType)
			{
				case STRING:
					System.out.println(cell.getStringCellValue());
					break;
				case NUMERIC:
					System.out.println(cell.getNumericCellValue());
					break;
				case BOOLEAN:
					System.out.println(cell.getBooleanCellValue());
					break;
			}
		}		
	}

}
