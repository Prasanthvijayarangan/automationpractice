package com.atmecs.ninja.helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Pageactions {
	public static void clickElement(WebDriver driver, String xpath) {
		driver.findElement(By.xpath(xpath)).click();
	}

	public static void sendKeys(WebDriver driver, String xpath, String text) {
		driver.findElement(By.xpath(xpath)).sendKeys(text);
	}
}
