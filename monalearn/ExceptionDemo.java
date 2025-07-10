package monalearn;
public class ExceptionDemo {
    //unchecked exception
	public class AgeInvalidException extends RuntimeException{

	public AgeInvalidException(String message)
	{
		super(message);
	}
}

	public void checkVotingEligibility(int age) throws AgeInvalidException
	{
		if(age<18)//12<18
		{
			throw new AgeInvalidException("Your age is not valid for Vote");
		}
		
		else
			System.out.println("You are eligible for vote");
	}
	
	public static void main(String[] args) {
		
		ExceptionDemo demo=new ExceptionDemo();
		
		try {
		demo.checkVotingEligibility(12);
		}
		catch (AgeInvalidException ex) {
			//System.out.println(ex);//package name,class name and message
			System.out.println(ex.getMessage());
			//ex.printStackTrace();
		}
		
		System.out.println("Thank you!!! Visit again");
	}

}
