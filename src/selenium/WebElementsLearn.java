package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElementsLearn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		
		int size=driver.findElements(By.xpath("//a")).size();
		System.out.println(size);
		
		
		List<WebElement> links=driver.findElements(By.xpath("//a"));
		
		
		for(WebElement ele:links)
		{
			System.out.println(ele.getText());
		}
		

		driver.quit();
	}

}
