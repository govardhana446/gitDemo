package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingSearchScreen 
{
	WebDriver driver;
	public ShoppingSearchScreen(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='rediff.com']")
	WebElement homepage;
	
	@FindBy(xpath="//a[@title='Online Shopping']")
	WebElement ShoppingIcon;
	
	@FindBy(id="srchword")
	WebElement Searchbox;
	
	@FindBy(xpath="//input[@value='Search']")
	WebElement SearchButton;

	public WebElement ShoppingIcon()
	{
		return ShoppingIcon;
	}
	
	public WebElement Searchbox()
	{
		return Searchbox;
	}
	
	public WebElement SearchButton()
	{
		return SearchButton;
	}
	
	public WebElement homepage()
	{
		return homepage;
	}
}
