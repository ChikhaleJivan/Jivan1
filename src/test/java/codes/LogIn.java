package codes;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
public class LogIn 
{
	@Test
	public void login() throws Throwable
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("example@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Password@123");
		driver.findElement(By.name("login")).click();
		Thread.sleep(10000);
		driver.close();
	}
}