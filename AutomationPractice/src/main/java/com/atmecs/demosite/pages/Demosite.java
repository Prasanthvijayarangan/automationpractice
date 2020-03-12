
package com.atmecs.demosite.pages;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import com.atmecs.demosite.helpers.Pageaction;
import com.atmecs.demosite.helpers.Validation;
import com.atmecs.demosite.pathallocator.Pathallocator;
import com.atmecs.demosite.pathallocator.PathallocatorValidation;
import com.atmecs.demosite.testbase.Testbase;

public class Demosite extends Testbase {
	static Pathallocator path = new Pathallocator();
	 static PathallocatorValidation path1 = new PathallocatorValidation();
	static WebDriverWait wait  = new WebDriverWait(driver, 15);
	public static void home(WebDriver driver) throws Exception {
		path.getdata();
		path1.getdata();
		
		Validation.imagevalidator(driver, path.getPagelogo());
		Pageaction.mousehover(driver, path.getWomenmenu(), "Women");
		
		Validation.gettextvalidate(driver, path.getTshirtsubmenu(), "T-shirts");
		Validation.gettextvalidate(driver, path.getBlousessubmenu(), "Blouses");
		Validation.gettextvalidate(driver, path.getCasual(), "Casual Dresses");
		Validation.gettextvalidate(driver, path.getEvening(), "Evening Dresses");
		Validation.gettextvalidate(driver, path.getSummer(), "Summer Dresses");
		Pageaction.mousehover(driver, path.getDressesmenu(), "Dresses");
		Validation.gettextvalidate(driver, path.getCasualdress(), "CASUAL DRESSES");
		Validation.gettextvalidate(driver, path.getEveningdress(), "EVENING DRESSES");
		Validation.gettextvalidate(driver, path.getSummerdress(), "SUMMER DRESSES");
		
	
       
       List<WebElement> footers=Validation.headervalidate(driver, "//ul[@id='homefeatured']//li/div/div/div/a/img");
		System.out.println(footers.size());
		for(int index=0;index<7;index++) {
		System.out.println(footers.get(index).getAttribute("title"));
		}
		
		Validation.textvalidate(driver, footers.get(0).getAttribute("title"), path1.getProduct1());
		Validation.textvalidate(driver, footers.get(1).getAttribute("title"), path1.getProduct2());
		Validation.textvalidate(driver, footers.get(2).getAttribute("title"), path1.getProduct3());
		Validation.textvalidate(driver, footers.get(3).getAttribute("title"), path1.getProduct4());
		Validation.textvalidate(driver, footers.get(4).getAttribute("title"), path1.getProduct5());
		Validation.textvalidate(driver, footers.get(5).getAttribute("title"), path1.getProduct6());
		Validation.textvalidate(driver, footers.get(6).getAttribute("title"), path1.getProduct7());
       
		
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

    


}
