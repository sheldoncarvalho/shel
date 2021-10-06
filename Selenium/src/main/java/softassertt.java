import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import junit.framework.Assert;

public class softassertt {

	@Test
	public void soft() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sheldon\\Automation\\chromedriver.exe");

    	WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //driver.get("http://demo.automationtesting.in/Frames.html");
        driver.get("https://www.javatpoint.com/jira-issues");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       driver.findElement(By.xpath("//a[text()=' Selenium']")).click();
       String currenturl= driver.getCurrentUrl();
       String Expectedurl ="https://www.javatpoint.com/selenium-tutorial";
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       WebDriverWait wt = new WebDriverWait(driver, 10);
       wt.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//h1[text()='Selenium Tutorial']"))));
       System.out.println(currenturl);
       //Assert.assertEquals(Expectedurl, currenturl);
       SoftAssert sf = new SoftAssert();
       sf.assertEquals(currenturl, Expectedurl, "verified");
       System.out.println("success");
       sf.assertAll();
       
        
	}
	
}
