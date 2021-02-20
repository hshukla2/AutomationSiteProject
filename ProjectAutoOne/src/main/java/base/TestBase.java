package base;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import exception.BrowserNotCompatableException;

public class TestBase {
       
           public static WebDriver driver;
           Actions action;
           Properties prop;
           
           public TestBase() {
        	   prop=new Properties();
        	   try {
        	   prop.load(new FileInputStream("config//config.properties"));
        	   String browser=prop.getProperty("browser");
        	   if(browser.equalsIgnoreCase("chrome")) {
        		   System.setProperty("webdriver.chrome","driver///chromedriver.exe");
        		   driver=new ChromeDriver();
        	   }
        	   else if(browser.equalsIgnoreCase("ff")) {
        		   System.setProperty("webdriver.gecko.driver","driver//geckodriverc.exe");
        		   driver=new ChromeDriver();
        	   }
        	   else {
        		   throw new BrowserNotCompatableException("APPLICATION DOESNT SUPPORT THIS BROWSER");
        	   }
        	   }
        	   catch(IOException e) {
        		   e.printStackTrace();
        	   }
        	   catch(BrowserNotCompatableException e) {
        		   e.printStackTrace();  
        	   }
        		  
           }
	
	public void init() {
	
		
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts.implicitlywait(10.timeUnit,SECONDS);
	}
}
