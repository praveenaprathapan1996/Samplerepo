package exceptionhandling;

public class Example 

{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=20;
int b=0;
try
{
int c=a/b;
}
catch(ArithmeticException d)
{
	b=2;
	int e=a/b;
	System.out.println(e);
	System.out.println(d);
}

finally
{
	System.out.println("Mandatory statements");
}
	}

}
