package tenerity;

import org.testng.annotations.Test;

public class DoSomething 
{
	@Test
	public void numbergame()
	{
		int num=1234,nextnum=0;
		for(int i=num;i>=0;i--)
		{
			nextnum=num%100;
			System.out.println(nextnum);
		}
	}

}
