import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class del {
	@Test
	public static void nakshatra() throws InterruptedException {
		// declaration and instantiation of objects/variables
		// System.setProperty("webdriver.chrome.driver","C:\\Users\\sheldonc\\Downloads\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sheldon\\Automation\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");

		driver.findElement(By.xpath("//div[@class='container']/input[1]")).sendKeys("Sheldon");
		driver.findElement(By.xpath("//div[@class='container']/input[2]")).sendKeys("Carvalho");
		driver.findElement(By.xpath("//div[@class='container']/input[3]")).sendKeys("sheldoncarvalho63@gmail.com");
		driver.findElement(By.xpath("//div[@class='container']/input[4]")).sendKeys("Di!@#");

		WebElement checkbox = driver.findElement(By.xpath("//table[@id='contactList']/tbody/tr/td/input"));
		checkbox.click();

		boolean boo = driver.findElement(By.xpath("//table[@id='contactList']/tbody/tr/td/input")).isSelected();
		Thread.sleep(10000);
		
//		  if(boo) { System.out.println("success"); } else {
//		  System.out.println("failure"); } //if(checkbox=true)
//		  
//		  String actual =
//		  driver.findElement(By.xpath("//div[text()='Already have an account? ']")).getText(); 
//		 // System.out.println(actual +"this i test"); 
//		  String Expected = "al";
//		 
//		  //Assert.assertEquals(Expected, actual);
//		 
//		// Assert.assertTrue(boo);
//
//		SoftAssert sa = new SoftAssert();
//		sa.assertEquals(Expected, actual);
//		System.out.println("success finally");
//		sa.assertAll();
//		Actions act = new Actions(driver);
//		act.moveToElement(driver.findElement(By.xpath("//td[text()='Giovanni Rovelli']"))).build().perform();
//		
		
//		List<WebElement> mul = driver.findElements(By.xpath("//td"));
//		int ss= mul.size();
//		System.out.println(mul);
//		System.out.println(ss);
		
		
		Set<String> top = driver.getWindowHandles();
		int tt= top.size();
		System.out.println(top);
		System.out.println(tt);
		
		//clone test123
		
		
	}

}
