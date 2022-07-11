package codes;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Numberofrows 
{
	@Test
	public void table() throws Throwable
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		int rows=driver.findElements(By.xpath("(html/body/div/div//table)[1]//tr")).size();
		System.out.println("Number of rows is "+rows);
		Thread.sleep(5000);
		driver.close();
	}
}
