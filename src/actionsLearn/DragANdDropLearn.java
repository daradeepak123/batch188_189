package actionsLearn;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragANdDropLearn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://the-internet.herokuapp.com/drag_and_drop");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement drag=driver.findElement(By.xpath("//div[@id='column-a']"));
		WebElement drop=driver.findElement(By.xpath("//div[@id='column-b']"));
		
		
		Actions sct=new Actions(driver);
		sct.dragAndDrop(drop, drag).build().perform();
		
		sct.contextClick(drag).click().perform();
		
		
		
		

	}

}
