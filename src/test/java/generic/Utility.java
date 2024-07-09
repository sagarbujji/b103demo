package generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility {

	public static String getExcelData(String path,String sheetName,int row, int col)
	{
		String value="";
		try
		{
			Workbook wb = WorkbookFactory.create(new FileInputStream(path));
			value = wb.getSheet(sheetName).getRow(row).getCell(col).toString();
			System.out.println(value);
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return value;
	}
	
	public static void getScreenShot(WebDriver driver,String path)
	{
		TakesScreenshot t=(TakesScreenshot)driver;
		File srcFile = t.getScreenshotAs(OutputType.FILE);
		File dstFile=new File(path);
		try 
		{
			FileUtils.copyFile(srcFile, dstFile);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	public static String getProperty(String path,String key)
	{
		Properties p=new Properties();
		try 
		{
			p.load(new FileInputStream(path));
		} catch (IOException e) {
	
			e.printStackTrace();
		}
		String value = p.getProperty(key);
		return value;
	}
}

