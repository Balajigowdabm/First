package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class updatedropdown_with_while_and_forloop 
{
	public static void main(String[] args) throws InterruptedException 
		{
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Indium Software\\Desktop\\API Course\\New folder\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
Thread.sleep(2000L);
    driver.findElement(By.id("divpaxinfo")).click();
	System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	Thread.sleep(2000L);
			for(int i=1;i<5;i++)
			{
			driver.findElement(By.id("hrefIncAdt")).click();
			}
			
			driver.findElement(By.id("btnclosepaxoption")).click();
			System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
			driver.close();
		}
}
