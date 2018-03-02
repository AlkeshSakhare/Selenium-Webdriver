package BasicStuff;
import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowser {

    public static void main(String args[]) {

	System.setProperty("webdriver.gecko.driver",
		"D:\\Alkesh\\Job Prep\\Selenium\\geckodriver-v0.18.0-win32\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	// driver.get("https://www.google.co.in");
	// driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "t");
	// driver.get("http://facebook.com");
	driver.get("http://google.com");
	((JavascriptExecutor) driver).executeScript("window.open()");
	ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(tabs.get(1));
	driver.get("http://yahoo.com");
    }
}
