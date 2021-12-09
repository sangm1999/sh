package com.bank.scripts;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.bank.generics.BaseTest;

public class TestLoginPage extends BaseTest {
	@Test
	public void verifyHomePage() {

		Reporter.log(driver.getTitle(), true);
		Assert.assertEquals(home_pageTitle, driver.getTitle());
	}

	@Test
	public void verifyCustomer() {

	}
}
