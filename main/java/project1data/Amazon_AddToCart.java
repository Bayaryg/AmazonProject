package project1data;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amazon_AddToCart {
	
	@FindBy(id="add-to-cart-button")
	WebElement addtocartbutton;
	
	@FindBy(xpath="//span[contains(text(), 'Added to Cart')]")
	WebElement addtocartsuccess;
	
	@FindBy(xpath="//a[contains(text(),'Go to Cart')]")
	WebElement gotocart;
	
	@FindBy(xpath="//span[text()='Qty:']")
	List<WebElement> cartitemnumber;
	
	@FindBy(xpath="//span[@class='a-button-text a-declarative']")
	WebElement qtyclick;
	
	@FindBy(xpath="(//div[@class='a-popover-wrapper'])/div/ul/li[4]")
	WebElement quantitylist;
	
	@FindBy(xpath="//input[@value='Delete']")
	WebElement deletefromcart;
	
	@FindBy(xpath="//h1[contains(text(), 'Your Amazon Cart is empty')]")
	WebElement emptycart;
	
	@FindBy(id="desktop-ptc-button-celWidget")
	WebElement proceedtobuy;
	
	@FindBy(id="orderSummaryPrimaryActionBtn")
	WebElement selectaddrress;
	
	@FindBy(xpath="(//input[@name='submissionURL'])[2]")
	WebElement diffaddress;
	
public void add_to_cart()
{
	 addtocartbutton.click();;
}

public int cartitemnum()
{
int count1=	cartitemnumber.size();
return count1;

}

public String success_message()
{
	String message=addtocartsuccess.getText();
	return message;
}

public void go_to_cart()
{
	gotocart.click();
	
}
public void click_quntity()
{
	qtyclick.click();
}
public void select_quantity()
{
	
	quantitylist.click();
}

public void proceed_to_buy()
{
	proceedtobuy.click();
}
public void select_diff_address()
{
	diffaddress.click();
}
public void select_address()
{
	selectaddrress.click();
}
public void delete_from_cart() throws InterruptedException
{
	
Thread.sleep(3000);
deletefromcart.click();
}

public String delete_success()
{
	String emptycartmessage=emptycart.getText();
	return emptycartmessage;
}
	
public Amazon_AddToCart(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

}
