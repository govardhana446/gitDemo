package testScripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseUtil.Base;
import pageObjects.SpiceJet_BookPage;

public class BookModuleTest extends Base
{
	public SpiceJet_BookPage bookPage;
	
	@BeforeTest
	public void AppLaunch() throws IOException
	{
		driver=InitilizeBrowser();
		driver.get(prop.getProperty("URL"));
	}
	@AfterTest
	public void TearDown() 
	{
	driver.close();	
	driver=null;
	}

	//in landing page, verify the tooltips in passengers drop down
	//Verify the warning messages without selecting From and To drop downs and click on Search button in book page
    //Verify tooltips and checkboxes in book page
    //Verify no matches message when user try to select TO data alone
	@Test
	public void SearchResultMessageTest()
	{
		bookPage=new SpiceJet_BookPage(driver);
		bookPage.arrivalCity().click();
		bookPage.arrivalCity().sendKeys("BLR");
		Assert.assertEquals(bookPage.searchWarningText().getText(), "No city matches your search.");
	}
	
}
