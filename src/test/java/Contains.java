import org.testng.annotations.Test;
public class Contains 
{
	@Test
	public void contains()
	{
		String fullname="JIvan Balasaheb Chikhale",middlename="Balasaheb";
		boolean status=fullname.contains(middlename);
		if(status==true)
		{
			System.out.println("middle name is present inside full name");
		}
		else
		{
			System.out.println("middle name is not present inside full name");
		}
	}
}
