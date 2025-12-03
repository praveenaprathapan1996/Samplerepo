package exceptionhandling;

public class CustomException {

	public static void main(String[] args) throws VotingException {
		// TODO Auto-generated method stub
		int age=10;
		if(age>18)
		{
			System.out.println("You are  eligible");
		}
		else
			{
			//System.out.println("you are not eligible");
			throw new VotingException("You are not eligible");
			}
			}
	}


