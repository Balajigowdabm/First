package introduction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterpriseApp 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Indium Software\\Desktop\\API Course\\New folder\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://test.expenterprise.com/login.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("input[id='usernameInput']")).sendKeys("FIndiumASManager");
		driver.findElement(By.cssSelector("input[id='passwordInput']")).sendKeys("X25?wine89");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(15);
		driver.findElement(By.xpath("//*[@id=\"mxui_widget_NavigationTree_1\"]/div/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"mxui_widget_NavigationTree_1\"]/div/ul/li[2]/ul/li[2]/a")).click();
		driver.findElement(By.cssSelector("button[id='mxui_widget_Button_4']")).click();
		driver.findElement(By.cssSelector("td[aria-label='August 31, 2021']")).click();
	}

}
