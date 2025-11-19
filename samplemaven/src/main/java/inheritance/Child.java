package inheritance;

public class Child extends SingleParent
{
	public void print()
	{
		System.out.println("this is the child class");
	}
public static void main(String args[])

{

Child obj=new Child();
obj.print();
obj.display();
}
}