package com.bank.generics;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebdriverActions implements IAutoConstants {

	static public void webElementclicking(WebDriver driver, WebElement element) {

		WebDriverWait wait = new WebDriverWait(driver, waiting_period);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	static public void screenshot(WebDriver driver, String ss_name) throws IOException
	{
		TakesScreenshot ss=(TakesScreenshot)driver;
		File source_file=ss.getScreenshotAs(OutputType.FILE);
		File desti_file=new File(ss_Path+ss_name+".png");
		FileUtils.copyFile(source_file,desti_file);
	}

}
