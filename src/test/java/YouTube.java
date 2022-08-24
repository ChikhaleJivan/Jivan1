import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
public class YouTube 
{
	@Test
	public void YouTubeVideo() throws Throwable
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/?gl=IN&tab=r1");
		driver.findElement(By.xpath("(//img[@id='img'])[13]")).click();
		driver.findElement(By.xpath("//button[@class='ytp-fullscreen-button ytp-button']")).click();
		Thread.sleep(30000);
		driver.close();
	}
}
