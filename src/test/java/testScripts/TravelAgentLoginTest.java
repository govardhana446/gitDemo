package testScripts;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseUtil.Base;
import pageObjects.SpiceJet_BookPage;
import pageObjects.SpiceJet_TravelAgentLoginPage;

public class TravelAgentLoginTest extends Base
{
	
	public SpiceJet_BookPage bookPage;
	public SpiceJet_TravelAgentLoginPage travelAgentLoginPage;
	@BeforeTest
	public void AppLaunch() throws IOException
	{
		driver=InitilizeBrowser();
		driver.get(prop.getProperty("URL"));
	}
	
	//Verify the travel agenct invalid login
	@Test
	public void TravelAgentInvalidLoginTest()
	{
		 bookPage=new SpiceJet_BookPage(driver);
		 travelAgentLoginPage=new SpiceJet_TravelAgentLoginPage(driver);
		Actions action =new Actions(driver);
		action.moveToElement(bookPage.loginSignUp()).build().perform();
	//	bookPage.loginSignUp().click();
		bookPage.travelAgentLogin().click();
		travelAgentLoginPage.travelAgentUserName().sendKeys("govardhana");
        travelAgentLoginPage.travelAgentPassWord().sendKeys("govardhana");		
		travelAgentLoginPage.logInButton().click();
		Assert.assertEquals(travelAgentLoginPage.invalidLoginAlert().getText(), "Invalid user credentials");
	}
	
	@Test(dependsOnMethods= {"TravelAgentInvalidLoginTest"})
	public void TravelAgencyTitleTest()
	{
		String actualText=travelAgentLoginPage.travelAgentPageTitle().getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText, "TRAVEL AGENT SIGNIN");
		System.out.println("test completed");
	}
	
	@AfterTest
	public void TearDown() 
	{
	driver.close();	
	}
	
//		List<WebElement>Dates=driver.findElements(By.xpath("(//div[@id='ui-datepicker-div']//table)[1]//td"));
//	int count=Dates.size();
//	for(int i=0;i<count;i++)
//	{
//	WebElement Date=Dates.get(i);
//	String Desired_Date=Date.getText();
//	if(Desired_Date.equals("31"))
//	{
//	Date.click();
//	break;
//	}
//	}
//
//		List<WebElement>Adults=driver.findElements(By.xpath("//select[contains(@name,'ddl_Adult')]/option"));
//	int TotalAdults=Adults.size();
//
//	for(int i=0;i<TotalAdults;i++)
//	{
//	WebElement Adult=Adults.get(i);
//	if(Adult.getAttribute("value").equalsIgnoreCase("5"))
//	{
//	Adult.click();
//	break;
//	}
//	}
}
