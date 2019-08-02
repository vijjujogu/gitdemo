package com.falcon.qa.testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.falcon.qa.base.TestBase;
import com.falcon.qa.pages.DashboardPage;
import com.falcon.qa.pages.ProductsnapshotPage;
import com.falcon.qa.pages.ViewPage;
import com.falcon.qa.util.ValidateResults;

public class ViewPageTest extends TestBase {

	DashboardPage dashboardpage;
	ProductsnapshotPage productsnapshotpage;
	ViewPage viewpage;
	ValidateResults validate=new ValidateResults();
	String view;
	String toggle;
	String totaltest;
	String passcount;
	String failcount;
	String skipcount;
	String status;
	String countpass;
	String countfail;
	
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		initialization();
		viewpage=new ViewPage();
		//dashboardpage.clickonLinkByName("Falcon","Web Services");
	}
	@Test
	public void verifyResultCountByToggle() throws InterruptedException
	{
		
		view = prop.getProperty("view");
		 toggle = prop.getProperty("toggle");
		 totaltest = prop.getProperty("totaltest");
		 passcount = prop.getProperty("passcount");
		 failcount = prop.getProperty("failcount");
		 skipcount = prop.getProperty("skipcount");
		 
		 viewpage.getUrl(view);
		 
		viewpage.clickOnToggle(driver,toggle,30);
		String total=viewpage.getTextofTotalTest(totaltest);
		System.out.println("total"+total);
		String pass=viewpage.getTextofPassTest(passcount);
		System.out.println("total"+pass);
		String fail=viewpage.getTextofFailTest(failcount);
		System.out.println("total"+fail);
		String skip=viewpage.getTextofSkipTest(skipcount);
		System.out.println("total"+skip);
		
//		System.out.println("total"+pass);
//		System.out.println("total"+fail);
//		System.out.println("total"+skip);
//		System.out.println("total"+total);
		
//		//code to retrieve the total test count
//		String total=viewpage.getTextofTotalTest(totaltest);
//		String value = total.replaceAll("[^0-9]", ""); 
//		int finaltotal = Integer.parseInt(value);
//		System.out.println("total"+finaltotal);
//		
//		//code to retrieve the pass test count
//		String pass=viewpage.getTextofPassTest(passcount);
//		int pass1 = Integer.parseInt(pass);
//		System.out.println("pass"+pass1);
//		
//		//code to retrieve the fail test count
//		String fail=viewpage.getTextofFailTest(failcount);
//		int fail1 = Integer.parseInt(fail);
//		System.out.println("fail"+fail1);
//		
//		//code to retrieve the skip test count
//		String skip=viewpage.getTextofSkipTest(skipcount);
//		int skip1 = Integer.parseInt(skip); 
//		System.out.println("skip"+skip1);
//		
//		int count=pass1+fail1+skip1;
//		
//		//calling assert method to verify the result
//		validate.verifyResult(finaltotal, count, "the total count of tests match actual results");
//		
//		status=prop.getProperty("status");
//		int statusct=viewpage.getStatusCount(status);
//		System.out.println("Total Tests are" + statusct);
//		
//		validate.verifyResult(finaltotal, statusct, "The total tests run are equal to status tests");
//
//		countpass=prop.getProperty("countpass");
//		int passcnt=viewpage.getpasscount(countpass);
//		System.out.println("pass count is"+passcnt);
//		
//		validate.verifyResult(passcnt, pass1,"The total pass count of status  is equal to actual test passed");
//		
//		countfail=prop.getProperty("countfail");
//		int failcnt=viewpage.getpasscount(countfail);
//		System.out.println("pass count is"+failcnt);
//		
//		validate.verifyResult(failcnt,fail1,"The total fail count of status  is equal to actual test failed");
//		
//		
	}

//	@AfterMethod
//	public void tearDown()
//	{
//		driver.quit();
//	}
}
