package codes;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
@SuppressWarnings("unused")
public class DealingWithHiddenElement
{
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Throwable
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://courses.letskodeit.com/practice");
		driver.findElement(By.id("hide-textbox")).click();
		JavascriptExecutor j = (JavascriptExecutor) driver;
		//identifying by id value using javascript executor and seting value to selenium
		Thread.sleep(5000);
		j.executeScript("document.getElementById('displayed-text').value='Selenium';");
		Thread.sleep(5000);
		String s = (String) j.executeScript("return document.getElementById('displayed-text').value");
		Thread.sleep(5000);
		System.out.print("Value entered in hidden field: "+s);
		Thread.sleep(5000);
		driver.close();
	}
}