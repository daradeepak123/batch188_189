package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class SpiceJet {

	public static void main(String[] args) {
		
		ChromeOptions options =new ChromeOptions();
		options.addArguments("disable-notifications");
		options.addArguments("disable-media-stream");
		options.addArguments("disable-geolocations");
		String month="April";
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.spicejet.com/");
		
		driver.findElement(By.xpath("//div[text()='Departure Date']/following-sibling::div")).click();

		String curretnDate=driver.findElement(By.xpath("(//div[text()='Mon'])[1]/../../../div[1]/div")).getText();
		System.out.println(curretnDate);
		
		driver.findElement(By.xpath("//div[text()='April ']/../..//div[text()='1']")).click();
		
	}

}
