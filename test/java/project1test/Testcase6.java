package project1test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import loginproject1.LoginDetails;
import project1data.Amazon_Signin;
import project1data.Amzn_Search;

public class Testcase6 extends LaunchQuit {
	
	//verify that search with filters (category, price range)yields accurate results
	
	@Test
	public void search_products_with_filter() throws EncryptedDocumentException, IOException
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
		a3.select_category();
		a3.seraching_the_product();
		a3.price_range();
		a3.sub_category();		
		
	}

	

}
