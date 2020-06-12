package testng;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC5 
{
public ChromeDriver driver;
	
	@BeforeMethod
	
	 public void launch() throws Exception
	 {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aanchal\\Desktop\\chromedriver.exe");//System.out.println("value is" +System.getProperty("webdriver.chrome.driver"));
			driver=new ChromeDriver();//classname refeernce_varable=new classname  
			//driver.manage().window().maximize();//Maximize the browser
			driver.get("https://www.youtube.com");
			Options op=driver.manage();
			Window w=op.window();
			w.maximize();	
			 Thread.sleep(10000);
	 }	
	
	@Test
	public void signup_code() throws Exception
	{
		//1) Tag with attribute-------//Tagname[@attributeName='attValue']
        //input[@name='email']
      WebElement sign_in=driver.findElement(By.xpath("//yt-formatted-string[@class='style-scope ytd-button-renderer style-suggestive size-small']"));
      sign_in.click();
      
      Thread.sleep(5000);
      WebElement email=driver.findElement(By.xpath("//input[@type='email']"));
	  email.sendKeys("aanchal.malhotra500@gmail.com");
	  
	  WebElement next=driver.findElement(By.xpath("//span[@class='CwaK9']"));
	  next.click();
	  
	  Thread.sleep(5000);
	  WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
	  password.sendKeys("AAN123aan@586");
		
	  WebElement next2=driver.findElement(By.xpath("//span[@class='RveJvd snByac']"));
	  next2.click();
	  
	  Thread.sleep(5000);
      WebElement video=driver.findElement(By.id("video-title"));
      Actions ac=new Actions(driver);
      ac.sendKeys(Keys.CONTROL).click(video).keyUp(Keys.CONTROL).build().perform();
      
     Set<String> all_window = driver.getWindowHandles();//it will return the address of all window/tab and return type of getwindowhandles is Set<String>
     
     System.out.println("Before switching URL is "+driver.getCurrentUrl());
     for(String s : all_window)//all_window contains all tab address
     {
    	 driver.switchTo().window(s);	
    	 
     }
     
     Thread.sleep(2000);
		WebElement likevideo =driver.findElement(By.xpath("(//button[contains(@aria-label,'like this video')] )[1]"));
		likevideo.click();
		
	  Thread.sleep(10000);
	  WebElement signout=driver.findElement(By.xpath("//img[@class='style-scope yt-img-shadow' and @alt='Avatar image']"));
	  signout.click();
	  
	  Thread.sleep(5000);
	  WebElement out=driver.findElement(By.xpath("//yt-formatted-string[text()='Sign out']"));
	  out.click();			    
     
	}
	
	@AfterMethod
	public void close()
	{
		driver.close();
	}

	
}