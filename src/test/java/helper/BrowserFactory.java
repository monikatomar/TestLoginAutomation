package helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static java.util.concurrent.TimeUnit.SECONDS;


import utility.ConfigReader;


public class BrowserFactory {
	
	//Global driver
	public static WebDriver driver;
	
	//@Parameters("browserName")
	//A custom method to choose the browser on which the test need to be executed
	public static void startBrowser(String browserName)
	{
		//choose Firefox browser
		if (browserName.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
		}
		//choose Chrome browser
		else if (browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", ConfigReader.getChromePath());
			driver = new ChromeDriver();
		}
		//choose IE browser
		else if (browserName.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.chrome.driver", ConfigReader.getChromePath());
			driver = new InternetExplorerDriver();
		}
		//choose Headless browser
		if (browserName.equalsIgnoreCase("headless"))
		{
			driver = new HtmlUnitDriver();
		}
		
		//maximize browser
		driver.manage().window().maximize();
		
		//launch the url
		driver.get(ConfigReader.getURL());
				
	}

	//Scroll into view
	public static void scrollintoviewAndClickElement(WebDriver webdriver, WebElement webElement) throws Exception {
		((JavascriptExecutor) webdriver).executeScript("arguments[0].scrollIntoView(true);", webElement);
		Thread.sleep(500);
		//Highlight Element
		hightlightElement(webdriver, webElement);
		//Click on Element
		((JavascriptExecutor) webdriver).executeScript("arguments[0].click();", webElement);
		implicitWait(webdriver);
	}

	//Highlight element
	public static void hightlightElement(WebDriver webdriver, WebElement webElement) throws InterruptedException {
		// draw a border around the found element
		Thread.sleep(5000);
		JavascriptExecutor jse = (JavascriptExecutor) webdriver;
		jse.executeScript("arguments[0].style.border='3px solid red'", webElement);
		Thread.sleep(500);
		jse.executeScript("arguments[0].setAttribute('style', arguments[1]);", webElement, "");
		Thread.sleep(500);

	}

	public static void scrollintoviewElement(WebDriver webdriver, WebElement webElement) throws Exception {
		System.out.println("scrollintoviewElement+");

		((JavascriptExecutor) webdriver).executeScript("arguments[0].scrollIntoView(true);", webElement);
		Thread.sleep(500);
		hightlightElement(webdriver, webElement);
	}

	//Scroll to bottom of the page
	public static void scrollToBottom(WebDriver webDriver) {

		JavascriptExecutor js = (JavascriptExecutor) webDriver;
		js.executeScript("window.scrollTo(0, Math.max(document.documentElement.scrollHeight, document.body.scrollHeight, document.documentElement.clientHeight));");
	}
	//implicit wait
	public static void implicitWait(WebDriver webDriver) {
		webDriver.manage().timeouts().implicitlyWait(10, SECONDS);
	}

	//Explicit wait
	public static WebElement explicitWait(WebDriver webDriver, WebElement webElement) {
		WebDriverWait wait = new WebDriverWait(webDriver, 10);

		webElement = wait.until(ExpectedConditions.visibilityOf(webElement));
		return webElement;
	}
}
