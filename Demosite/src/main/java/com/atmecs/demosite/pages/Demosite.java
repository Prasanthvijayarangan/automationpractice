
package com.atmecs.demosite.pages;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.atmecs.demosite.helpers.Pageaction;
import com.atmecs.demosite.pathallocator.Pathallocator;
import com.atmecs.demosite.testbase.Testbase;

public class Demosite extends Testbase {
	static Pathallocator path = new Pathallocator();
	static WebDriverWait wait  = new WebDriverWait(driver, 15);
	public static void home(WebDriver driver) throws Exception {
		path.getdata();
		WebElement element = driver.findElement(By.xpath(path.getProduct()));
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("arguments[0].scrollIntoView();", element);
		
    	Pageaction.mousehover(driver, path.getProduct(), "Blouse");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(path.getAddProduct())));
		
		Pageaction.click(driver, path.getAddProduct());
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(path.getProductProceed())));
		Pageaction.click(driver, path.getProductProceed());
		WebElement element1 = driver.findElement(By.xpath("//th[contains(.,'Unit price')]"));
    	js.executeScript("arguments[0].scrollIntoView();", element1);
	}
	public static void tables(WebDriver driver) throws Exception {
		path.getdata();
		List  col = driver.findElements(By.xpath(path.getColumn()));
        System.out.println("No of cols are : " +col.size()); 
        
        List  rows = driver.findElements(By.xpath(path.getRow())); 
        System.out.println("No of rows are : " + rows.size());
        
        WebElement we = driver.findElement(By.tagName("table"));
        WebElement tablerow = we.findElement(By.xpath("//table//tbody/tr[1]/td/p"));
        String rowtext = tablerow.getText();
        System.out.println("Table text"+  rowtext);
       
	}
	public static void webFrame(WebDriver driver) throws Exception {
		path.getdata();
		Pageaction.click(driver, "//a[@title='Continue shopping']");
		WebElement element = driver.findElement(By.xpath("//div[@class='facebook-fanbox']"));
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("arguments[0].scrollIntoView();", element);
		
    	
    	WebElement iframe = driver.findElement(By.xpath("//iframe[@title='fb:like_box Facebook Social Plugin']"));
    	driver.switchTo().frame(iframe);
    	
	
		
	}

}
