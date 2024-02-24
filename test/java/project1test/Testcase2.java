package project1test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import loginproject1.LoginDetails;
import project1data.Amazon_HomePage;
import project1data.Amazon_Signin;

public class Testcase2 extends LaunchQuit{
//Ensure Login fails with incorrect mail/password
	
	@Test
	public void login_with_valid_credentials() throws EncryptedDocumentException, IOException
	{
		
		LoginDetails.validata();
		Amazon_Signin a1=new Amazon_Signin(driver);
		a1.hoverover_account(driver);
		a1.sign_in();
		a1.un_valid();
		a1.un_submit();
		a1.pwd_valid();
		a1.signin_button();
		Assert.assertEquals(a1.passed_login_message(), "Hello, archana");
		
		

	}
	
	
}
