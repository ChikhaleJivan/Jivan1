import java.util.Scanner;

public class Grades 
{
	double sub1marks,sub2marks,sub3marks;
	public void get()
	{
		System.out.println("Enter marks for 3 subjects");
		Scanner sc=new Scanner(System.in);
		sub1marks=sc.nextDouble();
		sub2marks=sc.nextDouble();
		sub3marks=sc.nextDouble();
	}
	public void displayA()
	{
		System.out.println("Marks for sub 1 are "+sub1marks);
		System.out.println("Marks for sub 2 are "+sub2marks);
		System.out.println("Marks for sub 3 are "+sub3marks);
	}

}
