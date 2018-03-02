package BasicStuff;
import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {

    public static void main(String[] args) {
	// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver",
		"D:\\Alkesh\\Job Prep\\Selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://google.com");

	((JavascriptExecutor) driver).executeScript("window.open()");
	ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(tabs.get(1));
	driver.get("http://yahoo.com");

	driver.switchTo().window(tabs.get(0));
	driver.get("http://facebook.com");
	// This will close current tab
	driver.close();
	// This will quit browser
	// driver.quit();
    }

}
