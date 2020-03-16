
package com.atmecs.demosite.pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.atmecs.demosite.Standardfile.Standardfile;
import com.atmecs.demosite.helpers.Pageaction;
import com.atmecs.demosite.helpers.Validation;
import com.atmecs.demosite.testbase.Testbase;
import com.atmecs.demosite.utils.ReadLocatorsfile;

public class Demosite extends Testbase {
	static Properties property;
	static Properties property1;
	static WebDriverWait wait = new WebDriverWait(driver, 15);

	@Test(priority = 1)
	public static void validateImage() throws Exception {

		property = ReadLocatorsfile.loadProperty(Standardfile.Validation_config);
		property1 = ReadLocatorsfile.loadProperty(Standardfile.Locator_config);

		Validation.imagevalidator(driver, property1.getProperty("loc.click.logo"), "Logo");
		Validation.imagevalidator(driver, property1.getProperty("loc.home.sliderimg1"), "SliderImage1");
		Pageaction.click(driver, property1.getProperty("loc.button.right"));
		Validation.imagevalidator(driver, property1.getProperty("loc.home.sliderimg2"), "SliderImage2");

		List<WebElement> footers = Validation.headervalidate(driver, property1.getProperty("loc.img.allproducts"));

		System.out.println(footers.size());
		for (int index = 0; index < 7; index++) {
			System.out.println(footers.get(index).getAttribute("title"));

		}

		Validation.textvalidate(driver, footers.get(0).getAttribute("title"), property.getProperty("val.img.product1"));
		Validation.textvalidate(driver, footers.get(1).getAttribute("title"), property.getProperty("val.img.product2"));
		Validation.textvalidate(driver, footers.get(2).getAttribute("title"), property.getProperty("val.img.product3"));
		Validation.textvalidate(driver, footers.get(3).getAttribute("title"), property.getProperty("val.img.product4"));
		Validation.textvalidate(driver, footers.get(4).getAttribute("title"), property.getProperty("val.img.product5"));
		Validation.textvalidate(driver, footers.get(5).getAttribute("title"), property.getProperty("val.img.product6"));
		Validation.textvalidate(driver, footers.get(6).getAttribute("title"), property.getProperty("val.img.product7"));

		Validation.imagevalidator(driver, property1.getProperty("loc.img.product1"), "Image1");
		Validation.imagevalidator(driver, property1.getProperty("loc.img.product2"), "Image2");
		Validation.imagevalidator(driver, property1.getProperty("loc.img.product3"), "Image3");
		Validation.imagevalidator(driver, property1.getProperty("loc.img.product4"), "Image4");
		Validation.imagevalidator(driver, property1.getProperty("loc.img.product5"), "Image5");
		Validation.imagevalidator(driver, property1.getProperty("loc.img.product6"), "Image6");
		Validation.imagevalidator(driver, property1.getProperty("loc.img.product7"), "Image7");
		Validation.imagevalidator(driver, property1.getProperty("loc.img.footerimg1"), "Image8");
		Validation.imagevalidator(driver, property1.getProperty("loc.img.footerimg2"), "Image9");

	}

