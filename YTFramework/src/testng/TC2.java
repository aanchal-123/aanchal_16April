package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testing.Base.Base;
import org.testing.Pages.Login;
import org.testing.Pages.Logout;
import org.testng.annotations.Test;
public class TC2 extends Base

{

	
	@Test
	public void signup_code() throws Exception
	{
		
	/*	//1) Tag with attribute-------//Tagname[@attributeName='attValue']
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
	  
	  Thread.sleep(10000);
	  WebElement Subscriptions=driver.findElement(By.xpath(pr.getProperty("Subscriptions")));
      Subscriptions.click();
		
	  Thread.sleep(10000);
	  WebElement signout=driver.findElement(By.xpath(pr.getProperty("signout")));
	  signout.click();
	  
	  Thread.sleep(5000);
	  WebElement out=driver.findElement(By.xpath(pr.getProperty("out")));
	  out.click();			    
     */
		

		 Login object=new Login(driver,pr);
	        object.signin("aanchal.malhotra500@gmail.com", "AAN123aan@586");
	        
	      Thread.sleep(10000);
	  	  WebElement Subscriptions=driver.findElement(By.xpath(pr.getProperty("Subscriptions")));
	      Subscriptions.click();
		
		Logout Out=new Logout(driver, pr);
		Out.signout();
     
	}


}
