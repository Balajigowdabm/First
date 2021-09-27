package introduction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction_Amazon 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Indium Software\\Desktop\\API Course\\New folder\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.amazon.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Actions a= new Actions(driver);
		WebElement search= driver.findElement(By.id("twotabsearchtextbox"));
		WebElement cart= driver.findElement(By.xpath("//a[@id='nav-cart']"));
		a.click(search).keyDown(Keys.SHIFT).sendKeys("123").contextClick(cart).build().perform();
	}

}
