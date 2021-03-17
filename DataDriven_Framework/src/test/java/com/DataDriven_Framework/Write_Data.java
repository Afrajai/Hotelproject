package com.DataDriven_Framework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Data {
	
	public static void write_data() throws Throwable
	{
		File f = new File("C:\\Users\\Welcome\\Desktop\\Amazonuser.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);
		
		Sheet createSheet = wb.createSheet("user1");
		
	    Row createRow = createSheet.createRow(0);
		
	    Cell createCell = createRow.createCell(0);
		
		createCell.setCellValue("username");
		
		wb.getSheet("user1").getRow(0).createCell(1).setCellValue("password");
	
		FileOutputStream fos = new FileOutputStream(f);
		
		wb.write(fos);
		
		wb.close();
		System.out.println("sheet created");
		
	}
	
		
		public static void main(String[] args) throws Throwable  {
			write_data();
			
		}
		
		
	}
	
	
	