	@Test(priority = 2)
	public static void popularProduct() throws Exception {
		property1 = ReadLocatorsfile.loadProperty(Standardfile.Locator_config);
		property = ReadLocatorsfile.loadProperty(Standardfile.Validation_config);

		Pageaction.click(driver, property1.getProperty("loc.click.popular"));

		Pageaction.mousehover(driver, property1.getProperty("loc.img.product1"));
		Pageaction.click(driver, property1.getProperty("loc.add.product1"));
		Pageaction.click(driver, property1.getProperty("loc.click.continue"));

		Pageaction.mousehover(driver, property1.getProperty("loc.img.product2"));
		Pageaction.click(driver, property1.getProperty("loc.add.product2"));
		Pageaction.click(driver, property1.getProperty("loc.click.continue"));

		Pageaction.mousehover(driver, property1.getProperty("loc.img.product3"));
		Pageaction.click(driver, property1.getProperty("loc.add.product3"));
		Pageaction.click(driver, property1.getProperty("loc.click.continue"));

		Pageaction.mousehover(driver, property1.getProperty("loc.img.product4"));
		Pageaction.click(driver, property1.getProperty("loc.add.product4"));
		Pageaction.click(driver, property1.getProperty("loc.click.continue"));

		Pageaction.mousehover(driver, property1.getProperty("loc.img.product5"));
		Pageaction.click(driver, property1.getProperty("loc.add.product5"));
		Pageaction.click(driver, property1.getProperty("loc.click.continue"));

		Pageaction.mousehover(driver, property1.getProperty("loc.img.product6"));
		Pageaction.click(driver, property1.getProperty("loc.add.product6"));
		Thread.sleep(3000);
		Pageaction.click(driver, property1.getProperty("loc.click.continue"));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(property1.getProperty("loc.img.product7"))));
		Pageaction.mousehover(driver, property1.getProperty("loc.img.product7"));
		Pageaction.click(driver, property1.getProperty("loc.add.product7"));
		Pageaction.click(driver, property1.getProperty("loc.click.proceed"));

		Pageaction.scrollDown(driver, property1.getProperty("loc.click.proceed1"));
		Validation.gettextvalidate(driver, property1.getProperty("loc.totalprice.products"),
				property.getProperty("val.price.total"));
		Pageaction.click(driver, property1.getProperty("loc.continue.shop"));

	}

	@Test(priority = 3)
	public static void bestSeller() {
		System.out.println("Bestseller started....");
		List<WebElement> bestProduct = Validation.headervalidate(driver,
				property1.getProperty("loc.bestseller.products"));

		System.out.println(bestProduct.size());
		for (int index = 0; index < 7; index++) {
			System.out.println(bestProduct.get(index).getAttribute("title"));

		}

		Validation.textvalidate(driver, bestProduct.get(0).getAttribute("title"),
				property.getProperty("val.img.product7"));
		Validation.textvalidate(driver, bestProduct.get(1).getAttribute("title"),
				property.getProperty("val.img.product1"));
		Validation.textvalidate(driver, bestProduct.get(2).getAttribute("title"),
				property.getProperty("val.img.product2"));
		Validation.textvalidate(driver, bestProduct.get(3).getAttribute("title"),
				property.getProperty("val.img.product5"));
		Validation.textvalidate(driver, bestProduct.get(4).getAttribute("title"),
				property.getProperty("val.img.product3"));
		Validation.textvalidate(driver, bestProduct.get(5).getAttribute("title"),
				property.getProperty("val.img.product6"));
		Validation.textvalidate(driver, bestProduct.get(6).getAttribute("title"),
				property.getProperty("val.img.product4"));
		Pageaction.scrollDown(driver, property1.getProperty("loc.footer.img1"));
		Validation.imagevalidator(driver, property1.getProperty("loc.footer.img1"), "Image10");
		Validation.imagevalidator(driver, property1.getProperty("loc.footer.img2"), "Image11");
		Validation.imagevalidator(driver, property1.getProperty("loc.footer.img3"), "Image12");
		Validation.imagevalidator(driver, property1.getProperty("loc.footer.img4"), "Image13");
		Validation.imagevalidator(driver, property1.getProperty("loc.footer.img5"), "Image14");
		Pageaction.scrollDown(driver, property1.getProperty("loc.footer.text"));

	}

	@Test(priority = 4)
	public static void footers() {
		List<WebElement> footerElements = Validation.headervalidate(driver,
				property1.getProperty("loc.footer.column1"));

		System.out.println(footerElements.size());
		for (int index = 0; index < footerElements.size(); index++) {
			System.out.println(footerElements.get(index).getAttribute("title"));

		}
		Validation.textvalidate(driver, footerElements.get(0).getAttribute("title"),
				property.getProperty("val.col1.footer1"));
		Validation.textvalidate(driver, footerElements.get(1).getAttribute("title"),
				property.getProperty("val.col1.footer2"));
		Validation.textvalidate(driver, footerElements.get(2).getAttribute("title"),
				property.getProperty("val.col1.footer3"));
		Validation.textvalidate(driver, footerElements.get(3).getAttribute("title"),
				property.getProperty("val.col1.footer4"));
		Validation.textvalidate(driver, footerElements.get(4).getAttribute("title"),
				property.getProperty("val.col1.footer5"));
		Validation.textvalidate(driver, footerElements.get(5).getAttribute("title"),
				property.getProperty("val.col1.footer6"));
		Validation.textvalidate(driver, footerElements.get(6).getAttribute("title"),
				property.getProperty("val.col1.footer7"));
		Validation.textvalidate(driver, footerElements.get(7).getAttribute("title"),
				property.getProperty("val.col1.footer8"));

		List<WebElement> footerElements1 = Validation.headervalidate(driver,
				property1.getProperty("loc.footer.column2"));

		System.out.println(footerElements1.size());
		for (int index = 0; index < footerElements1.size(); index++) {
			System.out.println(footerElements1.get(index).getAttribute("title"));
		}

		Validation.textvalidate(driver, footerElements1.get(0).getAttribute("title"),
				property.getProperty("val.col2.footer1"));
		Validation.textvalidate(driver, footerElements1.get(1).getAttribute("title"),
				property.getProperty("val.col2.footer2"));
		Validation.textvalidate(driver, footerElements1.get(2).getAttribute("title"),
				property.getProperty("val.col2.footer3"));
		Validation.textvalidate(driver, footerElements1.get(3).getAttribute("title"),
				property.getProperty("val.col2.footer4"));
	}

	@Test(priority = 5)
	public static void writeDataFromExcel() throws Exception
	{
	    
		File file = new File("C:/Users/prasanth.v/Documents/dataa.xlsx");
	        XSSFWorkbook wb=new XSSFWorkbook();
	        XSSFSheet sh = wb.createSheet("First Sheet");
	        sh.createRow(0).createCell(0).setCellValue("Age");
	        FileOutputStream fos = new FileOutputStream(file);
	        wb.write(fos);

	    }
	
	public static void readDataFromExcel(int rowcounter) throws Exception {
		XSSFWorkbook srcBook = new XSSFWorkbook("C:/Users/prasanth.v/Documents/Age.xlsx");     
        XSSFSheet sourceSheet = srcBook.getSheetAt(0);
        int rownum=rowcounter;
        XSSFRow sourceRow = sourceSheet.getRow(rownum);
        XSSFCell cell1=sourceRow.getCell(0);
        XSSFCell cell2=sourceRow.getCell(1);
        XSSFCell cell3=sourceRow.getCell(2);
        System.out.println(cell1);
        System.out.println(cell2);
        System.out.println(cell3);
	}
	   
	
}
//	public static void tables(WebDriver driver) throws Exception {
//		path.getdata();
//		List<WebElement>  col = driver.findElements(By.xpath(path.getColumn()));
//        System.out.println("No of cols are : " +col.size()); 
//        
//        List<WebElement>  rows = driver.findElements(By.xpath(path.getRow())); 
//        System.out.println("No of rows are : " + rows.size());
//        
//        
//        WebElement we = driver.findElement(By.tagName("table"));
//        WebElement tablerow = we.findElement(By.xpath(path.getRowdata()));
//        String rowtext = tablerow.getText();
//        System.out.println("Table text"+  rowtext);
//        
//        
//        List<WebElement> allHeadersOfTable1= driver.findElements(By.xpath(path.getGetHeaders()));
//        System.out.println("Headers in table are below:");
//        System.out.println("Total headers found: "+allHeadersOfTable1.size());
//        for(WebElement header:allHeadersOfTable1)
//        {
//        	System.out.println(header.getText());
//        }
//        
//        
//        WebElement colValue= driver.findElement(By.xpath(path.getParticularData()));
//        System.out.println("Value : "+colValue.getText());
//	}
