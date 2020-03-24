package com.org.rediffApp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pageObjects.RediffLoginScreen;
import pageObjects.ShoppingSearchScreen;

public class RediffLoginTest 
{

	@Test
	public void LoginToRediff() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium drivers and Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		RediffLoginScreen loginPage=new RediffLoginScreen(driver);
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		loginPage.UserName().sendKeys("TestUser");
		loginPage.password().sendKeys("testuser");
		loginPage.SignInButton().click();
		ShoppingSearchScreen shoppingPage =new ShoppingSearchScreen(driver);
		shoppingPage.homepage().click();
		Thread.sleep(3000);
		shoppingPage.ShoppingIcon().click();
		Thread.sleep(3000);
		shoppingPage.Searchbox().sendKeys("test");
		shoppingPage.SearchButton().click();
		
		
	}
}
