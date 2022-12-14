package Module_7;
import java.util.*;
public class Record {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int i;
		System.out.println("Enter the daily income of the workers:");
		int totalincome=0;
		try
		{
			for(i=0;;i++)
			{
				int income = Integer.parseInt(sc.next());
				totalincome = totalincome+income;
				if(income == 0)
				{
					System.out.println("Total Daily Income: "+totalincome);
				}
			}
		}
		catch(NumberFormatException e)
		{
			System.out.println("The entered daily income is not a number");
			System.out.println("The entered daily income is not a number");
			System.out.println("Total Daily Income: "+totalincome);
		}
	}
}
