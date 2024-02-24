package project1data;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentMethod {		
	
	@FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[5]")
	WebElement cashondelivery;
	
	@FindBy (xpath="//input[@value='SelectableAddCreditCard']")
	WebElement creditcard;
	
	@FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[2]")
	WebElement netbanking;
	
	@FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[3]")
	WebElement upi;
	
	@FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[4]")
	WebElement emi;
	
	@FindBy(linkText="Amazon.in homepage")
	WebElement gottohome;
	
	@FindBy(id="orderSummaryPrimaryActionBtn")
	WebElement usethispaymentmethod;
	
	@FindBy(id="bottomSubmitOrderButtonId")
	WebElement placeorderoption;
	
	@FindBy(xpath="//div[@class='a-row shipping-speeds'][1]")
	WebElement orderreview;
	
	@FindBy(xpath="//input[@placeholder='Enter Code']")
	WebElement couponcode;
	
	@FindBy(xpath="//span[contains(@class, 'a-button a-button-base')]")
	WebElement applycoupon;
	
	@FindBy(xpath="//p[text()='The promotional code you entered is not valid.']")
	WebElement invalidcouponmessage;
	
	@FindBy(xpath="//span[text()='Qty:']")
	List<WebElement> reviewitemnumber;
	
	public int reviewitemnum()
	{
	int count2=	reviewitemnumber.size();
	return count2;

	}
	
	public void casn_on_delivery()
	{
		cashondelivery.click();
	}
	
	public void crditcard()
	{
		creditcard.click();
	}
	public void netbanking()
	{
		netbanking.click();
	}
	public void upi()
	{
		upi.click();
	}
	public void emi()
	{
		emi.click();
	}
	public void got_to_home()
	{
		gottohome.click();
	}		
	public void use_paymentmethod()
	{
		usethispaymentmethod.click();
	}
	
	public boolean isplaceorderVisible()
	{
		boolean b=placeorderoption.isDisplayed();
		return b;
	}
	public boolean orderreview()
	{
		boolean d=orderreview.isDisplayed();
		return d;
	}
	
	public void entercoupon()
	{
		couponcode.sendKeys("abg123");
	}
	public void applycoupon()
	{
		applycoupon.click();
	}
	
	public String invalidcouponmessage()
	{
		String couponmessage=invalidcouponmessage.getText();
		return couponmessage;
		
	}
	
	
	
	 public PaymentMethod(WebDriver driver)
	  {
		  PageFactory.initElements(driver,this);
	  }

}
