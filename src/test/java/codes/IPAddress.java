package codes;
import org.testng.annotations.Test;
public class IPAddress 
{
	@Test
	public void test()
	{
		String ipaddress="192.168.1.0";
		String str[]=ipaddress.split("[^0-9]");
		for(String s:str)
		{
			System.out.println(s);
		}
	}
}
