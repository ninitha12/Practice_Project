package practice1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DynamicWEbTable {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	String name="System";
	driver.get("https://testautomationpractice.blogspot.com/");
	Actions act = new Actions(driver);
	act.moveToElement(driver.findElement(By.id("apple"))).perform();
	Thread.sleep(3000);
	String cpu=driver.findElement(By.xpath("//tbody/tr/td[.='"+name+"']/following-sibling::td[contains(.,'%')]")).getText();
	System.out.println("the "+name+" percent is: "+cpu);
	Thread.sleep(3000);
	driver.quit();
	System.out.println("hi");

}
}
