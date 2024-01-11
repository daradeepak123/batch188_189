package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstScriptSelenium {

	public static void main(String[] args) {
	
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		
		
		driver.get("https://www.selenium.dev/downloads/");
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());

		System.out.println(driver.getPageSource());
		
		driver.quit();
		
		

	}

}
