package com.ObjectRepository;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatecustPage
{
	@FindBy(xpath = "//a[text()='New Customer']")
	 private WebElement  newCust;
	
	@FindBy(xpath = "//a[text()='Edit Customer']")
	private WebElement  editCust;
	
	@FindBy(xpath = "//a[text()='Delete Customer']")
	private WebElement deletecust;
	
	@FindBy(xpath = "//a[text()='New Account']")
	private WebElement newAcc;
	
	@FindBy(xpath = "//a[text()='Edit Account']")
	private WebElement editAcc;
	
	@FindBy(xpath = "//a[text()='Delete Account']")
    private WebElement delAcc;
	 
	public CreatecustPage(WebDriver driver)
	 {
		 PageFactory.initElements(driver,this);
	 }
	 public  void Createcust()
	 {
		 newCust.click();
	 }
	 public void EditCust()
	 {
		 editCust.click();
	 }
	 public void Deletecust()
	 {
		 deletecust.sendKeys(Keys.ENTER);
	 }
	 public void NewAcc()
	 {
		 newAcc.sendKeys(Keys.ENTER);
	 }
	 public void Editacc()
	 {
		 editAcc.sendKeys(Keys.ENTER);
	 }
	 public void DelAcc()
	 {
		 delAcc.sendKeys(Keys.ENTER);
	 }
}
