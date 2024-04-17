package inheritance_examples;

public class Abstraction_Demo 
{
	public static void main(String []args)
	{
		ICICI i=new ICICI();
		i.credit();
		i.debit();
		i.moneyTransfer();
		i.homeLoan();
		HDFC h=new HDFC();
		h.credit();
		h.debit();
		h.moneyTransfer();
	}
	

}
