
public class Student extends Grades
{
	String name1;
	int age1;

	Student(String name,int age)
	{
		name1=name;
		age1=age;

	}
	public void display()
	{
		System.out.println("Name is "+name1);
		System.out.println("Age is "+age1);
	}
	public static void main(String[] args) 
	{
		Student s=new Student("jivan",31);
		s.get();
		s.display();
		s.displayA();
	}

}
