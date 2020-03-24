package baseUtil;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.lang.Object;

//import org.apache.logging.log4j.core.util.FileUtils;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base 
{

	public  WebDriver driver;
	public  Properties prop;
	//public String basepath;
	public File src;
	public String basepath=System.getProperty("user.dir");
	public WebDriver InitilizeBrowser() throws IOException
	{
	    prop=new Properties();
		FileInputStream fis=new FileInputStream("resources\\prop.properties");
		prop.load(fis);
		
		if(prop.getProperty("Browser").contains("Chrome"))
		{
			ChromeOptions options=new ChromeOptions();
			if(prop.getProperty("Browser").contains("headless"))
			{
			options.addArguments("headless");
			}
			System.setProperty("webdriver.chrome.driver", basepath+"\\resources\\chromedriver.exe");
			driver=new ChromeDriver(options);
		}
		
		else if(prop.getProperty("Browser").equalsIgnoreCase("FireFox")) 
		{
			System.setProperty("webdriver.gecko.driver", basepath+"\\resources\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		
		else
		{
			System.setProperty("webdriver.ie.driver", basepath+"\\resources\\IEDriverServer.exe");
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;
	}
	
	public void GetScreenShot(String name) throws IOException
	{
	    src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File(basepath+"resources\\"+name+"screenshot.png"));	
		
	}
}
