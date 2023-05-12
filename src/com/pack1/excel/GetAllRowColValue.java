package com.pack1.excel;

import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GetAllRowColValue 
{
	public static void main(String[] args) throws Exception
	{
		FileInputStream fis = new FileInputStream("D:\\Class_Recording\\JDWExcelData.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = workbook.getSheet("JDW");
		
		Iterator<Row> ritr = sheet.rowIterator();
		
		while(ritr.hasNext())
		{
			Row row = ritr.next();
			Iterator<Cell> citr = row.cellIterator();
			while(citr.hasNext())
			{
				Cell cell = citr.next();
				CellType cellType = cell.getCellType();
				switch(cellType)
				{
					case STRING:
						System.out.print(cell.getStringCellValue()+" ");
						break;
					case NUMERIC:
						System.out.print(cell.getNumericCellValue()+" ");
						break;
					case BOOLEAN:
						System.out.print(cell.getBooleanCellValue()+"  ");
						break;
				}
			}
			System.out.println();
		}
	}

}
