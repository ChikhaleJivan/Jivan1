package codes;
import static org.testng.Assert.assertTrue;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class Param
{
	@Test
	@Parameters("myName")
	public void method(String myName)
	{
		//System.out.println(myName);
		//int i=myName.length();
		//System.out.println(i);
		//String s=null;
		//int L=s.length();
		//System.out.println(s);
		//System.out.println(L);		
		if(myName.equals("Jivan"))
		{
			System.out.println("My name is Jivan is true");
		}
		else if(myName.isEmpty())
		{
			System.out.println("Empty");
		}
		else
		{
			assertTrue(false,"not matching");
		}
	}
}
