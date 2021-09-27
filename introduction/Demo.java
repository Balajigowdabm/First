package introduction;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class Demo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Indium Software\\Desktop\\API Course\\New folder\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
driver.get("http://login.salesforce.com");
driver.findElement(By.id("username")).sendKeys("balajimgowda17@gmail.com");
driver.findElement(By.name("pw")).sendKeys("123456");
driver.findElement(By.cssSelector("#rememberUn")).click();
driver.findElement(By.xpath("//*[@id=\'Login\']")).click();
driver.findElement(By.linkText("Forgot Your Password?")).click();
}
	}
