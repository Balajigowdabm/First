package introduction;

import static org.junit.Assert.assertFalse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assertion {
public static void main(String[] args)
	{
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Indium Software\\Desktop\\API Course\\New folder\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	    driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	    Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
	    driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
	    driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
	    driver.findElement(By.cssSelector("input[id*='IndArm']")).click();
	    driver.findElement(By.cssSelector("input[id*='StudentDiscount']")).click();
	    driver.findElement(By.cssSelector("input[id*='Unmr']")).click();
	    Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='Unmr']")).isSelected());
	    Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "1 Child");
	}
}
