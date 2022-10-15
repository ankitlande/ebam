package com.bikkadit.ebam.testCases;
import java.io.IOException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.bikkadit.ebam.pageObjects.LoginPage;
import com.bikkadit.ebam.pageObjects.NewCustomer;
import com.bikkadit.ebam.utilities.XLUtils;

public class TC_NewCustomer_003 extends BaseClass {
	
//	@Test
//	public void loginfirst() throws InterruptedException{
//		LoginPage lp=new LoginPage(driver);
//		lp.setUsername(username);
//		logger.info("username provided");
//		lp.setPassword(password);
//		logger.info("password provided");
//		lp.clickSubmit();
//		
//		Thread.sleep(3000);
//		
//	}
	
	@Test(dataProvider = "NewCustomerData")
	public void newCustomer(String cname, String caddress, String ccity,String cstate, String cpin, String cmob, String cemail, String cpwd ) {
		
		NewCustomer nc=new NewCustomer(driver);
		//nc.clickNewCustomer();
		nc.setCustomerName(cname);
		logger.info("Name entered");
		nc.clickGender();
		logger.info("Gender entered");
		nc.setAddress(caddress);
		logger.info("Address entered");
		nc.setCity(ccity);
		logger.info("City entered");
		nc.setState(cstate);
		logger.info("State entered");
		nc.setPIN(cpin);
		logger.info("Pin entered");
		nc.setMobileNumber(cmob);
		logger.info("Mobile Number entered");
		nc.setEmail(cemail);
		logger.info("E-mail entered");
		nc.setPassword(cpwd);
		logger.info("Password entered");
		nc.clickSubmit();
		
	}
	@DataProvider(name="NewCustomerData")
	String[][]getData()throws IOException
	{
		String path=System.getProperty("user.dir")+"/src/test/java/com/bikkadit/ebam/testData/NewCustomerData.xlsx";
		
		int rownum = XLUtils.getRowCount(path, "Sheet1");
		int colcount = XLUtils.getCellCount(path, "Sheet1", 1);
		
		String logindata[][]=new String[rownum] [colcount];
		
		for(int i=1;i<=rownum;i++)
		{
			for(int j=0;j<colcount;j++)
			{
				logindata[i-1][j]=XLUtils.getCellData(path, "Sheet1", i, j);
			}
		}
		return logindata;
		
	}

}
