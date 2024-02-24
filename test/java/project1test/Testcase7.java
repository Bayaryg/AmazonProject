package project1test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import loginproject1.LoginDetails;
import project1data.Amazon_Signin;
import project1data.Amzn_Search;
import project1data.Product_Details;

public class Testcase7 extends LaunchQuit{
	//product detail page displays all necessary details like price review description
	@Test
	public void verify_prodct_details() throws EncryptedDocumentException, IOException
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
		a3.elementclick();
		a3.switchwindow(driver);
		
		Product_Details p1=new Product_Details(driver);
		
		Assert.assertTrue(p1.is_description_diplayed());
		Assert.assertTrue(p1.is_price_diplayed());
		Assert.assertTrue(p1.is_review_diplayed());
		
		
	}

}
