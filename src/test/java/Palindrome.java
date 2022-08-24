import org.testng.annotations.Test;
public class Palindrome 
{
	@Test
	public void StringPalindrome()
	{
		String input="aba",rev="";
		for(int i=input.length()-1;i>=0;i--)
		{
			rev=rev+input.charAt(i);
		}
		System.out.println(rev);
		if(input.equals(rev))
		{
			System.out.println("String is a palindrome");
		}
		else
		{
			System.out.println("String is not a palindrome");
		}
	}
}
