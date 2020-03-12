package com.atmecs.demosite.helpers;

import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;



public class Validation {
	public static void isPresent(WebDriver driver,String path) {
		try{
			 WebElement value = driver.findElement(By.xpath(path));
			 System.out.println("Element present is"+value);
			}
			catch(NoSuchElementException e){
			 System.out.println("Element not present");
			}
	}
	public static void validateData(WebDriver driver, String path,String message) {
		boolean isDisplayed=driver.findElement(By.xpath(path)).isDisplayed();
		
		if(isDisplayed==true)
		{
			System.out.println(message +" is Displayed");
		}
		else
		{
			System.out.println("Not Displayed");
		}
		}
	
	public static void isEnabled(WebDriver driver, String path,String message) {
		boolean enabledata=driver.findElement(By.xpath(path)).isEnabled();
		
		if(enabledata==true)
		{
			System.out.println(message);
		}
		else
		{
			System.out.println("Not Displayed");
		}
		}
	
	public static void gettextvalidate(WebDriver driver,String path,String expected) {
	String actualValue = driver.findElement(By.xpath(path)).getText();
	String expectedValue = expected;
	Assert.assertEquals(actualValue, expectedValue);
	System.out.println("Validated actualValue :" + actualValue);
	}
	
	public static List<WebElement> headervalidate(WebDriver driver,String path) {
		List<WebElement> allHeadersOfTable1= driver.findElements(By.xpath(path));
		return allHeadersOfTable1;

	}

	public static void textvalidate(WebDriver driver,String actual, String expected) {
		// TODO Auto-generated method stub
		
		Assert.assertEquals(actual, expected);
		System.out.println("actual :"+actual);
		
	}
	
	public static void imagevalidator(WebDriver driver,String path) {
		WebElement ImageFile = driver.findElement(By.xpath(path));

	    Boolean ImagePresent = (Boolean) ((JavascriptExecutor)driver).executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", ImageFile);
	    if (!ImagePresent)
	    {
	         System.out.println("Image not displayed.");
	    }
	    else
	    {
	        System.out.println("Image displayed.");
	    }
	}
}
