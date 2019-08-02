package com.falcon.qa.util;
import org.testng.Assert;
public class ValidateResults {
		
		public boolean verifyResult(boolean actual, boolean expected, String message) {
			try {
				Assert.assertEquals(actual, expected);
			System.out.println("PASS : " + message + ": " + "ACTUAL : " + actual + " 	" + "EXPECTED :" + expected);
				return true;
			} catch (AssertionError assertionError) {
				return false;
			}
		}
		

		public boolean verifyResult(boolean condition, String message) {
			boolean result = true;
			try {
				Assert.assertTrue(condition);
				System.out.println("PASS : " + message);
				result = true;
			} catch (AssertionError assertionError) {

				result = false;
			}
			return result;
		}

			public boolean verifyResult(int actual,int expected,String message) {
				try {
					Assert.assertEquals(actual, expected);
					System.out.println("PASS : " + message + ": " + "ACTUAL : " + actual + " 	" + "EXPECTED :" + expected);
					return true;
				}
					catch (AssertionError assertionError) {
						return false;
					}
				
			}
			public boolean verifyResult(Object actual,Object expected,String message) {
				try {
					Assert.assertEquals(actual, expected);
					System.out.println("PASS : " + message + ": " + "ACTUAL : " + actual + " 	" + "EXPECTED :" + expected);
					return true;
				}
					catch (AssertionError assertionError) {
						return false;
					}
				
			}
		}




