package project1data;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Profile_Details {

	
@FindBy(xpath="//span[text()='Manage Profiles']")
WebElement manageprofile;

@FindBy(linkText="View")
WebElement viewprofile;

@FindBy(xpath="//*[@class='editNameIcon']")
WebElement editprofile;

@FindBy(xpath="//input[@id='editProfileNameInputId']")
WebElement updatename;

@FindBy(id="editProfileContinueButton")
WebElement continue_button;

@FindBy(xpath="//div[@class='profile-name desktop']")
WebElement profilename;

public void maangeprofile_click()
{
	manageprofile.click();
}
public void view_profile()
{
	viewprofile.click();
}

public void edit_profile()
{
	editprofile.click();
}

public void update_name()
{
	updatename.clear();
	updatename.sendKeys("Archana Bayary G");
}

public void continue_click() 
{
	
	continue_button.click();
}

public String get_profilename()
{
	String name=profilename.getText();
	System.out.println(name);
	return name;
}


public Amazon_Profile_Details(WebDriver driver)
{
	  PageFactory.initElements(driver,this);

}

}
