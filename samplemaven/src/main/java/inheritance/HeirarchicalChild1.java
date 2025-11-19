package inheritance;

public class HeirarchicalChild1 extends HeirarchicalParent
{
public void display1()

{
	System.out.println("here is the child 1");
}
public static void main(String args[])
{
	HeirarchicalChild1 obj=new HeirarchicalChild1();
	obj.display();
	obj.display1();
}
}
