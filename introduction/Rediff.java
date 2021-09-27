package introduction;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class Rediff {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Indium Software\\Desktop\\API Course\\New folder\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
driver.get("http://rediff.com");
driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("balajimgowda17@gmail.com");
driver.findElement(By.xpath("//input[contains(@ name, 'passwd')]")).sendKeys("123456");
driver.findElement(By.cssSelector("input[name*='procee']")).click();
	}
}
