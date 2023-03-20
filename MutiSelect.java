package gruz.org;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MutiSelect {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Welcome\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe" );
    WebDriver driver= new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.snapdeal.com/");
    JavascriptExecutor js= (JavascriptExecutor)driver;
    WebElement click = driver.findElement(By.id("pushDenied"));
    js.executeScript("arguments[0].click()", click);
    driver.findElement(By.id("inputValEnter")).sendKeys("watch",Keys.ENTER);
   driver.findElement(By.xpath("(//img[@class='product-image '])[4]")).click();
   Set<String> wh = driver.getWindowHandles();
  System.out.println(wh);
    for (String a : wh) {
		driver.switchTo().window(a);
	}
    WebElement cart = driver.findElement(By.xpath("//span[text()='add to cart']"));
js.executeScript("arguments[0].click()", cart);
driver.findElement(By.xpath("//div[text()='View Cart']")).click();

}

}
