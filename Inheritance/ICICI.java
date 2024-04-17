package inheritance_examples;

public class ICICI implements RBI
{
	@Override
	public void debit()
	{
  System.out.println("ICICI Money Debit");
	}

@Override
	public void credit()
	{
		System.out.println("ICICI Money Credited");
	}
@Override
public void moneyTransfer()
{
	System.out.println("ICICI Money Transfer");
}
public void homeLoan()
{
	System.out.println("WE also provide home loans");
}
}


