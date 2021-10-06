
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Webtabe {

		public static void main(String[] args) {
	        // declaration and instantiation of objects/variables
	    	//System.setProperty("webdriver.chrome.driver","C:\\Users\\sheldonc\\Downloads\\chromedriver_win32\\chromedriver.exe");
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sheldon\\Automation\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
	        
	    List<WebElement> rowcell=    driver.findElements(By.xpath("//*[text()='Burj Khalifa']/parent::tr/parent::tbody/tr"));
	    System.out.println(rowcell.size());
	    int row= rowcell.size();
	    
	    List<WebElement> collcell=    driver.findElements(By.xpath("//*[text()='Burj Khalifa']/parent::tr/parent::tbody/tr[1]/td"));
	    System.out.println(collcell.size());
	    int coll= collcell.size();
	    
	    for(int i=1; i<=row;i++){
	    	for(int j=1; j<=coll;j++){
		    	
		    System.out.print(driver.findElement(By.xpath("//*[text()='Burj Khalifa']/parent::tr/parent::tbody/tr["+i+"]/td["+j+"]")).getText());	
		    //driver.findElement(By.xpath("//*[text()='Burj Khalifa']/parent::tr/parent::tbody/tr["+i+"]/td["+j+"]")).getText();  
		    }
	    	System.out.println();

//hello
	    }
	    
	    
}
}