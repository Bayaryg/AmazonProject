package project1test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.junit.Assert;
import org.testng.annotations.Test;

import loginproject1.LoginDetails;
import project1data.Amazon_Signin;

public class Testcase3 extends LaunchQuit{
	
	@Test
	public void login_with_invalid_credentials() throws EncryptedDocumentException, IOException
	{
		
		LoginDetails.invalidata();
		Amazon_Signin a1=new Amazon_Signin(driver);
		a1.hoverover_account(driver);
		a1.sign_in();
		a1.un_invalid();
		a1.un_submit();
		a1.pwd_invalid();
		a1.signin_button();
		
		Assert.assertEquals(a1.failed_login_message(), "Your password is incorrect");
		
		
		

				
	}
	

}
