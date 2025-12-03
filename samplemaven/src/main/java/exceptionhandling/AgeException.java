package exceptionhandling;

public class AgeException {

	public static void main(String[] args) throws AgeExceptions
	{
		// TODO Auto-generated method stub
		int age=10;
		if(age>18)
		{
			System.out.println("You are  eligible");
		}
		else
			{
			//System.out.println("you are not eligible");
			throw new AgeExceptions("You are not eligible");
			}
	}

}
