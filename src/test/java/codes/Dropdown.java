package codes;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Dropdown
{
	@SuppressWarnings("deprecation")
	@Test
	public void test() throws Throwable
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://www.facebook.com");
		driver.findElement(By.linkText("Create New Account")).click();
		
		WebElement e=driver.findElement(By.id("day"));
		Select sl=new Select(e);
		sl.selectByIndex(1);
		
		sl.selectByValue("4");
		
		sl.selectByVisibleText("10");
		System.out.println("all done");
		
		driver.close();
	}
}
