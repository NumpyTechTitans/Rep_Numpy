package com.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DSHomePage {
private WebDriver driver;
	
	//Bylocators
	 By dsDropDown= By.xpath("//a[text()='Data Structures']");
	 By menuList=By.xpath(("//div[@class='dropdown-menu show']//a[@class='dropdown-item']"));
	 By errorMsg=By.xpath("//div[@class='alert alert-primary']");
	 By registerLink=By.xpath("//a[contains(text(),' Register ')]");
	 By loginLink=By.xpath("//a[contains(text(),'Sign in')]");
	 By dsGetStartBtn=By.xpath("//a[contains(text(),'Get Started')]");
	 
	 public DSHomePage(WebDriver driver) {
     this.driver=driver;
	 }
	 public void introPage1()
		{
			driver.get("https://dsportalapp.herokuapp.com/home");
			
		}
	 
     public void clickDropDown() {
    	 System.out.println("User clicks the DataStructures dropdown");
    	 driver.findElement(dsDropDown).click();
    	 
     }
     
     public void GetStartBtnList(int index)
 	{
 		List<WebElement> getbtnListIP= driver.findElements(dsGetStartBtn);
 		System.out.println("Length of get started button: " + getbtnListIP.size());
 		getbtnListIP.get(index).click();	
 		System.out.println("item click");
 	}
     public  List<String>  dropDownOptions() {
    	 List<String> items=new ArrayList<>();
      List<WebElement> list = driver.findElements(menuList);
      System.out.println("Number of items in Data Structures dropdown: " + list.size());
      for(WebElement e:list) {
    	  String text=e.getText();
    	  System.out.println(text);
    	 items.add(text);
      }
      return items;
     }
 	  
     public void clickDropdownitem(int index)
     {
    	 List<WebElement> list = driver.findElements(menuList);
 		System.out.println("Number of items in Data Structures dropdown: " + list.size());

 		list.get(index).click();
     }
     public String errorMessage() {
    // WebElement erMsg1=driver.findElement(errorMsg);
     String message1=driver.findElement(errorMsg).getText();
	// System.out.println("Message you get on clicking any item in Dropdown is :"+erMsg1.getText());
	 	return message1;
}
     
     public void clickRegisterLink()
     {
    	 System.out.println("User clicks on Register link on DS Home page ");
    	 driver.findElement(registerLink).click();
     }
     public void registerPage()
     {
    	 System.out.println("User is on Registerform with Login at the bottom of the page");
    	 
     }
     public void clickSignInPage()
     {
    	 System.out.println("User clicks the SignIn link on DS Home Page");
    	 driver.findElement(loginLink).click();
    	 
     }
     public void loginLinkPage()
     {
    	 System.out.println("User is on SignIn form with Register link at the bottom of the page");
    	 
     }
}


	 

