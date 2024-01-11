package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FunctionalFlowOrangeHRM {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		WebElement uname=driver.findElement(By.xpath("//input[@name='username']"));  //10 sec
		WebElement pwd=driver.findElement(By.xpath("//input[@name='password']")); //10 sec
		WebElement lbutton=driver.findElement(By.xpath("//button"));
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions.visibilityOf(lbutton));
		wait.until(ExpectedConditions.elementToBeClickable(lbutton));

	

		
		
		
		
		uname.clear();
		pwd.clear();
		uname.sendKeys("Admin");
		pwd.sendKeys("admin123");
		lbutton.click();
		
	
		
		WebElement dashBoardtxt=driver.findElement(By.xpath("//h6"));
		
		String text=dashBoardtxt.getText();
		System.out.println(text);
		
		WebElement adminTab=driver.findElement(By.xpath("//span[text()='Admin']"));
		adminTab.click();
		
		System.out.println(driver.findElement(By.xpath("//div[text()='Anthony.Nolan']")).getText());
		
		
		
		driver.quit();
		
		

	}

}
