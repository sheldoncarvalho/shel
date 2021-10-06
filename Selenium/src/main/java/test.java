
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class test {
  WebDriver driver; 
	@Test
	public void Open() throws InterruptedException{
	//public static void main(String args[]) {
		// TODO Auto-generated method stub
		
		//"C:\Users\Sheldon\Automation\chromedriver.exe"
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Sheldon\\Automation\\chromedriver.exe");  
	      
	       // Instantiate a ChromeDriver class.       
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.browserstack.com/guide/testng-annotations-in-selenium");
	    Thread.sleep(5000);
	    //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    //driver.findElement(By.xpath("//button[@id='accept-cookie-notification']")).click();
		//
		
		 locators lc = new locators(); 
		 lc.loc(driver);


// hello friends ...
		 
	}

}
