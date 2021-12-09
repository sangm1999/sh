package com.bank.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "username")
	private WebElement UN_Text_Field;
	@FindBy(name = "password")
	private WebElement PWD_Text_Field;
	@FindBy(xpath = "//input[@value='Log In']")
	private WebElement Lng_butn;
	@FindBy(xpath = "//ul[@class='servicestwo']/li/*/..")
	private List<WebElement> online_services;
	@FindBy(xpath = "//ul[@class='services']/li/a")
	private List<WebElement> ATM_services;
	@FindBy(xpath = "//a[text()='home']")
	private WebElement home_btn;
	@FindBy(xpath = "//a[text()='about']")
	private WebElement about_btn;
	@FindBy(xpath = "//a[text()='contact']")
	private WebElement contact_btn;
	@FindBy(linkText = "ParaBank Is Now Re-Opened")
	private WebElement reopened;
	@FindBy(linkText = "New! Online Bill Pay")
	private WebElement billPay_News;
	@FindBy(linkText = "New! Online Account Transfers")
	private WebElement transfer_News;

	public void selectATMServices(String service, WebDriver driver) {
		for (WebElement atms : ATM_services) {
			if (service.contains(atms.getText())) {
				atms.click();
				break;
			}
		}
	}

	public void selectOnlineServices(String onlineserv, WebDriver driver) {
		// online_services =
		// driver.findElements(By.xpath("//ul[@class='servicestwo']/li/*/.."));
		for (WebElement w : online_services) {
			if (w.isDisplayed() && onlineserv.contains(w.getText())) {
				w.click();
				break;
			}
		}
	}

	public void clickOnHome() {
		home_btn.click();
	}

	public void clickOnContact() {
		contact_btn.click();
	}

	public void clickOnAbout() {
		about_btn.click();
	}
	public void clickonNewsLinks1()
	{
		reopened.click();
	}
	public void clickonNewsLinks2()
	{
		billPay_News.click();
	}
	public void clickonNewsLinks3()
	{
		transfer_News.click();
	}
}
