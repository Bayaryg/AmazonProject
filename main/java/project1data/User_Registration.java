package project1data;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import loginproject1.LoginDetails;

public class User_Registration extends LoginDetails{
	
	@FindBy(linkText="Start here.")
	WebElement registerlink;
	
	@FindBy(id="ap_customer_name")
	WebElement name;
	
	@FindBy(id="ap_phone_number")
	WebElement mobilenumber;
	
	@FindBy(id="ap_password")
	WebElement newpassword;
	
	@FindBy(id="continue")
	WebElement verifymobilenum;
	
	@FindBy(id="auth-pv-enter-code")
	WebElement enterotp;
	
	@FindBy(id="auth-verify-button")
	WebElement createaccount;
	
	@FindBy(xpath="//h4[text()='There was a problem']")
	WebElement errormessage;
	
	public void clickregister()
	{
		registerlink.click();
	}
	
	public void entername()
	{
		name.sendKeys(registername);
	}
	public void entermobilenumber()
	{
		mobilenumber.sendKeys(mobilenumber2);
	}
	public void enterpassword()
	{
		newpassword.sendKeys(registerpassword);
	}
	
	public void clickverifiymobnum()
	{
		verifymobilenum.click();
	}
	public void enterotp()
	{
		enterotp.sendKeys("123456");
	}
	public void clickcreateaccount()
	{
		createaccount.click();
	}
	
	public String invalidotperror()
	{
	String errormessage1=errormessage.getText();
	return errormessage1;
		
	}
	public User_Registration(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	

}
