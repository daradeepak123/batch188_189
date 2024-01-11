package alertsHandle;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AcceptAlert {

	public static void main(String[] args) throws InterruptedException {
	
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("(//button)[1]")).click();
		Thread.sleep(3000);
		
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("(//button)[2]")).click();
		
		
		
		Thread.sleep(3000);
		
		driver.switchTo().alert().dismiss();
		Thread.sleep(3000);
		

		driver.findElement(By.xpath("(//button)[3]")).click();
		
		driver.switchTo().alert().sendKeys("demo info");
		

		
		driver.switchTo().alert().accept();
		
		Thread.sleep(3000);
		driver.quit();
		
		
		
		
		
		

	}

}
