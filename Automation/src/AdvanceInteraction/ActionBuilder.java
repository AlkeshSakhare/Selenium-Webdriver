package AdvanceInteraction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionBuilder {

    public static void main(String[] args) throws InterruptedException {
	// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("http://www.tagindex.net/html/form/select.html");
	Thread.sleep(5000);
	WebElement item1 = driver.findElement(By.xpath("//select[@size='5']//option[@value='item1']"));
	WebElement item2 = driver.findElement(By.xpath("//select[@size='5']//option[@value='item3']"));
	WebElement item3 = driver.findElement(By.xpath("//select[@size='5']//option[@value='item5']"));
	System.out.println(item1.getText());
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	try {
	    Thread.sleep(5000);
	    Actions builder = new Actions(driver);
	    builder.keyDown(Keys.CONTROL).click(item1).click(item2).click(item3).keyUp(Keys.CONTROL);
	    builder.perform();
	} catch (Exception e) {
	    // TODO: handle exception
	    System.out.println(e);
	}
	driver.quit();

    }

}
