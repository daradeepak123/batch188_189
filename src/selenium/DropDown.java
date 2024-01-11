package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("https://the-internet.herokuapp.com/dropdown");
		driver.manage().window().maximize();
		
		WebElement dw=driver.findElement(By.xpath("//select[@id='dropdown']"));
		
		Select sel=new Select(dw);
		
		sel.selectByIndex(2);
		Thread.sleep(3000);
		sel.selectByVisibleText("Option 1");
		
		
		
		
		//select[@id='dropdown']
		
		

	}

}
