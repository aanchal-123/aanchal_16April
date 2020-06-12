package testng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC7 

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
	  
	  Thread.sleep(10000);
		List<WebElement> video=driver.findElements(By.id("video-title"));
		video.get(4).click();//it is going to fourth vide0
	  
	  Thread.sleep(10000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");
	
		
		Thread.sleep(10000);
		driver.findElement(By.xpath("//yt-formatted-string[contains(text(),'Add a public comment...')]")).click();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(10000);
		WebElement comment=driver.findElement(By.xpath("//div[@id='contenteditable-root' and @aria-label='Add a public comment...']"));
		comment.sendKeys("Perfect");
		
		Thread.sleep(10000);
		WebElement commentSubmit = driver.findElement(By.xpath("//yt-formatted-string[@id='text' and text()='Comment']"));
		commentSubmit.click();
		
		
		
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