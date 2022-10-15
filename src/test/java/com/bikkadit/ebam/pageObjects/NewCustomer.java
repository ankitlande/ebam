package com.bikkadit.ebam.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewCustomer {

	WebDriver ldriver;

	public NewCustomer(WebDriver rdriver) {
		
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(xpath = "//a[normalize-space()='New Customer']")
	@CacheLookup
	WebElement newcustomer;
	
	@FindBy(xpath ="//input[@name='name']")
	@CacheLookup
	WebElement customername;
	
	@FindBy(xpath ="//input[@value='m']")
	@CacheLookup
	WebElement gender;
	
	@FindBy(xpath ="//input[@id='dob']")
	@CacheLookup
	WebElement dob;
	
	@FindBy(xpath = "//textarea[@name='addr']")
	@CacheLookup
	WebElement address;
	
	@FindBy(xpath = "//input[@name='city']")
	@CacheLookup
	WebElement city;
	
	@FindBy(xpath = "input[name='state']")
	@CacheLookup
	WebElement state;
	
	@FindBy(xpath = "//input[@name='pinno']")
	@CacheLookup
	WebElement pin;
	
	@FindBy(xpath = "//input[@name='pinno']")
	@CacheLookup
	WebElement mobno;
	
	@FindBy(xpath = "//input[@name='pinno']")
	@CacheLookup
	WebElement email;

	@FindBy(xpath = "//input[@name='pinno']")
	@CacheLookup
	WebElement pass;
	
	@FindBy(xpath = "//input[@name='sub']")
	@CacheLookup
	WebElement submitpage;
	
	public void clickNewCustomer() {
		newcustomer.click();
	}
	public void setCustomerName(String name) {
		customername.sendKeys(name);
	}
	public void clickGender() {
		gender.click();
	}
	public void setAddress(String add) {
		address.sendKeys(add);
	}
	public void setCity(String cty) {
		city.sendKeys(cty);
	}
	public void setState(String stat) {
		state.sendKeys(stat);
	}
	public void setPIN(String pinno) {
		pin.sendKeys(pinno);
	}
	public void setMobileNumber(String mob) {
		mobno.sendKeys(mob);
	}
	public void setEmail(String mail) {
		email.sendKeys(mail);
	}
	public void setPassword(String pswd) {
		pass.sendKeys(pswd);
	}
	public void clickSubmit() {
		submitpage.click();
	}
}
