package com.atmecs.demosite.homepage;


import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.atmecs.demosite.helpers.Pageaction;
import com.atmecs.demosite.pages.Demosite;
import com.atmecs.demosite.pathallocator.Pathallocator;
import com.atmecs.demosite.pathallocator.PathallocatorValidation;
import com.atmecs.demosite.testbase.Testbase;


public class Homepage extends Testbase {
	Pathallocator path = new Pathallocator();
	PathallocatorValidation path1 = new PathallocatorValidation();
	

	@Test
	public void homePage() throws Exception {
		
		Demosite.home(driver);
		Demosite.tables(driver);
		Demosite.webFrame(driver);
	
		
	}
	}