package com.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BrowserPage {

	private WebDriver driver;
	// By locators
	By message = By.xpath("//p[contains(text(),'You are at the right place')]");
	By message1 = By.xpath("//a[text()='NumpyNinja']");
	By getStartedBtn = By.xpath("//button[text()='Get Started']");
	By dsDropD1 = By.xpath("//a[text()='Data Structures']");
	By dsMList = By.xpath("//div[@class='dropdown-menu show']/a");
	By reglink = By.xpath("//a[contains(text(),' Register ')]");
	By signinlink = By.xpath("//a[contains(text(),'Sign in')]");

	// constructor of the BrowserPage
	public BrowserPage(WebDriver driver) {
		this.driver = driver;
	}

	// page actions :features of the page in the form of methods
	public void OpenTheBrowserURL() {
		System.out.println("User enters the DSAlgo portal URL");

	}
   //Browser Page URL
	public void BrowserURL() {
		driver.get("https://dsportalapp.herokuapp.com");

	}
    //Title of the Page
	public String BrowserpageTitle() {

		return driver.getTitle();
	}

	// You are at the right place message
	public String browserPagemsg() {
		System.out.println("The DSAlgo page opens");
		String msg = driver.findElement(message).getText();
		System.out.println("Browser page message " + msg);
		return msg;
	}

	// Get Started Button
	public void GetStartBtnListBrowserPage(int index) {
		List<WebElement> getbtnList = driver.findElements(getStartedBtn);
		System.out.println("Length of get started button: " + getbtnList.size());
		getbtnList.get(index).click();
	}

		public void browserpagemsg() {

		WebElement linkRegister = driver.findElement(reglink);
		System.out.println("Verify the Registe Link : " + linkRegister.getText());
		WebElement linkSignIn = driver.findElement(signinlink);
		System.out.println("Verify the Registe Link : " + linkSignIn.getText());
	}

	public String homepageTitle() {

		String homePTitle = driver.getTitle();
		System.out.println("Home Page" + homePTitle);
		return homePTitle;
	}
}