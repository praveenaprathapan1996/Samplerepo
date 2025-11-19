package inheritance;

public class HeirarchicalChild2 extends HeirarchicalParent
{
public void display2()
{
	System.out.println("here is the child 2");
}
public static void main(String args[])
{
	HeirarchicalChild2 obj1=new HeirarchicalChild2();
	obj1.display();
	obj1.display2();
}
}
