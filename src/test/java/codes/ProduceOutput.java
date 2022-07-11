package codes;
import org.testng.annotations.Test;
public class ProduceOutput 
{
	@Test
	public void produceoutput()
	{
		String input="My name is Jivan";
		String[] output=input.split(" ");
		for(int i=output.length-1;i>=0;i--)
		{
			System.out.println(output[i]);
		}
	}
}
