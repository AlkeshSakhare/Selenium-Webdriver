package BasicStuff;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch
{
    
    public static void main(String[] args)
    {
	// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://google.com");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.id("lst-ib")).sendKeys("testing");
	driver.findElement(By.xpath("")).click();
    }
    
}
