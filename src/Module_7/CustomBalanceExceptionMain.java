package Module_7;
import java.io.*;
public class CustomBalanceExceptionMain {
	public static void main(String args[])throws IOException
	{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.println("Enter the bank account number: ");
		long account = Long.parseLong(br.readLine());
		System.out.println("Enter the available balance in account: ");
		double availablebalance = Double.parseDouble(br.readLine());
		System.out.println("Enter the withdraw amount: ");
		double withdrawamount = Double.parseDouble(br.readLine());
		CustomBalanceException obj = new CustomBalanceException();
		System.out.println("The account number is: "+account);
		try
		{
			obj.validate(withdrawamount, availablebalance);
		}
		catch(InvalidBalanceException e)
		{
			System.out.println("Exception Occured"+e);
		}
	}
}
