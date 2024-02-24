package project1test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import loginproject1.LoginDetails;
import project1data.Amazon_AddToCart;
import project1data.Amazon_Signin;
import project1data.Amzn_Search;
import project1data.PaymentMethod;

public class Testcase15 extends LaunchQuit{
	//reach till cart without logging in
	@Test
	public void without_login() throws EncryptedDocumentException, IOException
	{
		Amzn_Search a3=new Amzn_Search(driver);
		a3.seraching_the_product();
		a3.elementclick();
		a3.switchwindow(driver);
		
		Amazon_AddToCart a4=new Amazon_AddToCart(driver);
		a4.add_to_cart();
		a4.go_to_cart();
		
		
		Assert.assertEquals(driver.getTitle(), "Amazon.in Shopping Cart");
	
	
	}
	

}
