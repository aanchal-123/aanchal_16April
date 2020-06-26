package testng;

//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testing.Base.Base;
import org.testing.Pages.Login;
import org.testing.Pages.Logout;
import org.testing.Pages.VideoPlay;
import org.testng.annotations.Test;
public class TC7 extends Base

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
		List<WebElement> video=driver.findElements(By.id(pr.getProperty("video")));
		video.get(4).click();//it is going to fourth vide0
	  
	  Thread.sleep(10000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");
	
		
		Thread.sleep(10000);
		driver.findElement(By.xpath(pr.getProperty("Add_comment"))).click();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(10000);
		WebElement comment=driver.findElement(By.xpath(pr.getProperty("comment")));
		comment.sendKeys("Perfect");
		
		Thread.sleep(10000);
		WebElement commentSubmit = driver.findElement(By.xpath(pr.getProperty("commentSubmit")));
		commentSubmit.click();
		
		
		
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
	     
	     Thread.sleep(10000);
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,400)");
		
			
		Thread.sleep(10000);
		driver.findElement(By.xpath(pr.getProperty("Add_comment"))).click();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
		Thread.sleep(10000);
		WebElement comment=driver.findElement(By.xpath(pr.getProperty("comment")));
		comment.sendKeys("Perfect");
			
		Thread.sleep(10000);
		WebElement commentSubmit = driver.findElement(By.xpath(pr.getProperty("commentSubmit")));
		commentSubmit.click();
			
	     
		 Logout Out=new Logout(driver, pr);
		 Out.signout();	
		
		
		
		
	}
	
}
