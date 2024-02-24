package project1test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.junit.Assert;
import org.testng.annotations.Test;

import loginproject1.LoginDetails;
import project1data.Amazon_Signin;

public class Testcase14 extends LaunchQuit {
	@Test
	
	//go to cart and rate the last ordered product
	
	public void lastOrder_rating() throws EncryptedDocumentException, IOException
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
		a1.orders_link();
		a1.orders_timeline();
		a1.selectyear();
		a1.productreviewClick();
		Assert.assertTrue(a1.error_message());
	}

}
