package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import graphql.Assert;

public class CheckBoxLearn {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		
		
		boolean b=driver.findElement(By.xpath("(//input)[1]")).isSelected();
		if(!b)
		{
		driver.findElement(By.xpath("(//input)[1]")).click();
		}
		b=driver.findElement(By.xpath("(//input)[2]")).isSelected();
		
		if(!b)
		{
		driver.findElement(By.xpath("(//input)[2]")).click();
		}
		
		
		
		
		Thread.sleep(3000);
		
		driver.quit();
		
		
		
		
		
		

	}

}
