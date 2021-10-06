
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.junit.Assert;
import org.testng.asserts.SoftAssert;
public class softassert {
	
	@Test
	public static void soft() throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\sheldonc\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.browserstack.com/automate/capabilities");
	driver.findElement(By.xpath("//button[@id='accept-cookie-notification']")).click();
JavascriptExecutor js = (JavascriptExecutor)driver;
	//js.executeScript("window.scrollBy(0,500)"); //by pixel
	
   softassert softAssert = new softassert();
	String actual = driver.getCurrentUrl();
	String Expected = "https://www.browserstack.com/automatecapabilities";
	System.out.println(actual);
	softAssert.assertEquals("Hello", "Hello", "First soft assert failed");
//	Actions actions = new Actions(driver);
//    WebElement osDropdown = driver.findElement(By.xpath("//strong[text()='browserstack.networkLogsOptions']"));
//    actions.moveToElement(osDropdown);
//    actions.perform();
	System.out.println("success");
	//softassert.assertAll();
}
//	@Test
//	public static void  hello(){
//		 softassert softAssert = new softassert();
//			String actual = driver.getCurrentUrl();
//			String Expected = "https://www.browserstack.com/automatecapabilities";
//			System.out.println(actual);
//			softAssert.assertT
//	}

	private void assertEquals(String string, String string2, String string3) {
		// TODO Auto-generated method stub
		
	}
	
}