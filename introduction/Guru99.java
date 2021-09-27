package introduction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru99 
{

	public static void main(String[] args) 
	{
		String baseUrl = "http://demo.guru99.com/test/newtours/";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Indium Software\\Desktop\\API Course\\New folder\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)");
		System.out.println(driver.findElement(By.xpath("//table/tbody/tr/td[2]"
				+ "/table/tbody/tr[4]/td/"
				+ "table/tbody/tr/td[2]/"
				+ "table/tbody/tr[2]/td[1]/"
				+ "table[2]/tbody/tr[3]/td[2]/font")).getText());
		System.out.println(driver.findElement(By.xpath("//table[@width='270']/tbody/tr[4]/td/font")).getText());
	}

}
