package com.pack1.excel;

import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FetchAllRowValue
{
	public static void main(String[] args)
	{
		try
		{
			FileInputStream fis = new FileInputStream("D:\\Class_Recording\\JDWExcelData.xlsx");
						
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			
			XSSFSheet sheet = workbook.getSheet("JDW");
			
			XSSFRow row = sheet.getRow(3);
			
			//int lastCell = row.getLastCellNum();
			//for(int i=0; i<lastCell; i++)
			
			Iterator<Cell> itr = row.cellIterator();
			while(itr.hasNext())
			{
				//Cell cell = row.getCell(i);
				Cell cell = itr.next();
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
		catch(Exception e) 
		{
			System.out.println(e);
		}
	}
}
