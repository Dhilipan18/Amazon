package gruz.org;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Welcome\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	JavascriptExecutor js = (JavascriptExecutor)driver;
	WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
	js.executeScript("arguments[0].setAttribute('value','Iphone')", search);
    WebElement click = driver.findElement(By.id("nav-search-submit-button"));
	js.executeScript("arguments[0].click()", click);
	//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	WebElement drp = driver.findElement(By.xpath("//span[text()='CEX Apple iPhone 5S (Space Grey, 16GB)']"));
	js.executeScript("arguments[0].scrollIntoView(true)", drp);
	WebElement drpclick = driver.findElement(By.xpath("//span[text()='CEX Apple iPhone 5S (Space Grey, 16GB)']"));
js.executeScript("arguments[0].click()", drpclick);
Set<String> a1 = driver.getWindowHandles();
System.out.println("child"+a1);
for (String a : a1) {
driver.switchTo().window(a);
}
WebElement a = driver.findElement(By.id("add-to-cart-button"));
a.click();
TakesScreenshot tk= (TakesScreenshot)driver;
File st = tk.getScreenshotAs(OutputType.FILE);
System.out.println(st);
File dest= new File("C:\\Users\\Welcome\\Pictures\\Saved Pictures\\amazon.png"); 
//FileUtils.copyFile(st, dest);
}
}
