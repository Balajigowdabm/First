package introduction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestive_dropdowns 
{
	public static void main(String[] args) throws InterruptedException 
	{
	// TODO Auto-generated method stub
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Indium Software\\Desktop\\API Course\\New folder\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
    driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
    Thread.sleep(2000L);
    driver.findElement(By.id("autosuggest")).sendKeys("Ind");
    Thread.sleep(3000);
    List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
	for(WebElement option : options) 
	{
		if(option.getText().equalsIgnoreCase("India"))
		{
			option.click();
			break;
		}
	}
	
	}
	
}

