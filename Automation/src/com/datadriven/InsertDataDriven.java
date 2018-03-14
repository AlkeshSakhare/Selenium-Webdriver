package com.datadriven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.excel.utility.Xls_Reader;

public class InsertDataDriven {

    public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	String baseURL = "https://reg.ebay.com/reg/PartialReg?ru=https%3A%2F%2Fcommunity.ebay.com%2Ft5%2FHalf-com%2Fbd-p%2F21000000002";
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get(baseURL);

	Xls_Reader reader = new Xls_Reader(
		"C:\\Users\\Alkesh\\git\\Selenium-Webdriver\\Automation\\src\\com\\testdata\\Test.xlsx");
	reader.addColumn("Ebaydata", "Status");

	int row = reader.getRowCount("Ebaydata");
	for (int rowno = 2; rowno <= row; rowno++) {
	    String firstname = reader.getCellData("Ebaydata", "firstname", rowno);
	    System.out.print(firstname + " \t ");

	    String lastname = reader.getCellData("Ebaydata", "lastname", rowno);
	    System.out.print(lastname + " \t ");

	    String emailaddress = reader.getCellData("Ebaydata", "emailAddress", rowno);
	    System.out.print(emailaddress + " \t ");

	    String password = reader.getCellData("Ebaydata", "password", rowno);
	    System.out.println(password + " \t ");

	    WebElement first = driver.findElement(By.id("firstname"));
	    first.clear();
	    first.sendKeys(firstname);

	    WebElement last = driver.findElement(By.id("lastname"));
	    last.clear();
	    last.sendKeys(lastname);
	    WebElement email = driver.findElement(By.id("email"));
	    email.clear();
	    email.sendKeys(emailaddress);
	    WebElement passw = driver.findElement(By.id("PASSWORD"));
	    passw.clear();
	    passw.sendKeys(password);

	    reader.setCellData("Ebaydata", "Status", rowno, "Pass");
	}

    }
}
