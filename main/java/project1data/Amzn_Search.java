package project1data;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Amzn_Search {
//step1
	//WebDriver driver;
	@FindBy(id="twotabsearchtextbox") 
	  WebElement search_tf;
	
	@FindBy(xpath="(//*[contains(@class,'a-section aok-relative')])[1]")
	 WebElement firstelement;
	
	@FindBy(xpath="//span[text()='1-48 of over 40,000 results for']")
	WebElement searchpasstext;
	 
	@FindBy(id="searchDropdownBox")
	WebElement selectcategory;
	
	@FindBy(xpath="//span[text()='₹1,000 - ₹2,500']")
	WebElement pricerange;
	@FindBy(xpath="//li[@id='p_72/1318476031']")
	WebElement rating;
	
	@FindBy(xpath="//span[text()='Safety Shoes']")
	WebElement subcategory;
	
	@FindBy(id="a-autoid-0-announce")
	WebElement sort;
	
	@FindBy(xpath="//span[@class='a-dropdown-prompt']")
	WebElement sorttext;
	
	@FindBy(xpath="(//div[@class='a-popover-wrapper'])/div/ul/li[4]")
	WebElement sortbyreview;
	
//step2
	 
	public void select_category()
	{
		Select s1=new Select(selectcategory);
		s1.selectByVisibleText("Shoes & Handbags");
	}
	 public void seraching_the_product()
	  {
		  search_tf.sendKeys("Shoes");
		  search_tf.sendKeys(Keys.ENTER);
	  }
	 
	 public void sort_click()
	 {
		 sort.click(); 
	 }
	 public void sort_by_review()
	 {
		 sortbyreview.click();
		 
	 }
	 
	 public String sort_text()
	 {
		 String ssorttext=sorttext.getText();
			return ssorttext; 
	 }
	 public void rating()
	 {
		 rating.click();
	 }
	 
	 public void price_range()
	 {
		 pricerange.click();
	 }
	 public void sub_category()
	 {
		 subcategory.click();
	 }	 
	 public void elementclick()
	 {
		 firstelement.click();
	 }	 
	 public String is_search_pass()
	 {
		String text= searchpasstext.getText();
		System.out.println(text);
		return text;
	 }
	 
	 public void switchwindow(WebDriver driver)
	 {
			Set<String> winhandle=driver.getWindowHandles();
			Iterator<String> ids=winhandle.iterator();
			String parentid=ids.next();
			String childid=ids.next();
			driver.close();
			driver.switchTo().window(childid);
	 }  
	 
//step3
	 
	 public Amzn_Search(WebDriver driver)
	 {
	 	  PageFactory.initElements(driver,this);
	 }
	 
	
}
