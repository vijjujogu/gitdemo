package com.falcon.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.falcon.qa.base.TestBase;
import com.falcon.qa.util.TestUtil;

public class ViewPage extends TestBase{
	
	TestUtil util=new TestUtil();
	
	public void getUrl(String view)
	{
		driver.get(view);
	}
	
	public void clickOnToggle(WebDriver driver, final String xpath,int timeOutInSeconds) {
		
		util.ignoreClickInterceptAndClickOnElement(driver, xpath, timeOutInSeconds);
	}
	
	
	
	public String getTextofTotalTest(String totaltest)  {
		
		String total=driver.findElement(By.xpath(totaltest)).getText();
		
		return total;
		
	}
	public String getTextofPassTest(String passcount) throws InterruptedException {
		
		String pass=driver.findElement(By.xpath(passcount)).getText();
		
		return pass;
		
	}
	public String getTextofFailTest(String failcount) throws InterruptedException
	{
		
		String fail=driver.findElement(By.xpath(failcount)).getText();
		
		return fail;
		
	}
	public String getTextofSkipTest(String skipcount) throws InterruptedException {
		
		String skip=driver.findElement(By.xpath(skipcount)).getText();
		
		return skip;
		
	}
	public int getStatusCount(String status) throws InterruptedException {
		
		List<WebElement> element = driver.findElements(By.xpath(status));
		 int statuscnt = element.size();
		
		return statuscnt;
	}
	public int getpasscount(String countpass)
	{
		List<WebElement> element = driver.findElements(By.xpath(countpass));
		 int cntpass = element.size();
		
		return cntpass;
	}
	public int getfailcount(String countfail)
	{
		List<WebElement> element = driver.findElements(By.xpath(countfail));
		 int cntfail = element.size();
		
		return cntfail;
	}
}