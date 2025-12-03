package inheritance;

public class MultipleChild implements MultipleParent1,MultipleParent2
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleChild obj=new MultipleChild();
		obj.print();
		obj.display();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
	System.out.println("to display");	
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("To print");
	}

}
