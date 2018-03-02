package BasicStuff;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class CodeModular
{
    static WebDriver driver;
    static String    browser;
    
    public static void main(String[] args)
    {
	// TODO Auto-generated method stub
	setBrowser();
	setBrowserConfig();
	runTest();
    }
    
    public static void setBrowser()
    {
	browser = "firefox";
	
    }
    
    public static void setBrowserConfig()
    {
	if (browser.equalsIgnoreCase("firefox"))
	{
	    System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
	    driver = new FirefoxDriver();
	}
	else if (browser.equalsIgnoreCase("chrome"))
	{
	    System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	}
	else if (browser.equalsIgnoreCase("ie"))
	{
	    String IEDriverLocation = "C:\\IEDriverServer.exe";
	    System.setProperty("webdriver.ie.driver", IEDriverLocation);
	    driver = new InternetExplorerDriver();
	}
	else
	{
	    
	    System.out.println("Please enter valid browser name");
	    
	}
	
    }
    
    public static void runTest()
    {
	driver.get("https://www.seleniumhq.org/");
    }
    
}
