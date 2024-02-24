package project1data;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Product_Details {
	
	@FindBy(xpath="//h2[contains(text(),'Customer reviews')]")
	WebElement custmerreview;
	
	@FindBy(xpath="//h2[contains(text(),'Product Description')]")
	WebElement description;
	
	@FindBy(xpath="//div[@class='a-section a-spacing-none aok-align-center aok-relative']")
	WebElement price;
	
public boolean is_review_diplayed()
{
	return custmerreview.isDisplayed();
}
public boolean is_description_diplayed()
{
	return description.isDisplayed();
}
public boolean is_price_diplayed()
{
	return price.isDisplayed();
}
	
	
public Product_Details(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
}
