import org.testng.annotations.Test;
public class stringOperations
{
	@Test
	public void convert()
	{
		String str="Jivan123456Jivan";
		String str1[]=str.split("[^0-9]");
		for(String s:str1)
		{
			System.out.println("Final output is "+s);
		}
	}
}
