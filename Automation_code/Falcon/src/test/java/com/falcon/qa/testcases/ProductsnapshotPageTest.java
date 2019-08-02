package com.falcon.qa.testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.falcon.qa.base.TestBase;

public class ProductsnapshotPageTest extends TestBase {

	@BeforeMethod
	public void setUp() {
		initialization();
	}
	@Test
	public void gnh() throws InterruptedException {
		driver.get("http://falcon-dashboard.atmecs.corp:8082/#/reports/8272");
		Thread.sleep(10000);
		driver.findElement(By.xpath("/html/body/div[2]/section/div/h3/label/span")).click();
		Thread.sleep(10000);
		WebElement total=driver.findElement(By.xpath("(//h4[@class='mt0 ng-binding'])[1] "));
		String sum=total.getText();
		String value = sum;
		String intValue = value.replaceAll("[^0-9]", ""); 
		int finaltotal = Integer.parseInt(intValue);
		System.out.println("total"+finaltotal);
		Thread.sleep(10000);
		WebElement pass=driver.findElement(By.xpath("(//h4[@class='mt0 ng-binding'])[2] "));
		String ps=pass.getText();
		int ips = Integer.parseInt(ps);
		System.out.println("pass"+ips);
		Thread.sleep(10000);
		WebElement fail=driver.findElement(By.xpath("(//h4[@class='mt0 ng-binding'])[3] "));
		String fl=fail.getText();
		int ifl = Integer.parseInt(fl);
		System.out.println("fail"+ifl);
		
		Thread.sleep(10000);
		WebElement skip=driver.findElement(By.xpath("(//h4[@class='mt0 ng-binding'])[4] "));
		String  sk=skip.getText();
		int sk1 = Integer.parseInt(sk); 
		System.out.println("skip"+sk1);
		int count=ips+ifl+sk1;
		if(finaltotal==count) { 
			System.out.println("verified");
		}
		
		//List<WebElement> status=((WebElement) driver.findElements(By.xpath("//td[@data-title-text = 'Status']"))).getText();
		List<WebElement> element = driver.findElements(By.xpath("//td[@data-title-text = 'Status']"));
		 int passTests = element.size();
		System.out.println("pass Tests are" + passTests);

//		Assert.assertEquals(passTests, 9, "the pass tests  match the actual results");
//		log.info("The pass test is matching the actual results");

	//	copy and pasted from view page 
	//	public String getTextofTotalTest(WebDriver driver, final String xpath,int timeOutInSeconds) {
//			return TestUtil.getTextOfElement(driver, xpath, timeOutInSeconds);
//		}
			//String total=util.getTextOfElement(driver, xpath, timeOutInSeconds);
			//return total;
			
		
//		public String getTextofPassTest(WebDriver driver, final String xpath,int timeOutInSeconds) {
//			
//			String pass=util.getTextOfElement(driver, xpath, timeOutInSeconds);
//			return pass;
//			
//		}
//		public String getTextofFailTest(WebDriver driver, final String xpath,int timeOutInSeconds) {
//			
//			String fail=util.getTextOfElement(driver, xpath, timeOutInSeconds);
//			return fail;
//			
//		}
//		public String getTextofSkipTest(WebDriver driver, final String xpath,int timeOutInSeconds) {
//			
//			String skip=util.getTextOfElement(driver, xpath, timeOutInSeconds);
//			return skip;
//			
//		}
//		public String getStatusCount(WebDriver driver, final String xpath,int timeOutInSeconds) {
	//	
//			List<WebElement> element =util.getTextOfElement(driver, xpath, timeOutInSeconds);
//			int statuscnt = element.size();
	//	
//			return statuscnt;
	//	
//		}
//		public String getpasscount(WebDriver driver, final String xpath,int timeOutInSeconds) {
	//	
//		String total=util.getTextOfElement(driver, xpath, timeOutInSeconds);
//		return total;
	//	
//		}
//		public String getfailcount(WebDriver driver, final String xpath,int timeOutInSeconds) {
	//	
//		String total=util.getTextOfElement(driver, xpath, timeOutInSeconds);
//		return total;
	//	
//		}
//		public void clickOnToggle(String view,String toggle) throws InterruptedException {
//			
//			driver.get(view);
//			
//			util.ignoreClickInterceptAndClickOnElement(driver, xpath, timeOutInSeconds);
//			
////			WebElement togglebtn=driver.findElement(By.xpath(toggle));
////			util.clickOn(driver, togglebtn, 20000);
//			
////			Thread.sleep(10000);
////			driver.findElement(By.xpath(toggle)).click();
////			Thread.sleep(10000);
//		}

	}
}
