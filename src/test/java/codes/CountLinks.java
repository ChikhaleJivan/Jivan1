package codes;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
public class CountLinks
{
	@Test
	public void data() throws Throwable
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makeinjava.com");
		int numberOfLinks = driver.findElements(By.tagName("a")).size();
		// count no of links on page
		System.out.println("Number of links on Web Page :" +numberOfLinks );
		Thread.sleep(10000);
		driver.close();
	}
}