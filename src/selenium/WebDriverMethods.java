package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverMethods {

	public static void main(String[] args) {


		WebDriver driver=new FirefoxDriver();
		driver.get("https://the-internet.herokuapp.com/tables");
		driver.manage().window().maximize();
		
		String title=driver.getTitle();
		System.out.println(title);
		if(title.contains("The"))
		{
			System.out.println("we are on the correct page");
		}
		else
		{
			System.out.println("Navigated to incorrect page");
		}
		
		driver.quit();
		
		

	}

}
