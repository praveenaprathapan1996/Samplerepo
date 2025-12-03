package interfaceExample;

public class InterfaceChild implements InterfaceParent {
	String a;
    String b;
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		InterfaceChild  obj=new InterfaceChild ();
		obj.get();
		obj.display();
	}

	@Override
	public void get() 
	{
		// TODO Auto-generated method stub
		this. a="hello";
		this. b="Thank u";
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println(a+" "+b);
	}

}
