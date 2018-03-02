package properties;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import BasicStuff.PropCodeMode;

public class CallProperty
{
    static Properties prop = new Properties();
    
    public static void main(String[] args) throws IOException
    {
	// TODO Auto-generated method stub
	readProperty();
	
    }
    
    public static void writeProperty() throws IOException
    {
	// TODO Auto-generated method stub
	OutputStream writefile = new FileOutputStream(
	        "D:\\Alkesh\\Course\\Adv Java\\Automation\\src\\properties\\config.properties");
	prop.setProperty("browser", "chrome");
	prop.store(writefile, null);
    }
    
    public static void readProperty() throws IOException
    {
	
	InputStream file = new FileInputStream(
	        "D:\\Alkesh\\Course\\Adv Java\\Automation\\src\\properties\\config.properties");
	prop.load(file);
	PropCodeMode.browser = prop.getProperty("browser");
	System.out.println(PropCodeMode.browser);
	
    }
    
}
