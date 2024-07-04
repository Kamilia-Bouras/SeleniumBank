import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PayBill {
	
	
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
	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Bill Pay')]"))).click(); 
	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//tbody/tr[1]/td[2]/input[1]"))).sendKeys("Kamilia Bouras"); 
	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//tbody/tr[2]/td[2]/input[1]"))).sendKeys("3000 bld des Recollets"); 
	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//tbody/tr[3]/td[2]/input[1]"))).sendKeys("Trois Rivieres"); 
	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//tbody/tr[4]/td[2]/input[1]"))).sendKeys("Quebec"); 
	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//tbody/tr[5]/td[2]/input[1]"))).sendKeys("G0X 3J9"); 
	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[2]/div[1]/div[1]/form[1]/table[1]/tbody[1]/tr[6]/td[2]/input[1]"))).sendKeys("8195679876"); 

	    wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("table.form2 tbody:nth-child(1) tr:nth-child(8) td:nth-child(2) > input.input"))).sendKeys("12367"); 
	    wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("table.form2 tbody:nth-child(1) tr:nth-child(9) td:nth-child(2) > input.input"))).sendKeys("12367"); 
	    wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("table.form2 tbody:nth-child(1) tr:nth-child(11) td:nth-child(2) > input.input"))).sendKeys("475"); 
	    Thread.sleep(3000);	    
	   
	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//tbody/tr[14]/td[2]/input[1]"))).click(); 

	    Thread.sleep(3000);	    
	    driver.quit();

  
}  


}



