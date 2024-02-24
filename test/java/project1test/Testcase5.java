package project1test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import loginproject1.LoginDetails;
import project1data.Amazon_Signin;
import project1data.Amzn_Search;

public class Testcase5 extends LaunchQuit{
	
	//test searching for products using their name
	
	@Test
	public void search_products() throws EncryptedDocumentException, IOException
	{
		LoginDetails.validata();
		Amazon_Signin a1=new Amazon_Signin(driver);
		a1.hoverover_account(driver);
		a1.sign_in();
		a1.un_valid();
		a1.un_submit();
		a1.pwd_valid();
		a1.signin_button();
		
		Amzn_Search a3=new Amzn_Search(driver);		
		a3.seraching_the_product();
		
		Assert.assertEquals(a3.is_search_pass(), "1-48 of over 40,000 results for");
		
		
		
	}

}
