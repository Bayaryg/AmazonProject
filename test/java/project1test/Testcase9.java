package project1test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import loginproject1.LoginDetails;
import project1data.Amazon_AddToCart;
import project1data.Amazon_Signin;
import project1data.Amzn_Search;

public class Testcase9 extends LaunchQuit{
	
	//add items to cart from products page
	
	@Test
	public void add_to_cart() throws EncryptedDocumentException, IOException
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
		a3.elementclick();
		a3.switchwindow(driver);
		
		Amazon_AddToCart a4=new Amazon_AddToCart(driver);
		a4.add_to_cart();
		Assert.assertEquals(a4.success_message(), "Added to Cart");
	
	
	}
}
