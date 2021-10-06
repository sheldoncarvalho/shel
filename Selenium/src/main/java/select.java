import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class select {

@Test
public void selectmethod() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sheldon\\Automation\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    //driver.get("http://demo.automationtesting.in/Frames.html");
    driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
    WebElement sel =driver.findElement(By.id("select-demo"));
    Select sele = new Select(sel);
    //sele.selectByValue("Monday");
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    sele.selectByIndex(5);
    
    driver.findElement(By.xpath("//option[text()='New York']")).click();
    driver.findElement(By.xpath("//button[text()='Get All Selected']")).click();
    
    //test1212
//donetoday
	
}
	
}
