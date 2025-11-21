package superkeyword;

public class SuperVariableChild extends SuperVariableParent
{
  String n="red";
public void print()
{
	System.out.println(n);
	System.out.println(super.n);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SuperVariableChild obj=new SuperVariableChild ();
		obj.print();
	}

}
