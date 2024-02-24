package project1test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import loginproject1.LoginDetails;
import project1data.Amazon_Signin;
import project1data.Amzn_Search;
import project1data.Product_Details;

public class Testcase8 extends LaunchQuit{
	
	//check if products can be sorted by relevance, price, rating
	
	@Test
	public void verify_product_sorting() throws EncryptedDocumentException, IOException
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
		a3.sort_click();
		a3.sort_by_review();
		
		a3.price_range();
		a3.rating();
		Assert.assertEquals(a3.sort_text(), "Avg. Customer Review");	
		
		
		
	}


}
