	import java.time.Duration;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;


public class BanckAuthentification {
		
		
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
		    driver.quit();
	  
	}  


}


