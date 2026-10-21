package exceptionHandling;

public class ThrowsException {

	public static void main(String[] args) throws VotingAgeException {
		// TODO Auto-generated method stub

		int age=8;
		
		if(age>=18)
		{
			System.out.println("You are eligible");
		}
		else
		{
			throw new VotingAgeException("Invalid");
		}
		
	}

}
