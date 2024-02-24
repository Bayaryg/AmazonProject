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

public class Testcase11 extends LaunchQuit{
	
	//validate entire checkout process including, address selection, order review and payment method selection
	
	@Test
	public void order_checkout() throws EncryptedDocumentException, IOException
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
		a4.go_to_cart();
		a4.proceed_to_buy();
		a4.select_diff_address();
		a4.select_address();
		
		PaymentMethod p1=new PaymentMethod(driver);
		
		p1.casn_on_delivery();
		p1.use_paymentmethod();
		
		Assert.assertTrue(p1.isplaceorderVisible());
//		Assert.assertTrue(p1.orderreview());
		
	
	
	}

}
