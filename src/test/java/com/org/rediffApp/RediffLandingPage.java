package com.org.rediffApp;

import java.io.IOException;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import baseUtil.Base;

public class RediffLandingPage extends Base
{

	public static Logger log=LogManager.getLogger(RediffLandingPage.class.getName());
	@Test
	public void LandingTest() throws IOException
	{
		driver=InitilizeBrowser();
		log.info("browser is launched..");
		String URL=prop.getProperty("URL");
		driver.get(URL);
		log.info("entered application url in browser"+URL);
	}
}
