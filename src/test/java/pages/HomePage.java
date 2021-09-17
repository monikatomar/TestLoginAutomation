package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import helper.BrowserFactory;

public class HomePage {

	//POM constructor
	public HomePage()
	{
		PageFactory.initElements(BrowserFactory.driver, this);
	}
	
	//Find Apotheke icon after user login
	@FindBy(how = How.XPATH, using = "//div[@class='o-HeaderLarge__icon l-flex__primary']")
	static WebElement meinApotheke;
	
	//Method to check if home page is displayed
	public void validateHomePage() throws Exception
	{
		//Verification
		BrowserFactory.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		BrowserFactory.scrollintoviewElement(BrowserFactory.driver, meinApotheke);
		boolean verifyMsg = meinApotheke.isDisplayed();

	}



}
