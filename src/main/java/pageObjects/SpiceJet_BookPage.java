package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SpiceJet_BookPage 
{
	WebDriver driver;
	public SpiceJet_BookPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[text()='Login / Signup'][contains(@id,'HyperLinkLogin')]")
	WebElement loginSignUp;
	@FindBy(xpath="//li[@class=\"li-login float-right tabres\"]//a[text()='Travel Agent Login']")
	WebElement travelAgentLogin;
	@FindBy(css="#ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT")
	WebElement departureCity;
	@FindBy(css="#ctl00_mainContent_ddl_destinationStation1_CTXT")
	WebElement arrivalCity;
	@FindBy(css="input[class='custom_date_pic required home-date-input'][id='custom_date_picker_id_1']")
	WebElement departDate;
	@FindBy(xpath="(//div[@id='ui-datepicker-div']//table)[1]//td")
	WebElement datesOfMonth;
	@FindBy(css="#divpaxinfo")
	WebElement passengersDropdown;
	@FindBy(xpath="//select[@id='ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_ADT']/option")
	WebElement adultDropdown;
	@FindBy(xpath="//span[text()=' Adult 12+ years old on the date of travel']")
	WebElement adultTooltip;
	@FindBy(xpath="//span[text()=' Children aged 2 - 12 years old on the date of travel']")
	WebElement childTooltip;
	@FindBy(xpath="//span[text()='Infants are children that are under 2 years old on the date of travel']")
	WebElement infantTooltip;
	@FindBy(xpath="//input[@type='submit']/following::span[text()='SEARCH']")
	WebElement searchButton;
	@FindBy(xpath="//div[text()='No city matches your search.']")
	WebElement searchWarningText;
	public WebElement loginSignUp() 
	{
		return loginSignUp;
	}
	public WebElement travelAgentLogin()
	{
		return travelAgentLogin;
	}
	public WebElement departureCity()
	{
		return departureCity;
	}
	public WebElement arrivalCity()
	{
		return arrivalCity;
	}
	public WebElement departDate()
	{
		return departDate;
	}
	public WebElement datesOfMonth()
	{
		return datesOfMonth;
	}
	public WebElement passengersDropdown()
	{
		return passengersDropdown;
	}
	public WebElement adultDropdown()
	{
		return adultDropdown;
	}
	public WebElement adultTooltip()
	{
		return adultTooltip;
	}
	public WebElement childTooltip()
	{
		return childTooltip;
	}
	public WebElement infantTooltip()
	{
		return infantTooltip;
	}
	public WebElement searchButton()
	{
		return searchButton;
	}
	public WebElement searchWarningText()
	{
		return searchWarningText;
	}
}
