package testng;

//import java.util.Set;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
import org.testing.Base.Base;
import org.testing.Pages.Login;
import org.testing.Pages.Logout;
import org.testing.Pages.VideoPlay;
import org.testng.annotations.Test;

public class TC5 extends Base
{

	
	@Test
	public void signup_code() throws Exception
	{
	
	/*	
		//1) Tag with attribute-------//Tagname[@attributeName='attValue']
        //input[@name='email']
	  WebElement sign_in=driver.findElement(By.xpath(pr.getProperty("sign_in")));
      sign_in.click();
      
      Thread.sleep(5000);
      WebElement email=driver.findElement(By.xpath(pr.getProperty("email")));
	  email.sendKeys("aanchal.malhotra500@gmail.com");
	  
	  WebElement next=driver.findElement(By.xpath(pr.getProperty("next")));
	  next.click();
	  
	  Thread.sleep(5000);
	  WebElement password=driver.findElement(By.xpath(pr.getProperty("password")));
	  password.sendKeys("AAN123aan@586");
		
	  WebElement next2=driver.findElement(By.xpath(pr.getProperty("next2")));
	  next2.click();
	  
	  Thread.sleep(5000);
      WebElement video=driver.findElement(By.id(pr.getProperty("video")));
      Actions ac=new Actions(driver);
      ac.sendKeys(Keys.CONTROL).click(video).keyUp(Keys.CONTROL).build().perform();
      
     Set<String> all_window = driver.getWindowHandles();//it will return the address of all window/tab and return type of getwindowhandles is Set<String>
     
     System.out.println("Before switching URL is "+driver.getCurrentUrl());
     for(String s : all_window)//all_window contains all tab address
     {
    	 driver.switchTo().window(s);	
    	 
     }
     
     Thread.sleep(2000);
		WebElement likevideo =driver.findElement(By.xpath(pr.getProperty("likevideo")));
		likevideo.click();
		
	  Thread.sleep(10000);
	  WebElement signout=driver.findElement(By.xpath(pr.getProperty("signout")));
	  signout.click();
	  
	  Thread.sleep(5000);
	  WebElement out=driver.findElement(By.xpath(pr.getProperty("out")));
	  out.click();			    
    */
		
		
		 Login object=new Login(driver,pr);
	     object.signin("aanchal.malhotra500@gmail.com", "AAN123aan@586");
	     
	     VideoPlay like=new VideoPlay(driver,pr);
	     like.video_play();
	     
	     Thread.sleep(2000);
		 WebElement likevideo =driver.findElement(By.xpath(pr.getProperty("likevideo")));
		 likevideo.click();
	     
		 Logout Out=new Logout(driver, pr);
		 Out.signout();
	}
	
	

	
}
