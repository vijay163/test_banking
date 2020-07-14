package com.Generics;

import java.awt.Robot;
import java.io.File;
import java.io.FileInputStream;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

 abstract public class FWUtills extends BaseClass implements IAutoConstants
{
	 public static void webDriverWait(WebDriver driver,WebElement element)
	 {
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.elementToBeSelected(element));
	 }
	
	public static void verifyTitleOfPage(WebDriver driver,String expTitle)
	{
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.titleContains(expTitle));
		String actual = driver.getTitle();
		Assert.assertEquals(actual, expTitle);
		System.out.println("Title of the WebPage is::::::::"+expTitle);
	}
	public static String readData(String path,String sheet,int rowNum,int cellNum)
	{
		String data=" ";
		try
		{
			Workbook ws = WorkbookFactory.create(new FileInputStream(path));
			data=ws.getSheet(sheet).getRow(rowNum).getCell(cellNum).toString();
						
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			
		}
		return data;
		
	}
	public static int readRowCount(String path,String sheet)
	{
		int lRow=0;
		try
		{
			Workbook ws = WorkbookFactory.create(new FileInputStream(path));
			lRow=ws.getSheet(sheet).getLastRowNum();

			
		} 
		catch (Exception e)
		{
		   e.printStackTrace();
		}
		return lRow;
			}
	public static void takeScreenShot(WebDriver driver,String photoPath)
	{
		try
		{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File(photoPath);
		FileUtils.copyFile(src,des);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void moveCursor(WebDriver driver,String ya)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,"+ya+")");
	}
	public static Actions actions(WebDriver driver)
	{
		return new Actions(driver);
	}
	public static Robot robot()
	{
		Robot rc=null;
		try
	   {
		return new Robot();
	   }
		catch (Exception e)
		{
		e.printStackTrace();	
		}
		return rc;
	}
	public static Select select(WebElement element)
	{
		return new Select(element);
	}

}
