package Module_7;
import java.io.*;
public class CustomExceptionMain {
	public static void main(String args[])throws IOException
	{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.println("Enter the age:");
		int age = Integer.parseInt(br.readLine());
		CustomException obj = new CustomException();
		try
		{
			obj.validate(age);
		}
		catch(InvalidAgeException e)
		{
			System.out.println("Caught the Exception");
			System.out.println("Exception Occured: "+e);
		}
	}
}
