package com.atmecs.demosite.homepage;

import org.testng.annotations.Test;
import com.atmecs.demosite.pages.Demosite;

import com.atmecs.demosite.testbase.Testbase;


public class Homepage extends Testbase {
	

	@Test
	public void homePage() throws Exception {
		
		Demosite.popularProduct();
		Demosite.validateImage();
		Demosite.bestSeller();
		Demosite.footers();
		Demosite.writeDataFromExcel();
		Demosite.readDataFromExcel(0);
	
		
	
		
	}
	}