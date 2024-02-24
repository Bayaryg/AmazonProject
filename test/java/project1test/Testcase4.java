package project1test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;


import loginproject1.LoginDetails;
import project1data.Amazon_Profile_Details;
import project1data.Amazon_Signin;

public class Testcase4 extends LaunchQuit{
	
	//Edit Profile Information successfully
	
	
	@Test
	public void edit_profile_details() throws EncryptedDocumentException, IOException
	{
		
		LoginDetails.validata();
		Amazon_Signin a1=new Amazon_Signin(driver);
		a1.hoverover_account(driver);
		a1.sign_in();
		a1.un_valid();
		a1.un_submit();
		a1.pwd_valid();
		a1.signin_button();		
		a1.hoverover_account(driver);
		
		Amazon_Profile_Details a2=new Amazon_Profile_Details(driver);
		a2.maangeprofile_click();
		a2.view_profile();
		a2.edit_profile();
		a2.update_name();
		a2.continue_click();
		Assert.assertEquals(a2.get_profilename(),"Archana Bayary G");
	
	}

}
