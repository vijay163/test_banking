package com.Scripts;

import org.testng.annotations.Test;

import com.Generics.BaseClass;
import com.Generics.FWUtills;
import com.ObjectRepository.CreatecustPage;
import com.ObjectRepository.LoginPage;

public class TestcustPage extends BaseClass
{
	@Test
	public static void createCust() throws InterruptedException
	{
		String user = FWUtills.readData(XL_DATA, "LoginPage",1,0);
		 String pass = FWUtills.readData(XL_DATA, "LoginPage",1,1);
		 String expTitle = FWUtills.readData(XL_DATA, "LoginPage",1,2);
		 String expTitleCust = FWUtills.readData(XL_DATA, "CustPage",1,0);		 
		LoginPage lp = new LoginPage(driver);
		lp.enterUser(user);
		lp.enterPassword(pass);
		lp.clickLoginBtn();
		FWUtills.verifyTitleOfPage(driver, expTitle);
		CreatecustPage cp = new CreatecustPage(driver);
		cp.Createcust();
		Thread.sleep(2000);
		FWUtills.verifyTitleOfPage(driver, expTitleCust);
	}

}
