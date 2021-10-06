

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {
	public static void main(String[] args) throws InterruptedException {
        // declaration and instantiation of objects/variables
    	//System.setProperty("webdriver.chrome.driver","C:\\Users\\sheldonc\\Downloads\\chromedriver_win32\\chromedriver.exe");
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sheldon\\Automation\\chromedriver.exe");

    	WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/#iFrame");
        
        //JavascriptExecutor js = (JavascriptExecutor) driver;
        //js.executeScript("window.scrollBy(0,100)");
        Thread.sleep(5000);
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@name='globalSqa']")));
        
        driver.findElement(By.xpath("//input[@id='s']")).sendKeys("abc");
        
        

        
}
}