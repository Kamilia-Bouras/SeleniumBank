import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OpenNewAccount {
	
		public static void main(String[] args) throws InterruptedException {  
	        
		    WebDriver driver= new ChromeDriver();  
		    driver.get("https://parabank.parasoft.com/parabank/index.htm");
		    driver.manage().window().maximize(); 
		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		    Thread.sleep(1000);
   
		    // authentification
		    wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div:nth-child(1) div:nth-child(2) form:nth-child(1) div.login:nth-child(2) > input.input"))).sendKeys("john");        
		    Thread.sleep(1000);
		    wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div:nth-child(1) div:nth-child(2) form:nth-child(1) div.login:nth-child(4) > input.input"))).sendKeys("demo");        
		    wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div:nth-child(1) div:nth-child(2) form:nth-child(1) div.login:nth-child(5) > input.button"))).click(); 
		    
		    
		    // Open new Account
		    wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div:nth-child(3) div:nth-child(1) ul:nth-child(3) li:nth-child(1) > a:nth-child(1)"))).click(); 
		    
		    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='type']"))).click(); 
		    Thread.sleep(1000);
		    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//option[contains(text(),'CHECKING')]"))).click(); 
		    Thread.sleep(1000);
		    
		    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//option[contains(text(),'12567')]"))).click(); 
		    wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div:nth-child(1) div:nth-child(1) form:nth-child(2) div:nth-child(9) > input.button"))).click(); 
		    Thread.sleep(1000);


		    driver.quit();

	  
	}  


}





