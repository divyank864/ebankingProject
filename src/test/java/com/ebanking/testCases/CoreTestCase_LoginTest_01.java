package com.ebanking.testCases;


import org.junit.Test;

import com.ebanking.pageObjects.LoginPage;

import org.testng.Assert;

public class CoreTestCase_LoginTest_01 extends BaseClass 
{
	@Test
	public void loginTest()
	{
		driver.get(baseURL);
		logger.info("URL is now open");
		
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickSubmit();
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
			logger.info("Login Test Passed");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("Login Test failed");
		}
		
	}
	

}
