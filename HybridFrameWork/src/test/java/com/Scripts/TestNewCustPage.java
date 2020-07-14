package com.Scripts;

import org.testng.annotations.Test;

import com.Generics.BaseClass;
import com.Generics.FWUtills;
import com.ObjectRepository.CreatecustPage;
import com.ObjectRepository.LoginPage;
import com.ObjectRepository.NewCutomerPage;

public class TestNewCustPage extends BaseClass
{
	@Test
	public static void createCut() throws InterruptedException
	{
		String user = FWUtills.readData(XL_DATA, "LoginPage",1,0);
		 String pass = FWUtills.readData(XL_DATA, "LoginPage",1,1);
		 String expTitle = FWUtills.readData(XL_DATA, "LoginPage",1,2);
		 String expTitleCust = FWUtills.readData(XL_DATA, "CustPage",1,0);
         int rows = FWUtills.readRowCount(XL_DATA,"CustPage");		 
		 
		LoginPage lp = new LoginPage(driver);
		lp.enterUser(user);
		lp.enterPassword(pass);
		lp.clickLoginBtn();
		FWUtills.verifyTitleOfPage(driver, expTitle);
		Thread.sleep(2000);
		for(int i=1;i<=rows;i++)
		{
			Thread.sleep(20000);
			 String CustN = FWUtills.readData(XL_DATA, "CustPage",i,1);
			 String custDob = FWUtills.readData(XL_DATA, "CustPage",i,2);
			 String addr = FWUtills.readData(XL_DATA, "CustPage",i,3);
			 String city = FWUtills.readData(XL_DATA, "CustPage",i,4);
			 String state = FWUtills.readData(XL_DATA, "CustPage",i,5);
			 String mNo = FWUtills.readData(XL_DATA, "CustPage",i,6);
			 String mail = FWUtills.readData(XL_DATA, "CustPage",i,7);
			 String passw= FWUtills.readData(XL_DATA, "CustPage",i,8);
			 String pin = FWUtills.readData(XL_DATA, "CustPage",i,9);
			 String RegisTitle = FWUtills.readData(XL_DATA, "CustPage",1,10);

		Thread.sleep(2000);
		CreatecustPage cp = new CreatecustPage(driver);
		 cp.Createcust();
		//FWUtills.webDriverWait(driver,);
		Thread.sleep(1000);
		FWUtills.verifyTitleOfPage(driver, expTitleCust);
	    NewCutomerPage ncp = new NewCutomerPage(driver);
	    ncp.enterName(CustN);
	    ncp.enterDob(custDob);
	    ncp.EnterAddr(addr);
	    ncp.enterCity(city);
	    ncp.enterstate(state);
	    ncp.enterPh(mNo);
	    ncp.enterPIn(pin);
	    ncp.enterEmail(mail);
	    ncp.EnterPass(passw);
	    ncp.clickSub();
	    Thread.sleep(2000);
	  //  FWUtills.takeScreenShot(driver,PHOTO_PATH);
	    FWUtills.verifyTitleOfPage(driver, RegisTitle);
	    System.out.println("*************************");
	    System.out.println(i+"user is created");
		}
	}

}
