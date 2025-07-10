package monalearn;
import java.util.Scanner;
//checked exception
public class AgeInvalidException extends Exception{

	public AgeInvalidException(String message)
	{
		super(message);
	}

public class ExceptionDemo2 {

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
		
		//try with resource
		try(Scanner sc=new Scanner(System.in))
		{
		demo.checkVotingEligibility(12);
		}
		catch (AgeInvalidException e) {
			System.out.println(e.getMessage());
		}
		
//		finally {
//			try {
//			sc.close();
//			}
//			catch (Exception e) {
//				// TODO: handle exception
//			}
//		}
		
		System.out.println("Thank you!!! Visit again");
	}

}