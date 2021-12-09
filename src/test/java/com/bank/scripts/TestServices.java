package com.bank.scripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.bank.generics.BaseTest;
import com.bank.generics.WebdriverActions;
import com.bank.pages.HomePage;

public class TestServices extends BaseTest {

	@Test
	@Parameters("services")
	public void testATMServices(String services) throws InterruptedException, IOException {
		HomePage hm = new HomePage(driver);
		hm.selectATMServices(services, driver);
		WebdriverActions.screenshot(driver, services);
		Thread.sleep(10);
		driver.navigate().back();
		Assert.assertEquals(driver.getTitle(), home_pageTitle);
	}

	@Test
	@Parameters("onlineserv")
	public void testOnlineServices(String onlineserv) throws InterruptedException, IOException {
		HomePage hm = new HomePage(driver);
		hm.selectOnlineServices(onlineserv, driver);
		WebdriverActions.screenshot(driver, onlineserv);
		driver.navigate().back();
		Assert.assertEquals(driver.getTitle(), home_pageTitle);
	}

}
