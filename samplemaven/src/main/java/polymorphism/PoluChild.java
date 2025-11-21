package polymorphism;

public class PoluChild extends PolyParent

{
	public void print(int a,int b)
	{
		System.out.println(a-b);
		super.print(7, 3);
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		PoluChild  obj=new PoluChild();
		obj.print(5, 2);
		
	}

}

