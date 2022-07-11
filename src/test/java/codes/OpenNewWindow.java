package codes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenNewWindow
{
	@Test
	public void openwindow() throws Throwable
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Thread.sleep(5000);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.facebook.com");
		//Set<String> windows=driver.getWindowHandles();
		//for(String s:windows)
		//{
		//	driver.switchTo().window(s);
		//	Thread.sleep(5000);
		//}
		Thread.sleep(5000);
		driver.quit();
		
	}
}
