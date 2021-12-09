package com.bank.generics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseTest implements IAutoConstants {
	public static WebDriver driver;
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver95.exe");
	}

	@BeforeSuite
	@Parameters("browser")
	public void launchBrowser(String browser) {
		if (browser.equals("chrome"))
			driver = new ChromeDriver();
		else if (browser.equals("firefox"))
			driver = new FirefoxDriver();
		else if (browser.equals("safari"))
			driver = new SafariDriver();
		else if (browser.equals("ie"))
			driver = new InternetExplorerDriver();
	}

	@BeforeTest
	public void openApp() {
		driver.get(app_URL);
		driver.manage().window().maximize();
	}

	@AfterTest
	public void closeBrowser() {
		driver.close();
	}
}
