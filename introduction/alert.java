package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {
		public static void main(String[] args) throws InterruptedException
			{
			 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Indium Software\\Desktop\\API Course\\New folder\\chromedriver.exe");
				WebDriver driver= new ChromeDriver();
				driver.get("https://rahulshettyacademy.com/AutomationPractice/");
				driver.manage().window().maximize();
				Thread.sleep(3);
				driver.findElement(By.id("name")).sendKeys("Balaji");
				driver.findElement(By.id("alertbtn")).click();
				System.out.println(driver.switchTo().alert().getText());
				driver.switchTo().alert().accept();
				driver.findElement(By.id("confirmbtn")).click();
				System.out.println(driver.switchTo().alert().getText());
				driver.switchTo().alert().dismiss();
				driver.close();
			}
		
}