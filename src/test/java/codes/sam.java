package codes;

import org.testng.annotations.Test;

public class sam 
{
	@Test
	public void doit()
	{
		String input="Hello World Hello";
		char arr[]=input.toCharArray();
		for(int i=0;i<=arr.length-1;i++)
		{
			//System.out.print(arr[i]);
			for(int j=i+1;j<=arr.length-1;j++)
			{
				System.out.print(arr[j]);
			if(arr[i]==arr[j])
			{
			 //System.out.println(arr[i]);
			}
			
			}
			System.out.println();
		}
		
	}

}
