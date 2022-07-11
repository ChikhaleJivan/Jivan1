package codes;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
public class ifrem
{
	@Test
	public void openwindow() throws Throwable
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://courses.letskodeit.com/practice");
		driver.switchTo().frame("iframe-name");
		System.out.println("happened");
		WebElement e =driver.findElement(By.className("col-lg-4 col-md-4 col-sm-6 col-xs-12"));
		driver.switchTo().frame(e);
		System.out.println("heppened again");
	}
}
