package Module_7;

public class CustomBalanceException {
	void validate(double withdrawamount,double availablebalance)throws InvalidBalanceException
	{
		if(withdrawamount>availablebalance)
		{
			throw new InvalidBalanceException("Balance Insufficient for this transaction");
		}
		else
		{
			System.out.println("Transaction Successful");
		}
	}
}

