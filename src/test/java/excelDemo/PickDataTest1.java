package excelDemo;

import java.io.IOException;
import java.util.ArrayList;

import org.testng.annotations.Test;

public class PickDataTest1 
{

	
	@Test
	public void PickDataTestcase1() throws IOException
	{
		ExcelDriver ed=new ExcelDriver();
		ArrayList<String> data=ed.GetData("QuestionM3");
		System.out.println(data.get(0));
		System.out.println(data.get(1));
		System.out.println(data.get(2));
		System.out.println(data.get(3));
	}
}
