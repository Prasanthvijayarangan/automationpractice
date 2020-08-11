package com.atmecs.ninja.testbase;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.atmecs.ninja.constants.Filepath;
import com.atmecs.ninja.helpers.BrowserFactory;
import com.atmecs.ninja.utils.Readlocators;



public class TestBase {
	public static WebDriver driver;

	String baseUrl;
	String browsername;
	@Test
	public void parallelBrowser1() {
		BrowserFactory browserFactory = BrowserFactory.getInstance();
		browserFactory.setDriver("firefox");

		Properties property = Readlocators.readProperties(Filepath.CONFIG_FILE);

		baseUrl = property.getProperty("Url");
		browsername = property.getProperty("browser");
		driver=browserFactory.getDriver();
	
		driver.get(baseUrl);
		System.out.print(baseUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}
}
