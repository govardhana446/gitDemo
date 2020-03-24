package log4JDemo;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class LogsTest 
{

	private static Logger log=LogManager.getLogger(LogsTest.class.getName());
	
	@Test
	public void loggingMsg()
	{
		log.error("button is missing on UI");
		log.info("Clicked on radioButon");
		log.fatal("Page not found");
		log.debug("Text is entered successfully");
	}
}
