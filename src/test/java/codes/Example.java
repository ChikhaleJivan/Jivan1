package codes;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class Example 
{
	@BeforeMethod
	public void BeforeMethod()
	{
		System.out.println("Before method executed");
	}
	@Test
	public void test1()
	{
		System.out.println("Inside of test 1");
	}
	@Test
	public void test2()
	{
		System.out.println("Inside of test 2");
	}
	@Test
	public void test3()
	{
		System.out.println("Inside of test 3");
	}
	@Test
	public void test4()
	{
		System.out.println("Inside of test 4");
	}
	@Test
	public void test5()
	{
		System.out.println("Inside of test 5");
	}
}
