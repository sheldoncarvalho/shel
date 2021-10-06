

import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Appium {
	public static void main(String[] args) {
        // declaration and instantiation of objects/variables
    	//System.setProperty("webdriver.chrome.driver","C:\\Users\\sheldonc\\Downloads\\chromedriver_win32\\chromedriver.exe");
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\Sheldon\\Automation\\chromedriver.exe");
    
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
//        driver.findElement(By.xpath("//td[contains(text(),'Francisco Chang')]/preceding-sibling::td/input")).click();
//        //driver.findElement(By.xpath("//input[@id='usernamereg-firstName']")).sendKeys("Your-Name");
//	boolean y =driver.findElement(By.xpath("//td[contains(text(),'Francisco Chang')]/preceding-sibling::td/input")).isSelected();
//	System.out.println(y + "");
        
//       String actual = driver.findElement(By.xpath("//div[text()='Already have an account? ']")).getText();
//       System.out.println(actual);
//       String Expected = "Already have an account? Sign in.";
//       Assert.assertEquals(Expected, actual);
//        System.out.println("success");
        
//        Actions act = new Actions(driver);
//        act.moveToElement(driver.findElement(By.xpath("//td[contains(text(),'Francisco Chang')]/preceding-sibling::td/input"))).build().perform();
        
        Set<String> s= driver.getWindowHandles();
        int r= s.size();
        System.out.println(s);
        System.out.println(r);
//        
//        Select sel = new Select(driver.findElement(By.xpath("")));
//        //sel.sel
//        
//        String s1 = "";
//	
//        StringBuffer sb = new StringBuffer("ab");
//        //sb.append("c");
//        sb.insert(1, "c");
//        System.out.println(sb);
//        
//        WebDriverWait wa = new WebDriverWait(driver, 20);
//       // wa.until(ExpectedConditions.
//        
//        Alert a = driver.switchTo().alert();
//        a.
        
      /*WebElement wb= driver.findElement(By.xpath("//label[contains(text(),'First Name ')]/following-sibling::input[1]"));
//       wb.sendKeys(Keys.SHIFT,"hello");
//       //wb.sendKeys("hello");
        
        Actions act = new Actions(driver);
        act.keyDown(Keys.CONTROL).sendKeys(Keys.END).build().perform();
        
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,100)");
        
        Scanner sc= new Scanner(System.in);
        int y = sc.nextInt();*/
        
	}
}