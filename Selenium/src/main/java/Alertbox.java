

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class Alertbox {
	
	@Test
	public void alert() throws InterruptedException {
	
	//public static void main(String[] args) throws InterruptedException {
        // declaration and instantiation of objects/variables
    	//System.setProperty("webdriver.chrome.driver","C:\\Users\\sheldonc\\Downloads\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sheldon\\Automation\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("http://demo.automationtesting.in/Alerts.html");
        
       // driver.findElement(By.xpath("//*[text()='Alert with OK ']")).click();
        driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
        //driver.findElement(By.xpath("//button[@onclick='alertbox()']")).click();
        driver.findElement(By.xpath("//button[@onclick='promptbox()']")).click();
        
        Alert a = driver.switchTo().alert();
        Thread.sleep(5000);
        a.sendKeys("hel");
        a.accept();
        Thread.sleep(2000);
        System.out.println("success");
        
      
}
}