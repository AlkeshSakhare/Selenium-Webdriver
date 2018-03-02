package BasicStuff;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEBrowser
{
    
    public static void main(String[] args)
    {
	
	String IEDriverLocation = "C:\\IEDriverServer.exe";
	System.setProperty("webdriver.ie.driver", IEDriverLocation);
	WebDriver driver = new InternetExplorerDriver();
	driver.get("https://www.seleniumhq.org");
	driver.close();
	
    }
    
}
