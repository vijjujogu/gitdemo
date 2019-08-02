package com.falcon.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.falcon.qa.base.TestBase;
import com.falcon.qa.pages.DashboardPage;
import com.falcon.qa.pages.ProductsnapshotPage;
import com.falcon.qa.util.ValidateResults;

public class DashboardPageTest extends TestBase {

	DashboardPage dashboardpage;
	ProductsnapshotPage productsnapshotpage;
	ValidateResults validate=new ValidateResults();
	
	String dashboardurl;
	String productsnapshotpath;
	String name;
	String name1;
	String view;
	
	@BeforeMethod
	public void setUp() {
		initialization();
		dashboardpage=new DashboardPage();
	}
	@Test(priority=1)
	public void verifyProductlinkTest() throws InterruptedException
	{
		//reading xpath from properties file
	dashboardurl = prop.getProperty("dashboardurl");
	productsnapshotpath=prop.getProperty("productsnapshotpath");
	
	//calling productsnapshotlink
		dashboardpage.productSnapshotlink(productsnapshotpath,dashboardurl);
		
	}
	@Test(priority=2)
	public void clickonLinkByNameTest() throws InterruptedException
	{
		dashboardurl = prop.getProperty("dashboardurl");
		name = prop.getProperty("name");
		name1=prop.getProperty("name1");
		view=prop.getProperty("view");
		
		String actual=dashboardpage.clickonLinkByName(dashboardurl,name,name1);
		System.out.println(actual);
		
		String expectedURL="http://falcon-dashboard.atmecs.corp:8082/#/reports/8195";
		//String redirectURL=dashboardpage.clickonLinkByName(name, name1)
		
		validate.verifyResult(expectedURL, actual, "the link is redirected to correct page");
		
	
}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
