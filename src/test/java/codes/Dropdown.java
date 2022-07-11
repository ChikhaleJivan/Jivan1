package codes;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Dropdown
{
	@Test
	public void test() throws Throwable
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(5000);
		WebElement e=driver.findElement(By.id("day"));
		Select sl=new Select(e);
		sl.selectByIndex(1);
		Thread.sleep(2000);
		sl.selectByValue("4");
		Thread.sleep(2000);
		sl.selectByVisibleText("10");
		Thread.sleep(2000);
		driver.close();
	}
}
