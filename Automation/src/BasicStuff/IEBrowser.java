package BasicStuff;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEBrowser {

    public static void main(String[] args) {

	String IEDriverLocation = "D:\\Alkesh\\Job Prep\\Selenium\\IEDriverServer_Win32_3.9.0\\IEDriverServer.exe";
	System.setProperty("webdriver.ie.driver", IEDriverLocation);
	WebDriver driver = new InternetExplorerDriver();

	driver.get("https://www.google.co.in");
	driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
	driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "t");
	ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	System.out.println(tabs);
	driver.get("https://yahoo.com");

    }

}
