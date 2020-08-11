package com.atmecs.ninja.helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.atmecs.ninja.constants.Filepath;

public class BrowserFactory {
	public static BrowserFactory instance = null;
	ThreadLocal<WebDriver> webDriver = new ThreadLocal<WebDriver>();

	public BrowserFactory() {

	}

	public static BrowserFactory getInstance() {
	if (instance == null) {
	instance = new BrowserFactory();
	}
	return instance;
	}

	public void setDriver(String browser) {

	if (browser == "firefox") {
	System.setProperty("webdriver.gecko.driver", Filepath.GECKO_DRIVER);
	webDriver.set(new FirefoxDriver());
	}

	}

	public WebDriver getDriver() {
	return webDriver.get();
	}
}
