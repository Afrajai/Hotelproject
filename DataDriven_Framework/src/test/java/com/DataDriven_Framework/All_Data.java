package com.DataDriven_Framework;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class All_Data {
	
	//ALL DATA
	
	public static void readall_Data() throws Throwable {
		File f = new File("C:\\Users\\Welcome\\eclipse-workspace\\DataDriven_Framework\\src\\particular data.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		Sheet sheetAt = wb.getSheetAt(0);
		
		
		  int size = sheetAt.getPhysicalNumberOfRows(); 
		  for(int i=0;i<size;i++) 
		  { 
			  Row row = sheetAt.getRow(i);
		  
		  int cell_size = row.getPhysicalNumberOfCells(); 
		  
		  for(int j=0;j<cell_size;j++)
		  { 
			  Cell cell = row.getCell(j); 
			  CellType cellType = cell.getCellType();
		  
		  if(cellType.equals(CellType.STRING))
		  { 
			  String stringCellValue = cell.getStringCellValue();
			  System.out.println(stringCellValue);
			  } 
		  else if(cellType.equals(CellType.NUMERIC))
		  { 
			  double numericCellValue = cell.getNumericCellValue();
		  
		  int value = (int) numericCellValue; 
		  
		  System.out.println(value);
		  } }}}
	
	//ROW DATA
	
	  public static void row_Data() throws Throwable { 
		  File f2 = new File("C:\\Users\\Welcome\\eclipse-workspace\\DataDriven_Framework\\src\\particular data.xlsx");
	  
	  FileInputStream fis2 = new FileInputStream(f2);
	  
	  Workbook wb2 = new XSSFWorkbook(fis2);
	  
	  Sheet sheetAt = wb2.getSheetAt(0); 
	 
	 int size = sheetAt.getPhysicalNumberOfRows(); 
	  
	  System.out.println("-----------row data--------------");
	  Row row = sheetAt.getRow(1);
		  for(int i=0;i<size;i++) 
		  { 
			   Cell cell = row.getCell(1); 
			  CellType cellType = cell.getCellType();
		  
		  if(cellType.equals(CellType.STRING))
		  { 
			  String stringCellValue = cell.getStringCellValue();
			  System.out.println(stringCellValue);
			  } 
		  else if(cellType.equals(CellType.NUMERIC))
		  { 
			  double numericCellValue = cell.getNumericCellValue();
		  
		  int value = (int) numericCellValue; 
		  
		  System.out.println(value);
		  } }}
	  
	  //COLUMN DATA
	
	  public static void column_Data() throws Throwable { 
		  File f3 = new File("C:\\Users\\Welcome\\eclipse-workspace\\DataDriven_Framework\\src\\particular data.xlsx");
	  
	  FileInputStream fis3 = new FileInputStream(f3);
	  
	  Workbook wb3 = new XSSFWorkbook(fis3);
	  
	  Sheet sheetAt = wb3.getSheetAt(0); 
	 
	  int size = sheetAt.getPhysicalNumberOfRows(); 
	  
	
	  System.out.println("------------column data  ---------------");
		  for(int i=0;i<size;i++) 
		  {
			  
			  Row row = sheetAt.getRow(i);
		  
			   Cell cell = row.getCell(1); 
			  CellType cellType = cell.getCellType();
		  
		  if(cellType.equals(CellType.STRING))
		  { 
			  String stringCellValue = cell.getStringCellValue();
			  System.out.println(stringCellValue);
			  } 
		  else if(cellType.equals(CellType.NUMERIC))
		  { 
			  double numericCellValue = cell.getNumericCellValue();
		  
		  int value = (int) numericCellValue; 
		  
		  System.out.println(value);
		  } }}
	
	  
	  
	  
	  
	  
		public static void main(String[] args) throws Throwable {
			readall_Data();
			row_Data();
			column_Data();
			
			


}
}
