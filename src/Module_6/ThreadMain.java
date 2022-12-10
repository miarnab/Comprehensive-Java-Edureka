package Module_6;

import java.util.*;
public class ThreadMain {
	public static void main(String args[])
	{
		System.out.println("1. Account Opening\n2. Account Details\n3. Quick Deposit\n4. Quick Withdrawl\n5. Fund Transfer\n");
		System.out.println("Enter your choice:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n == 1)
		{
			Thread T1 = new Thread(new AccountThread());
			T1.start();
		}
		else if(n == 2)
		{
			Thread T2 = new Thread(new DetailsThread());
			T2.start();
		}
		else if(n == 3)
		{
			Thread T3 = new Thread(new DepositThread());
			T3.start();
		}
		else if(n == 4)
		{
			Thread T4 = new Thread(new WithdrawThread());
			T4.start();
		}
		else if(n == 5)
		{
			Thread T5 = new Thread(new FundTransferThread());
			T5.start();
		}
		System.out.println("Thank You");
		
	}
}
