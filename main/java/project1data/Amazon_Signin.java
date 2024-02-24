package project1data;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import loginproject1.LoginDetails;

public class Amazon_Signin extends LoginDetails{
	  @FindBy(xpath="//span[text()='Account & Lists']")
	  WebElement accounts;
	 
	  @FindBy(xpath="//span[text()='Sign in']")
	  WebElement signin;
	  
	  @FindBy(id="ap_email") 
	  WebElement username;
	  
	  @FindBy(id="continue") 
	  WebElement username_submit;
	  
	  @FindBy(name="password") 
	  WebElement password;

	  @FindBy(xpath="//input[@id='signInSubmit']") 
	  WebElement signin_button;
	  
	  @FindBy(xpath="//span[text()='Your Orders']")
	  WebElement ordersnavigation;
	  
	  @FindBy(xpath="//span[@id='a-autoid-1-announce']")
	  WebElement ordertimeline;
	  
	  @FindBy(xpath="//span[contains(text(),'Your password is incorrect')]")
	  WebElement message;
	  
	  @FindBy(xpath="//span[text()='Hello, archana']")
	  WebElement passmessage;
	  
	  @FindBy(css="li.a-dropdown-item")
	  List<WebElement> yearlist;
	  
	  @FindBy(xpath="(//a[@id='Write-a-product-review_2'])[1]")
	  WebElement productreview;
	  
	  @FindBy(xpath="//span[contains(text(),'We apologize')]")
	  WebElement errormessage;
	  
	  //2. creating the method for each component to perform its action	  
	 
	 public void hoverover_account(WebDriver driver)
	  {
		  Actions a1=new Actions(driver);
		  a1.moveToElement(accounts).perform();
	  }	 
	 public void sign_in()
	  {
		 signin.click();
	  }
	 
	 public void un_valid()
	  {
		  username.sendKeys(uname);
	  }
	 
	 public void un_invalid()
	  {
		  username.sendKeys(uname1);
	  }
	  public void un_submit()
	  {
		  username_submit.click();
	  }
	  public void pwd_valid()
	  {
		 password.sendKeys(passwd);
	  }
	  
	  public void pwd_invalid()
	  {
		 password.sendKeys(passwd1);
	  }
	  public void signin_button()
	  {
		  signin_button.click();
	  }
	  public void orders_link()
	  {
		  ordersnavigation.click();
	  }
	  public void orders_timeline()
	  {
		  ordertimeline.click();
	  }
	  
	  public void selectyear()
	  {
		  System.out.println(yearlist.size());
		  yearlist.get(7).click();
	  }
	  public void productreviewClick()
	  {
		  productreview.click();
	  }
	  
	  public boolean error_message()
	  {
		  boolean ismessagedisplayed=errormessage.isDisplayed();
		  return ismessagedisplayed;
	  }
	  
	  
	  public String failed_login_message()
	  {
		  String s=message.getText();
		  System.out.println(s);
		  return s;		
	  }
	  
	  public String passed_login_message()
	  {
		  String s1=passmessage.getText();
		  System.out.println(s1);
		  return s1;		
	  }  
	  

	//3. initializing each component using page factory class

	public Amazon_Signin(WebDriver driver)
	{
		  PageFactory.initElements(driver,this);
	}
	

}
