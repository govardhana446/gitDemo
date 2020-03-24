package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffLoginScreen 
{

	WebDriver driver;
	public RediffLoginScreen(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	By UserName=By.xpath("//input[@name='login']");
	By Password=By.id("password");
	By SignInButton=By.xpath("//input[@type='submit']");
	
	public WebElement UserName() 
	{
		return driver.findElement(UserName);
		
	}
	
	public WebElement password()
	{
		return driver.findElement(Password);
	}
	
	public WebElement SignInButton()
	{
	return driver.findElement(SignInButton);
	}
}
