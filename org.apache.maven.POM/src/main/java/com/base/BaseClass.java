package com.base;


import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class BaseClass {
	
	public static WebDriver driver;
	public static Properties prop;

	public  BaseClass() throws IOException
	{
		// prop = new Properties();
		// FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+ "C:\\Users\\n.fathima\\eclipse-workspace\\org.apache.maven.POM\\src\\main\\java\\com\\config\\config.properties");
	//	prop.load(ip);
		ChromeOptions chromeOptions = new ChromeOptions();
		String driverPath = "C:\\Users\\n.fathima\\chromedriver.exe";
	    
	    chromeOptions.setBinary("C:\\Users\\n.fathima\\AppData\\Local\\Google\\Chrome\\Application\\chrome.exe");
	    //driver = new ChromeDriver(chromeOptions);
	   
		
       //String browserName = prop.getProperty("browser");
		
		
			System.setProperty("webdriver.chrome.driver", driverPath);
			driver = new ChromeDriver(chromeOptions); 
			driver.get("http://portal-dev.cmp-df.net/?user=demo&password=portal");
		
	    
		
	}

}
