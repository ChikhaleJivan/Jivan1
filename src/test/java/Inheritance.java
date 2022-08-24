
public class Inheritance implements abc,def
{
	@Override
	public void display() 
	{
		System.err.println("display method from class abc ");
	}
	public static void main(String args)
	{
		Inheritance i=new Inheritance();
		i.display();
		
	}
}