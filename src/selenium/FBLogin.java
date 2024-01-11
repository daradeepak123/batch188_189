package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FBLogin {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		String url="https://fb.com";
		driver.get(url);
		driver.findElement(By.id("email")).sendKeys("uname");
		driver.findElement(By.id("pass")).sendKeys("pwd");
		driver.findElement(By.tagName("button")).click();

	}

}
