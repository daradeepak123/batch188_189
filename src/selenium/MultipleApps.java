package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleApps {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		String urls[]=new String[5];
		urls[0]="https://www.selenium.dev/downloads/";
		urls[1]="https://www.google.com/";
		urls[2]="https://fb.com";
		urls[3]="https://www.eclipse.org/";
		urls[4]="https://www.selenium.dev/downloads/";
		
		for(String url:urls)
		{
			driver.get(url);
			System.out.println();
			
			System.out.println(driver.getCurrentUrl()+ "		"+ driver.getTitle());
		}
		
		driver.quit();
		


	}

}
