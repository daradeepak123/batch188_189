package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TextBoxWorkOut {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://the-internet.herokuapp.com/forgot_password");
		driver.manage().window().maximize();
		
		WebElement txtBox=driver.findElement(By.xpath("//input[@type='text']"));
		

		Point loc=txtBox.getLocation();
		
		System.out.println("x cordinate -->"+ loc.x +"    "+"y cordinate -->"+ loc.y);
		
		
		
		Dimension size=txtBox.getSize();
		
		System.out.println("height  of webelement is -->"+ size.height +"    "+"width  of webelement is -->"+ size.width);
		
		
		txtBox.clear();
		
		txtBox.sendKeys("hello");
		
		boolean dis=driver.findElement(By.xpath("//button[@id='form_submit']")).isDisplayed();
		
		boolean ena=driver.findElement(By.xpath("//button[@id='form_submit']")).isEnabled();
		
		if(dis && ena)
		{
		driver.findElement(By.xpath("//button[@id='form_submit']")).click();
		}
		else
		{
			System.out.println("webElement is not found");
		}
		Thread.sleep(3000);
		
		String text=driver.findElement(By.xpath("//h1[text()='Internal Server Error']")).getText();
		
		System.out.println(text);
		
		driver.quit();
		
		
		
		
		

	}

}
