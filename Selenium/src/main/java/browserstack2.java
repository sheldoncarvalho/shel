import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import junit.framework.Assert;



public class browserstack2 {

public static void main(String[] args) throws  InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sheldon\\Automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.browserstack.com/automate/capabilities");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='accept-cookie-notification']")).click();
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//a[@id='doc-device-trigger']")));
		
		driver.findElement(By.xpath("//a[@id='doc-os-trigger']")).click();
		driver.findElement(By.xpath("//span[text()='Android']")).click();
		
		driver.findElement(By.xpath("//a[@id='doc-device-trigger']")).click();
		driver.findElement(By.xpath("//span[text()='Pixel 4']")).click();
		Thread.sleep(2000);
		String actuals =driver.findElement(By.xpath("//span[text()='\"Google Pixel 4\"']")).getText();
		Thread.sleep(5000);
		System.out.println(actuals);
		String Expected = "Google Pixel 4";
		Thread.sleep(5000);
		//Assert.assertEquals(Expected, actuals);
		
		System.out.println("succes");
		//driver.close();
		
}
}
