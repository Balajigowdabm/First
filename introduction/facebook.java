package introduction;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class facebook {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Indium Software\\Desktop\\API Course\\New folder\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
driver.get("http://facebook.com");
driver.manage().window().maximize();
JavascriptExecutor jse = (JavascriptExecutor)driver;
jse.executeScript("window.scrollBy(0,250)");
driver.findElement(By.cssSelector("a[title='English (UK)']")).click();
driver.findElement(By.xpath("//input[contains(@id,'email')]")).sendKeys("balajimgowda17@gmail.com");
driver.findElement(By.xpath("//input[contains(@id,'pass')]")).sendKeys("Balaji1990");
driver.findElement(By.xpath("//button[@name='login']")).click();
//driver.findElement(By.cssSelector("a[title='English (UK)']")).click();
Thread.sleep(2);
driver.switchTo().alert().dismiss();
//driver.navigate().back();
//driver.navigate().forward();
//driver.navigate().refresh();
	}
	}