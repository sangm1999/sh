package com.bank.scripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.bank.generics.BaseTest;
import com.bank.generics.WebdriverActions;
import com.bank.pages.HomePage;

public class TestNewsPage extends BaseTest{
	@Test@Parameters ({"reopened","amttransfernews","billpaynews"})
	public void news(String ss_name_reopen,String ss_name_trns,String ss_name_billpay) throws IOException
	{
		HomePage hm=new HomePage(driver);
		hm.clickOnHome();
		Assert.assertEquals(driver.getTitle(), home_pageTitle);
		hm.clickonNewsLinks1();
		Assert.assertEquals(driver.getTitle(),news_PageTitle);
		WebdriverActions.screenshot(driver, ss_name_reopen);
		driver.navigate().back();
		hm.clickonNewsLinks2();
		Assert.assertEquals(driver.getTitle(),news_PageTitle);
		WebdriverActions.screenshot(driver, ss_name_billpay);
		driver.navigate().back();
		hm.clickonNewsLinks3();
		Assert.assertEquals(driver.getTitle(),news_PageTitle);
		WebdriverActions.screenshot(driver, ss_name_trns);
		driver.navigate().back();
	}

}
