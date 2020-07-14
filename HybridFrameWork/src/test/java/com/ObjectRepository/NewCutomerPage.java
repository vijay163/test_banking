package com.ObjectRepository;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewCutomerPage 
{
	@FindBy(xpath = "//input[@name='name']")
	private WebElement custname;
	
	@FindBy(xpath = "//input[@name='dob']")
	private WebElement custDob;
	
	@FindBy(xpath = "//input[@name='city']")
	private WebElement city;
	
	@FindBy(xpath = "//input[@name='state']")
	private WebElement state;
	
	@FindBy(xpath = "//input[@name='pinno']")
	private WebElement pin;
	
	@FindBy(xpath = "//input[@name='telephoneno']")
	private WebElement phno;
	
	@FindBy(xpath = "//input[@name='sub']")
	private WebElement submit;
	
	@FindBy(xpath = "//input[@name='res']")
    private WebElement reset;
	
	@FindBy(xpath = "//input[@name='emailid']")
	private WebElement email;
	
	@FindBy(xpath = "//input[@name='password']")
	private WebElement passw;
	
	@FindBy(xpath = "//textarea[@name='addr']")
	private WebElement addr;
	
	public NewCutomerPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void enterName(String name)
	{
		custname.sendKeys(name);
	}
	public void enterDob(String dob)
	{
		custDob.sendKeys(dob);
	}
	public void enterstate(String st)
	{
		state.sendKeys(st);
	}
	public void enterCity(String cy)
	{
		city.sendKeys(cy);
	}
	public void enterPIn(String pn)
	{
		pin.sendKeys(pn);
		}
	public void enterPh(String ph)
	{
		phno.sendKeys(ph);
	}
	public void clickSub()
	{
		submit.click();
	}
	public void clickRes()
	{
		reset.sendKeys(Keys.ENTER);
	}
	public void enterEmail(String em)
	{
		email.sendKeys(em);
	}
	public void EnterPass(String pw)
	{
		passw.sendKeys(pw);
	}
	public void EnterAddr(String adr)
	{
		addr.sendKeys(adr);
	}
	
}
