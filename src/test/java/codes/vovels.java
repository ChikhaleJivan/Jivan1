package codes;
import org.testng.annotations.Test;
public class vovels 
{
	@Test
	public void vovelss()
	{
		String name="Jivan Balasaheb Chikhale";
		int count=0;
		int len=name.length();
		System.out.println("Length is "+len);
		for(int i=0;i<=len-1;i++)
		{
			if(name.charAt(i)=='A'||name.charAt(i)=='a'||name.charAt(i)=='E'||name.charAt(i)=='e'||name.charAt(i)=='I'||name.charAt(i)=='i'||name.charAt(i)=='O'||name.charAt(i)=='o'||name.charAt(i)=='U'||name.charAt(i)=='u')
			{
				count++;
			}
		}
		System.out.println("Numbers of vovel present in given string are "+count);
	}
}
