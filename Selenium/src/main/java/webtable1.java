import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class webtable1 {

	@Test
	public void webtable() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sheldon\\Automation\\chromedriver.exe");

    	WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //driver.get("http://demo.automationtesting.in/Frames.html");
        driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
        
        List<WebElement> Rownumber= driver.findElements(By.xpath("//th[text()='Burj Khalifa']/parent::tr/parent::tbody/tr"));
        
        System.out.println(Rownumber.size());
        int rowcount= Rownumber.size();
        
        List<WebElement> columnnumber= driver.findElements(By.xpath("//th[text()='Burj Khalifa']/parent::tr/parent::tbody/tr[1]/td"));
        System.out.println(columnnumber.size());
        int columcount= columnnumber.size();
        
        for(int i=1;i<=rowcount;i++) {
        	
        	for(int j=1; j<=columcount ;j++) {
        		String Result= driver.findElement(By.xpath("//th[text()='Burj Khalifa']/parent::tr/parent::tbody/tr["+i+"]/td["+j+"]")).getText();
        		System.out.print(Result );
        	}
        	System.out.println();
        }
        
        
        
        
        
        
        
	}
}
