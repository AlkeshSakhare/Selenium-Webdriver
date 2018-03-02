package BasicStuff;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class CodeProperty
{
    static WebDriver	 driver;
    public static String browser;
    
    public static void main(String[] args) throws IOException
    {
	setBrowser();
	setBrowserConfig();
	runTest();
    }
    
    public static void setBrowser() throws IOException
    {
	Properties prop = new Properties();
	InputStream file = new FileInputStream(
	        "D:\\Alkesh\\Course\\Adv Java\\Automation\\src\\properties\\config.properties");
	prop.load(file);
	browser = prop.getProperty("browser");
	
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
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.quit();
    }
    
}