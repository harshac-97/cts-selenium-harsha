package cts.selenium.harsha;

import cts.miniproject.utility.ExcelDataConfig;

public class ReadExcelData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//calling constructor  ExcelDataConfig to give file path
		ExcelDataConfig excel = new ExcelDataConfig("C:\\Users\\HARSHA\\eclipse-workspace\\cts-selenium-harsha\\src\\test\\resources\\XLSX\\TestData.xlsx");
		
		//calling method getData from ExcelDataConfig to give sheet no., row no.,col no.
		System.out.println(excel.getData(0, 0, 0));
		System.out.println(excel.getData(0, 0, 1));
	}

}
