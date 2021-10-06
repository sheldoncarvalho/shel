import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators extends test{
WebDriver driver;
	public void loc(WebDriver driver) {
		 this.driver=driver;
	    //WebDriver driver=new ChromeDriver();
		 driver.findElement(By.xpath("//button[text()=' Accept All ']")).click();
	
}
	}
