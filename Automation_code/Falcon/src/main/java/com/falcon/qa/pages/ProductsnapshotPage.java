package com.falcon.qa.pages;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.falcon.qa.base.TestBase;

public class ProductsnapshotPage extends TestBase{

//	@BeforeMethod
//	public void setUp() {
//		initialization();
//	}
//	@Test
//	public void tedgh() throws InterruptedException
//	{
//		Thread.sleep(10000);
//		driver.findElement(By.xpath("//span[text()='Product Snapshot']")).click();
//		Thread.sleep(10000);
//		driver.get("http://falcon-dashboard.atmecs.corp:8082/#/app/dashboard");
//		
//	}
//	public void getPassTestResults() throws IOException, InterruptedException {
//		Properties prop = ReadLocatorsfile.loadProperty(Constants.VIEW_FILE);
//
//		page = prop.getProperty("viewPage");//getting the xpath of view
//		customerName = prop.getProperty("customerName");//getting the xpath of customername
//		moduleName = prop.getProperty("moduleName");//getting the xpath of modulename
//		status = prop.getProperty("testStatus");//getting the xpath of status
//		testCaseName = prop.getProperty("testCaseName");//getting xpath of testCaseName Button
//		         
//
//		Utils.ignoreClickInterceptAndClickOnElement(driver, page);
//		Utils.ignoreClickInterceptAndClickOnElementforViewPage(driver, customerName, "Falcon");
//		        Utils.ignoreClickInterceptAndClickOnElementforViewPage(driver, moduleName, "createFalconPosts");
//		Utils.ignoreClickInterceptAndClickOnElementforViewPage(driver, status, "Pass");
//
//
//		List<WebElement> element = driver.findElements(By.xpath("//span[contains(text(), 'Pass') ]"));
//		passTests = element.size();
//		log.info("pass Tests are" + passTests);
//
//		Assert.assertEquals(passTests, 9, "the pass tests  match the actual results");
//		log.info("The pass test is matching the actual results");
//
//
//		}
}
