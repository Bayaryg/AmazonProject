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

public class Testcase12 extends LaunchQuit{
	
	//apply for coupon code while ordering
	
	@Test
	public void coupon_code() throws EncryptedDocumentException, IOException
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
		
		p1.entercoupon();
		p1.applycoupon();
		
		Assert.assertEquals(p1.invalidcouponmessage(), "The promotional code you entered is not valid.");

		
	
	
	}

}
