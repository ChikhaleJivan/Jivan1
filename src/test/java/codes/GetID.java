package codes;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
public class GetID 
{
	@Test
	public void getid() throws Throwable
	{
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://courses.letskodeit.com/practice");
	driver.findElement(By.id("hide-textbox")).click();
	String name=((JavascriptExecutor)driver).executeScript("return document.getElementById('displayed-text').placeholder").toString();
	System.out.println(name);
	Thread.sleep(5000);
	driver.quit();
	}
}
