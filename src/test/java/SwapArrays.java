import java.util.Arrays;
public class SwapArrays 
{
	public static void main(String[] args) throws Exception
	{
		int [] a = {5,9};
		int [] b = {4,3};
		System.out.println("a[] before swapping : "+Arrays.toString(a));
		System.out.println("b[] before swapping : "+Arrays.toString(b));
		for(int i = 0 ; i<a.length;i++)
		{
			a[i] = a[i] - b[i];
			b[i] = a[i] + b[i];
			a[i] = GetAbsoluteValue(a[i] - b[i]);
		}
		System.out.println("a[] after swapping : "+Arrays.toString(a));
		System.out.println("b[] after swapping : "+Arrays.toString(b));
	}
	public static int GetAbsoluteValue (int a)
	{
		return Math.abs(a);
	}
}