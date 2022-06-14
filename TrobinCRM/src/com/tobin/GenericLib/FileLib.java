package com.tobin.GenericLib;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

 import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {

	public String readPropertyData(String path,String key) throws Throwable
	{
		FileInputStream fis=new FileInputStream(path);
		Properties p=new Properties();
		p.load(fis);
		return p.getProperty(key, "incorrect key");
	}
	
	public String readExcelData(String path,String sheet,int row,int cell) throws Throwable
	{
		 FileInputStream fis=new FileInputStream(path);
		Workbook wb=WorkbookFactory.create(fis);
		return wb.getSheet(sheet).getRow(row).getCell(cell).toString();
		
		
	}
	public void writeExcelData(String path,String sheetname,int row,int cell ,String value) throws Throwable
	{
		
		FileInputStream fis=new FileInputStream(path);
		Workbook wb=WorkbookFactory.create(fis);
		wb.createSheet(sheetname).getRow(row).createCell(cell).setCellValue(value);
		FileOutputStream fos=new FileOutputStream(path);
		wb.write(fos);
		}

}



	
