package com.falcon.qa.util;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.falcon.qa.base.TestBase;
import com.google.common.base.Function;

public class TestUtil extends TestBase {
	static String text;
	public static long PAGE_LOAD_TIMEOUT = 20;
	public static long IMPLICIT_WAIT = 20;
	
	public void clickOn(WebDriver driver,WebElement element,int timeout) {
		new WebDriverWait(driver, timeout).
		until(ExpectedConditions.elementToBeClickable(element));
		element.click();
		
	}
	public static void ignoreClickInterceptAndClickOnElement(WebDriver driver,final String xpath,int timeOutInSeconds) {
		FluentWait<WebDriver> fluentWait =  new FluentWait<WebDriver>( driver)
				.ignoring(ElementClickInterceptedException.class)
				.pollingEvery(timeOutInSeconds, TimeUnit.SECONDS)
				.withTimeout(timeOutInSeconds,TimeUnit.SECONDS);
		
		fluentWait.until(new Function<WebDriver, Boolean>() {
			public Boolean apply(WebDriver driver) {
				WebElement element = driver.findElement(By.xpath(xpath));
				element.click();
				return true;
			}
		});
	}
	
		
	}
	
			
	

	

