import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Naukari 
{
	@SuppressWarnings("deprecation")
	@Test
	public void NaukariActions() throws Throwable
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[text()='Login']")).click();
		//driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']")).sendKeys("");
		//driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("");
		String base=driver.getWindowHandle();
		driver.findElement(By.xpath("//span[text()='Sign in with Google']")).click();
		Set <String> two=driver.getWindowHandles();
		for(String window: two)
		{
			driver.switchTo().window(window);
			if(driver.getTitle()=="Sign in – Google accounts")
			{
				driver.findElement(By.xpath("//input[@type='email']")).sendKeys("chikhalejivan18");
				driver.findElement(By.xpath("//span[text()='Next']")).click();				
			}
			
		}
		
		
	}
}
