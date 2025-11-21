package superkeyword;

public class SuperConstructorChild extends SuperConstructorParent
{
public SuperConstructorChild()
{
	super(3,2);
	System.out.println("hello world");
}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		SuperConstructorChild obj=new SuperConstructorChild();
	}

}
