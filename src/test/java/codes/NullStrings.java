package codes;

import org.testng.annotations.Test;

public class NullStrings 
{
	@SuppressWarnings({ "unused", "null" })
	@Test
	public void perform()
	{
		String str1=null,str2=null;
		boolean str3=str1.equals(str2);
	}
}
