package day5week2pageobjetmodel;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
@Test
public class ReadExcel {
	public Object[][] readExcel(String FileName) throws IOException
	{
		//Get Excel sheet path
		XSSFWorkbook wBook = new XSSFWorkbook("./data/"+FileName+".xlsx");
		//Go to sheet
		XSSFSheet sheet = wBook.getSheetAt(0);
		//Find row count
		int rowCount = sheet.getLastRowNum();
		//find the cell count
		short columnCount = sheet.getRow(0).getLastCellNum();
		//Read the data
		Object [][] data=new Object[rowCount][columnCount];
		for (int i=1;i<=rowCount; i++)
		{
			XSSFRow row = sheet.getRow(i);
			for (int j=0; j< columnCount; j++)
			{
				try {
					XSSFCell cell = row.getCell(j);
					data[i-1][j]= cell.getStringCellValue();
					//System.out.println(data);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					data[i-1][j]= "";
					//e.printStackTrace();
				}
			}
		}
		wBook.close();
		return data;
		
		
	}

}
