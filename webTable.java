package gruz.org;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class webTable {
	private static final Robot Robot = null;

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Welcome\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	driver.get("https://nxtgenaiacademy.com/alertandpopup/");
	driver.manage().window().maximize();
//	Thread.sleep(1000);
//		driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
//		Alert a1 = driver.switchTo().alert();
//		a1.accept();
//		driver.findElement(By.xpath("//button[text()='Confirm Alert Box']")).click();
//		Thread.sleep(1000);
//	Alert a2 = driver.switchTo().alert();
//	a2.dismiss();
//	driver.findElement(By.xpath("//button[text()='Prompt Alert Box']")).click();
//Alert a3 = driver.switchTo().alert();
//	a3.sendKeys("Dhilipan");
//	a2.accept();
	driver.navigate().to("https://www.google.com/");
	driver.switchTo().frame("callout");
	driver.findElement(By.xpath("//button[text()='No thanks']")).click();
	driver.switchTo().defaultContent();
	Actions acc= new Actions(driver);
	WebElement gmail = driver.findElement(By.xpath("//a[text()='Gmail']"));
	acc.contextClick(gmail).perform();
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_ENTER);
	
	}

}
