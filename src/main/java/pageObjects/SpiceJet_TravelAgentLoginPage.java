package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SpiceJet_TravelAgentLoginPage 
{
	WebDriver driver;
	public SpiceJet_TravelAgentLoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css="#ControlGroupLoginAgentView_AgentLoginView_TextBoxUserID")
	 WebElement travelAgentUserName;
	@FindBy(css="input[type='password']")
	 WebElement travelAgentPassWord;
	@FindBy(css="input[value='Log In']")
	 WebElement logInButton;
	@FindBy(xpath="//p[text()='Invalid user credentials']")
	 WebElement invalidLoginAlert;
	@FindBy(xpath="//span[text()='TRAVEL AGENT LOGIN']")
	WebElement travelAgentPageTitle;
	
	public WebElement travelAgentUserName()
	{
		return travelAgentUserName;
	}
	public WebElement travelAgentPassWord()
	{
		return travelAgentPassWord;
	}
	public WebElement logInButton()
	{
		return logInButton;
	}
	public WebElement invalidLoginAlert()
	{
		return invalidLoginAlert;
	}
	public WebElement travelAgentPageTitle()
	{
		return travelAgentPageTitle;
	}
	
}
