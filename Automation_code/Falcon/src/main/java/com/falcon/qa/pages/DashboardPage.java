package com.falcon.qa.pages;

import org.openqa.selenium.By;

import com.falcon.qa.base.TestBase;

public class DashboardPage extends TestBase{
	
	
	
	public void productSnapshotlink(String productsnapshotpath,String dashboardurl) throws InterruptedException
	{
		Thread.sleep(10000);
		driver.findElement(By.xpath(productsnapshotpath)).click();
		Thread.sleep(10000);
		driver.get(dashboardurl);
		
		
	}
	

	public String clickonLinkByName(String dashboardurl,String name,String name1) throws InterruptedException
	{
		driver.get(dashboardurl);
		Thread.sleep(6000);
		driver.findElement(By.xpath("//h4[text()='"+name+"']//following-sibling::small[text()='"+name1+"']")).click();
		Thread.sleep(6000);
		String actual= driver.getCurrentUrl();
		return actual;
		 
	}
	
	
	

}
