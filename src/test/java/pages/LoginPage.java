package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import helper.BrowserFactory;
//import utilityPackage.ExcelDataConfig;

import java.util.concurrent.TimeUnit;

public class LoginPage {
	//BrowserFactory browserObj;	
	//driver constructor for the page
	public LoginPage()
	{
		//browserObj = new BrowserFactory();
		PageFactory.initElements(BrowserFactory.driver, this);
	}
	
	//Username definition
	@FindBy(how = How.ID, using = "login-email")
	@CacheLookup
	static WebElement Username;
	
	//Password definition
	@FindBy(how = How.ID, using = "login-password")
	@CacheLookup
	static WebElement Password;
	
	//Login button definition
	@FindBy(how = How.ID, using ="btn-login")
	@CacheLookup
	static WebElement LoginButton;
	
	//Method to perform login actions
	public void loginSteps(String userName, String pwd) throws Exception {

		// Scroll and highlight the element for display
		BrowserFactory.scrollintoviewElement(BrowserFactory.driver, Username);
		Username.sendKeys(userName);
		System.out.println("Entered Username");
					
		//Send value to the password textBox
		BrowserFactory.scrollintoviewElement(BrowserFactory.driver, Password);

		Password.sendKeys(pwd);
		System.out.println("Entered Password");
			
		//Click on Register or Login Button
		BrowserFactory.scrollintoviewAndClickElement(BrowserFactory.driver,LoginButton);
		System.out.println("Clicked on Login button");
		
	}

	//Method to check if home page is displayed after login
	public void validateLoginPage() throws Exception
	{
		// Adding the time wait to observe screen behaviour
		BrowserFactory.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// Scroll and highlight the element for display
		BrowserFactory.scrollintoviewElement(BrowserFactory.driver, LoginButton);
		boolean verifyMsg = LoginButton.isDisplayed();
		if(verifyMsg == true){
			System.out.println("Invalid User Login scenario Passed");
		}else{
			System.out.println("Invalid User Login scenario Failed");
		}
	}

}
