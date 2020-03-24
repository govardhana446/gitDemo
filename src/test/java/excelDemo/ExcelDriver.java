package excelDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.streaming.SXSSFRow.CellIterator;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelDriver 
{

	XSSFSheet sheet=null;
	int k=0;
	int column=0;
	//invoke sheet name
	//grab the test casesnames column header and QuestionM2
	//grab the row data for questionM2 and feed into test
	
	
	public ArrayList<String> GetData(String TestName) throws IOException
	{
		ArrayList<String> data=new ArrayList<String>();
		String basepath=System.getProperty("user.dir");
		
		FileInputStream fis=new FileInputStream(basepath+"\\resources\\TestData.xlsx");
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		int SheetCout=wb.getNumberOfSheets();
		for(int i=0;i<SheetCout;i++) 
		{
			if(wb.getSheetAt(i).getSheetName().equalsIgnoreCase("testdata"))
			{
			    sheet=wb.getSheetAt(i);
				break;
			}
		}
		
		Iterator<Row> row=sheet.rowIterator();
		Row Header=row.next();
		Iterator<Cell> cell=Header.cellIterator();
		
		while(cell.hasNext())
		{
			if(cell.next().getStringCellValue().equalsIgnoreCase("TestCaseName"))
			{
				column=k;
			}
			k++;
			
		}
		
		while(row.hasNext())
		{
		  Row r=row.next();
		  if(r.getCell(column).getStringCellValue().equalsIgnoreCase(TestName))
		  {
			Iterator<Cell> DesiredCells=  r.cellIterator();
			while(DesiredCells.hasNext())
			{
				Cell d=DesiredCells.next();
				if(d.getCellTypeEnum()==CellType.STRING)
				{
					
	     			data.add(d.getStringCellValue());
				}
				else
				{
					data.add(NumberToTextConverter.toText(d.getNumericCellValue()));
				
				}
			}
		  }
		  
		}
		return data;
	}
}
