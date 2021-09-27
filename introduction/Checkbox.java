package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox 
{
	public static void main(String[] args) throws InterruptedException 
	{
	// TODO Auto-generated method stub
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Indium Software\\Desktop\\API Course\\New folder\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
    driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
    driver.manage().window().maximize();
    Thread.sleep(2000L);
    System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
    driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
    System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
    System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
	driver.close();
	}
}