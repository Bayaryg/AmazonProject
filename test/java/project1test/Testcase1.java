package project1test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import loginproject1.LoginDetails;
import project1data.Amazon_Signin;
import project1data.User_Registration;



public class Testcase1 extends LaunchQuit {
	
//new user registration
	
	@Test
	public void user_registration() throws EncryptedDocumentException, IOException
	{
		LoginDetails.registrationdata();
		Amazon_Signin a1=new Amazon_Signin(driver);
		a1.hoverover_account(driver);
		
		User_Registration u1=new User_Registration(driver);
		u1.clickregister();
		u1.entername();
		u1.entermobilenumber();
		u1.enterpassword();
		u1.clickverifiymobnum();
		u1.enterotp();
		u1.clickcreateaccount();
		
		Assert.assertEquals(u1.invalidotperror(), "There was a problem");
	
	
	}

}
