package abstraction;

public class Child extends Parent{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Child obj=new  Child();
		 obj.get();
		 obj.display();
		 obj.show();
	}

	@Override
	public void get() {
		// TODO Auto-generated method stub
		System.out.println("welcome");
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("thanku ");
	}

}
