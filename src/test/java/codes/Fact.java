package codes;
import org.testng.annotations.Test;
public class Fact 
{
	@Test
	public void Factorial()
	{
		int number=5,fact=1;
		for(int i=number;i>=1;i--)
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}
}
