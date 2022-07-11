package codes;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
public class ScrollUpDown 
{
	@SuppressWarnings("unused")
	@Test
	public void scrollDown() throws Throwable
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		/*
		driver.manage().window().maximize();
		driver.navigate().to("https://www.scientecheasy.com/2019/11/javascriptexecutor-in-selenium-webdriver.html");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(100,700)", "");
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(-100,-700)", "");
		Thread.sleep(5000);
		driver.quit();
		*/
	}
}