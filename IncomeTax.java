import java.util.*;

class Tax
{
   double income;
   Scanner s=new Scanner(System.in);

   void getIncome(){

   	System.out.println("Enter your gross anunual income");
   	income=s.nextInt();
   }

   void calTax(){
   	double ptax;

   	if(income<=100000){
   		ptax=0;
   	}
   	else if(income>100000 && income<=500000){
   		ptax=1000+(0.1*(income-100000));
   	}
   	else if(income>500000 && income<=800000){
   		ptax=5000+(0.2*(income-500000));
   	}
   	else{
   		ptax=10000+(0.3*(income-800000));
   	}

   	System.out.println("Tax payable by salaried person is "+ptax);
   }
}

class IncomeTax
{
	public static void main(String[] args) {

		Tax t=new Tax();

		t.getIncome();
		t.calTax();
		
	}
}