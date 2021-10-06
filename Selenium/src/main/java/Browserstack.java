
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.junit.Assert;

public class Browserstack {
	public static void main(String[] args) throws InterruptedException {
	
	//System.setProperty("webdriver.chrome.driver","C:\\Users\\sheldonc\\Downloads\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sheldon\\Automation\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.browserstack.com/automate/capabilities");
	driver.findElement(By.xpath("//button[@id='accept-cookie-notification']")).click();
//JavascriptExecutor js = (JavascriptExecutor)driver;
	//js.executeScript("window.scrollBy(0,500)"); //by pixel

	//WebElement element = driver.findElement(By.xpath("//h2[@id='reference-section']"));
	//js.executeScript("arguments[0].scrollIntoView();", element);// scroll by value
	
//	String actual = driver.getCurrentUrl();
//	String Expected = "https://www.browserstack.com/automatecapabilities";
//	System.out.println(actual);
//	Assert.assertEquals("test", Expected, actual);
	Actions actions = new Actions(driver);
	WebElement osDropdown = driver.findElement(By.xpath("//strong[text()='browserstack.networkLogsOptions']"));
   actions.moveToElement(osDropdown);
   actions.perform();
	System.out.println("success");
	
}
}