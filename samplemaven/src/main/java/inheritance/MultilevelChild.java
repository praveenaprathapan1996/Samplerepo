package inheritance;

public class MultilevelChild extends MultilevelParent
{
public void print2()
{
	System.out.println("i am the child");
}

public static void main(String args[])
{
	MultilevelChild obj= new MultilevelChild();
	obj.print();
	obj.print1();
	obj.print2();
}}