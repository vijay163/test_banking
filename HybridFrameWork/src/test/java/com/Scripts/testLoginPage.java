package com.Scripts;



import org.testng.annotations.Test;

import com.Generics.BaseClass;
import com.Generics.FWUtills;
import com.ObjectRepository.LoginPage;

public class testLoginPage extends BaseClass
{
	@Test
	public static void validLogin() throws InterruptedException
	{
		 String user = FWUtills.readData(XL_DATA, "LoginPage",1,0);
		 String pass = FWUtills.readData(XL_DATA, "LoginPage",1,1);
		 String expTitle = FWUtills.readData(XL_DATA, "LoginPage",1,2);
		 
		LoginPage lp = new LoginPage(driver);
		lp.enterUser(user);
		lp.enterPassword(pass);
		lp.clickLoginBtn();
		FWUtills.verifyTitleOfPage(driver, expTitle);
	}

}
