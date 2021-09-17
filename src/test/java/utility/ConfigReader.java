package utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
	
	//Creating an object for properties
	public static Properties pro;
	
	//Config reader definition
	public ConfigReader()
	{
		try
		{
			File src = new File("./testConfigFiles/Config.property");
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		}
		catch(Exception e)
		{
			System.out.println("Exception is =="+e.getMessage());
		}
	}
	
	//Method to get the chrome path from config file
	public static String getChromePath()
	{
		try
		{
			File src = new File("./testConfigFiles/Config.property");
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		}
		catch(Exception e)
		{
			System.out.println("Exception is =="+e.getMessage());
		}
		
		String path = pro.getProperty("ChromeDriver");
		return path;
	}
	
	//Method to get the URL from config file
	public static String getURL()
	{
		try
		{
			File src = new File("./testConfigFiles/Config.property");
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		}
		catch(Exception e)
		{
			System.out.println("Exception is =="+e.getMessage());
		}
		
		String url = pro.getProperty("URL");
		return url;
	}

}
