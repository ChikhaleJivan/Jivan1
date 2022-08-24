package com.hcl.interview;
import org.testng.annotations.Test;
public class SecondSmallestFromArray 
{
	@Test
	public void test()
	{
		int arr[]= {1,2,49,4,7,3,6},temp;
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=i+1;j<=arr.length-1;j++)
			{
				if(arr[i]>=arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int e:arr)
		{
			System.out.println(e);
		}
		if(arr[0]<=arr[1])
		{
			System.out.println("Second largest element from array is "+arr[1]);
		}
	}
}
