package Module_7;

public class CustomException {
	void validate(int age)throws InvalidAgeException
	{
		if(age<18)
		{
			throw new InvalidAgeException("You are not eligible to vote");
		}
		else
		{
			System.out.println("You are eligible to vote");
		}
	}
}
