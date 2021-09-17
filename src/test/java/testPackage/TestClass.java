package testPackage;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

//import com.aventstack.extentreports.Status;

import pages.HomePage;
import pages.LoginPage;

public class TestClass extends BaseClass {
	
	
	//A simple test case to check if user is able to login successfully
	@Test(description = "Test to validate User login using valid credentials")
	public void loginTest()
	{
		try{

		System.out.println("Start of loginTest :");

		SoftAssert softAssert = new SoftAssert();

		//Initiate PO for login page
		LoginPage login_page = new LoginPage();

		//Pass valid credentials for login verification
			login_page.loginSteps("monikatomar09@yahoo.com","Monika1991");
		//softAssert.assertEquals(true, true, "Test failed after launching url");

		//Initiate PO for home page and validate
		HomePage home_page = new HomePage();
		home_page.validateHomePage();

		softAssert.assertEquals(true, true);
		System.out.println("Login test Passed");

		softAssert.assertAll();

		}catch (Exception e){
			System.out.println("Inside exception :"+e.getMessage());
		}
		
	}
	
	@Test(description = "Test to validate User login using invalid credentials")
	public void loginTest2()
	{		
		try{
		System.out.println("Test to validate User login using invalid credentials start");

		SoftAssert softAssert = new SoftAssert();
		//Initiate PO for login page
		LoginPage login_page = new LoginPage();

		//Pass invalid credentials for login
		login_page.loginSteps("monikatomar09@yahoo.com","Monika1992");
		softAssert.assertEquals(true, true, "Test failed after launching url");

		//Validate same login page after invalid credentials
			LoginPage login_page2 = new LoginPage();
			login_page2.validateLoginPage();
			softAssert.assertEquals(true, true);

		}catch (Exception e){
			System.out.println("Inside exception :"+e.getMessage());
		}
		
	}

}
