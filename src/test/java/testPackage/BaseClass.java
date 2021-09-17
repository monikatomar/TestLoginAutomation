package testPackage;

import java.lang.reflect.Method;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

/*import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;*/

import helper.BrowserFactory;

public class BaseClass {
	
	@BeforeTest
	public void testInit()
	{
		// This can be used for set parameter to generate HTML reports using testNg
	}
	
	@BeforeMethod
	public void setUpTest(Method method)
	{
		//Initiate driver
		BrowserFactory.startBrowser("chrome");
	}
	
	@AfterMethod
	public void tearDownTest(ITestResult result)
	{
		//quit the instance of driver
		BrowserFactory.driver.quit();
	}
	
	@AfterTest
	public void clearUp()
	{
	//	This can be used to flush existing reports
	}

}
