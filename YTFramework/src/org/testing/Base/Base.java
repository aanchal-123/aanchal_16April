package org.testing.Base;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base 
{
	public ChromeDriver driver;
	public Properties pr ;// so that child can use this properties object
	
	@BeforeMethod
	
	 public void launch() throws Exception
	 {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aanchal\\git\\repositoryaanchalProject1\\YTFramework\\chromedriver.exe");//System.out.println("value is" +System.getProperty("webdriver.chrome.driver"));
			driver=new ChromeDriver();//classname refeernce_varable=new classname  
			//driver.manage().window().maximize();//Maximize the browser
			driver.get("https://www.youtube.com");
			Options op=driver.manage();
			Window w=op.window();
			w.maximize();	
			 Thread.sleep(10000);
			 
		File f=new File("C:\\Users\\Aanchal\\git\\repositoryaanchalProject1\\YTFramework\\Locators.properties");
		FileInputStream fi=new FileInputStream(f);
		pr=new Properties();
		pr.load(fi);
		
			 
	 }	
	
	
	@AfterMethod
	public void close()
	{
		driver.close();
	}

}
