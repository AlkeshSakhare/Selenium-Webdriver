package com.datadriven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.excel.utility.Xls_Reader;

public class DataDrivenFirst {

    public static void main(String[] args) {

	// ------------------Getting test data---------------------------
	Xls_Reader reader = new Xls_Reader(
		"C:\\Users\\Alkesh\\git\\Selenium-Webdriver\\Automation\\src\\com\\testdata\\Test.xlsx");

	String firstname = reader.getCellData("Ebaydata", "firstname", 2);
	System.out.print(firstname + " \t ");

	String lastname = reader.getCellData("Ebaydata", "lastname", 2);
	System.out.print(lastname + " \t ");

	String emailaddress = reader.getCellData("Ebaydata", "emailAddress", 2);
	System.out.print(emailaddress + " \t ");

	String password = reader.getCellData("Ebaydata", "password", 2);
	System.out.println(password + " \t ");
	// ------------------starting test---------------------------
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	String baseURL = "https://reg.ebay.com/reg/PartialReg?ru=https%3A%2F%2Fcommunity.ebay.com%2Ft5%2FHalf-com%2Fbd-p%2F21000000002";
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get(baseURL);

	driver.findElement(By.id("firstname")).sendKeys(firstname);
	driver.findElement(By.id("lastname")).sendKeys(lastname);
	driver.findElement(By.id("email")).sendKeys(emailaddress);
	driver.findElement(By.id("PASSWORD")).sendKeys(password);
    }

}
