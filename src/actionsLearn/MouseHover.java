package actionsLearn;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {

		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.browserstack.com/guide/wait-commands-in-selenium-webdriver");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Actions a=new Actions(driver);
		WebElement ele=driver.findElement(By.xpath("//button[@id='developers-dd-toggle']"));
		a.moveToElement(ele).build().perform();
		
		

	}

}
