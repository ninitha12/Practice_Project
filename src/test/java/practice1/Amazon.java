package practice1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {
	public static void main(String[] args) throws InterruptedException {
		
	

	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.amazon.in/ref=nav_logo");
	Actions act = new Actions(driver);
	act.moveToElement(driver.findElement(By.xpath("//span[@class='icp-nav-flag icp-nav-flag-in icp-nav-flag-lop']"))).perform();
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@id='nav-flyout-icp']//span[contains(.,'MR')]/ancestor::span/i[@class='icp-radio']")).click();
	Thread.sleep(3000);
	driver.quit();
}
}