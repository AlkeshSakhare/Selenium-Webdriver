package com.datadriven;

import com.excel.utility.Xls_Reader;

public class ExcelFeatures {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Xls_Reader reader = new Xls_Reader(
		"C:\\Users\\Alkesh\\git\\Selenium-Webdriver\\Automation\\src\\com\\testdata\\Test.xlsx");
	String newSheetName = "NewSheet";
	if (!reader.isSheetExist(newSheetName))
	    reader.addSheet(newSheetName);
	else
	    System.out.println("Sheet" + newSheetName + " already exist");
    }

}
