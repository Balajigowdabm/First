package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseActions 
{

	public static void main(String[] args) 
	{
		String baseURL= "https://www.facebook.com/";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Indium Software\\Desktop\\API Course\\New folder\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get(baseURL);
		driver.manage().window().maximize();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)");
		driver.findElement(By.partialLinkText("English")).click();
		WebElement email= driver.findElement(By.id("email"));
		Actions builder= new Actions(driver);
		Action multiple = builder.moveToElement(email).click()
				.keyDown(email, Keys.SHIFT)
				.sendKeys(email, "hello")
				.doubleClick(email)
				.contextClick(email)
				.build();
		multiple.perform();
		driver.navigate().refresh();
		driver.close();
	}

}
