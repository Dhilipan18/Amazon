package gruz.org;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javasscript {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Welcome\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
driver.get("https://www.google.com/search?q=letcode.in%2Fframe&rlz=1C1SQJL_enIN945IN945&oq=letcode&aqs=chrome.1.69i57j0i20i263i512j0i10i131i433i512l4j0i10i433i512j5.9599j0j4&sourceid=chrome&ie=UTF-8");
driver.manage().window().maximize();
driver.findElement(By.xpath("//h3[text()='Frame - LetCode with Koushik']")).click();
driver.switchTo().frame(0);
Thread.sleep(1000);
WebElement usename = driver.findElement(By.name("fname"));
usename.sendKeys("kauuegf");
WebElement passwrd = driver.findElement(By.name("lname"));
passwrd.sendKeys("oube");
WebElement email = driver.findElement(By.xpath("//iframe[@src='innerFrame']"));
driver.switchTo().frame(email);
WebElement f2 = driver.findElement(By.name("email"));
f2.sendKeys("ukgc");
driver.switchTo().defaultContent();
driver.switchTo().frame(0);
WebElement f7 = driver.findElement(By.name("fname"));
f7.clear();
f7.sendKeys("jkgqdw");

}
}
