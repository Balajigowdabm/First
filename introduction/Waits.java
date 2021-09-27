package introduction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Indium Software\\Desktop\\API Course\\New folder\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);//implicit wait: apply globally across the application, and it will
		//affect each and every line of the code in the class
		WebDriverWait w= new WebDriverWait(driver, 5);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));//explicit wait: it will affect the particular line of code
		//cannot apply globally, 
		//new code written
		
	}

}
