import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class driver 
{
	@Test
	public void driverr() throws Throwable
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/watch?v=UZrzOZaI7UE&list=RDMMfMKCkyHuHI4&index=6");
		Thread.sleep(5000);
		driver.close();
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/watch?v=UZrzOZaI7UE&list=RDMMfMKCkyHuHI4&index=6");
		Thread.sleep(5000);
		driver.close();
	}
}
