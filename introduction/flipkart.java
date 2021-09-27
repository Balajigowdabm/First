package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class flipkart 
{

	public static void main(String[] args) throws InterruptedException 
	{
		String baseURL= "https://www.google.com";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Indium Software\\Desktop\\API Course\\New folder\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get(baseURL);
		driver.manage().window().maximize();
		Thread.sleep(3);
		WebElement google= driver.findElement(By.cssSelector("input[class='gNO89b']"));
		Actions builder= new Actions(driver);
		Action mouseover= builder.moveToElement(google).click().build();
		mouseover.perform();
	}

}
