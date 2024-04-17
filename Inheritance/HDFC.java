package inheritance_examples;

public class HDFC implements RBI 
{
  @Override
  public void debit()
  {
	  System.out.println("HDFC Money Debit");
  }
  @Override
  public void credit()
  {
	  System.out.println("HDFC Money Credit");
  }
  @Override
  public void moneyTransfer()
  {
	  System.out.println("HDFC Money Transfer");
  }
}
