import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class TransferFunds {
	public static void main(String[] args) throws InterruptedException {  
        
	    WebDriver driver= new ChromeDriver();  
	    driver.get("https://parabank.parasoft.com/parabank/index.htm");
	    driver.manage().window().maximize(); 
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    Thread.sleep(1000);

	    // Authentification
	    wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div:nth-child(1) div:nth-child(2) form:nth-child(1) div.login:nth-child(2) > input.input"))).sendKeys("john");        
	    wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div:nth-child(1) div:nth-child(2) form:nth-child(1) div.login:nth-child(4) > input.input"))).sendKeys("demo");        
	    wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div:nth-child(1) div:nth-child(2) form:nth-child(1) div.login:nth-child(5) > input.button"))).click(); 
	    Thread.sleep(1000);

	    
	    // Funds Transfer
	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Transfer Funds')]"))).click(); 
	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='amount']"))).sendKeys("2000"); 
	    wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div:nth-child(1) form:nth-child(4) div:nth-child(2) select.input:nth-child(1) > option:nth-child(2)"))).click();        
	    wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div:nth-child(1) form:nth-child(4) div:nth-child(2) select.input:nth-child(2) > option:nth-child(3)"))).click();        
	    wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div:nth-child(1) div:nth-child(1) form:nth-child(4) div:nth-child(4) > input.button"))).click(); 
	    
	    Thread.sleep(2000);	    
	    driver.quit();

  
}  


}
