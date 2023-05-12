package com.pack1.excel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class InsetAllData {

	public static void main(String[] args) throws Exception 
	{
		FileInputStream fis = new FileInputStream("D:\\Class_Recording\\JDWExcelData.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		Sheet sheet = workbook.createSheet("Pritam QLCADDA");
		
		Map<String, Object[]> m = new LinkedHashMap<String, Object[]>();
		
		Object[] o = {1, "Country", "State", "State Code", "State code 1", "Result"};
		Object[] o1 = {1, "India", "KA", "BBS", "BR", "YES"};
		Object[] o2 = {2, "USA", "KA", "BBS", "BR", "NO"};
		Object[] o3 = {3, "NY", "KA", "BBS", "BR", "YES"};
		Object[] o4 = {4, "UK", "KA", "BBS", "BR", "No"};
		Object[] o5 = {5, "JR", "KA", "BBS", "BR", "YES"};
		
		m.put("1", o);
		m.put("2", o1);
		m.put("3", o2);
		m.put("4", o3);
		m.put("5", o4);
		m.put("6", o5);
		
		Set<String> keys = m.keySet();
		int rowNum = 0;
		for(String key : keys)
		{
			Row row = sheet.createRow(rowNum++);
			Object[] objs = m.get(key);
			int colNum = 0;
			for(Object obj : objs)
			{
				Cell cell = row.createCell(colNum++);
				if(obj instanceof String)
				{
					cell.setCellValue((String)obj);
				}
				if(obj instanceof Integer)
				{
					cell.setCellValue((Integer)obj);
				}
			}
		}
		FileOutputStream fos = new FileOutputStream("D:\\Class_Recording\\JDWExcelData.xlsx");
		workbook.write(fos);
		fos.close();
		
		System.out.println("Value Inserted");
	}

}
