package cts.selenium.harsha;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File src = new File("C:\\Users\\HARSHA\\eclipse-workspace\\cts-selenium-harsha\\src\\test\\resources\\XLSX\\TestData.xlsx");
		FileInputStream fis  = new FileInputStream(src);

		XSSFWorkbook wb = new XSSFWorkbook(fis);
		//Getting data of sheet1 in excel which is at at index 0
		XSSFSheet sheet1 = wb.getSheetAt(0);
		//To get data of first row and first coloumn from sheet
		String data0 = sheet1.getRow(0).getCell(0).getStringCellValue();
		System.out.println("Data from Sheet cell A ----> " + data0);

		String data1 =sheet1.getRow(0).getCell(1).getStringCellValue();

		System.out.println("Data from Sheet cell B ----> " + data1);

	}

}
