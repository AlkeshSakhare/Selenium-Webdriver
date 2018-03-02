package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstTest {
    @Test
    public void f() {
	System.out.println("I'm @Test");
    }

    @BeforeMethod
    public void beforeMethod() {
	System.out.println("I'm @BeforeMethod");
    }

    @AfterMethod
    public void afterMethod() {
	System.out.println("I'm @AfterMethod");
    }

    @BeforeClass
    public void beforeClass() {
	System.out.println("I'm @BeforeClass");
    }

    @AfterClass
    public void afterClass() {
	System.out.println("I'm @fterClass");
    }

    @BeforeTest
    public void beforeTest() {
	System.out.println("I'm @BeforeTest");
    }

    @AfterTest
    public void afterTest() {
	System.out.println("I'm @AfterTest");
    }

    @BeforeSuite
    public void beforeSuite() {
	System.out.println("I'm @BeforeSuite");
    }

    @AfterSuite
    public void afterSuite() {
	System.out.println("I'm  @AfterSuite");
    }

}
