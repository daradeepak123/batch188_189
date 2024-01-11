package winHanfle;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleMulWindow {

	public static void main(String[] args) {
	
		
		
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		
		List<WebElement> links=driver.findElements(By.xpath("//a"));
		String clicklnk = Keys.chord(Keys.CONTROL,Keys.ENTER);
		String parentWindow=driver.getWindowHandle();
		for(WebElement ele:links)
		{
			//ele.sendKeys(clicklnk);
			
			ele.sendKeys(clicklnk);
			
			
		}
		
		
		Set<String> s=driver.getWindowHandles();
		
		for(String ss:s)
		{
			if(!ss.equals(parentWindow))
			{
			driver.switchTo().window(ss);
			System.out.println(driver.getCurrentUrl());
			}
		}
		
		
		
		
		

	}

}
