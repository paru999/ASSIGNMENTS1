package test;

public class permain 
{
	

	public permain(String name, String designation, int age, int pF,
			int gratuity, int salary) 
	{
		
	}
		
	public static void main(String[] args)
	{
		PermanantEmployee pemp= new PermanantEmployee("Jhon", "Marketing",35, 150,250,15000);
		
		//pemp.setpcode("PM100");
		//pemp.setecode(1001);
		pemp.setphn(98967623);
		pemp.setgnr("Male");
		pemp.disp();
		int TotalPurchaseAmount=pemp.seasonOffer(2500);
		int amount=pemp.regularoffer(2500);	
		
		
		if(TotalPurchaseAmount>=2500&&amount>=2500)
		{
			int A=TotalPurchaseAmount*25/100;
			
			int Total=TotalPurchaseAmount-A;
			System.out.println("TotalPurchaseAmount:"+Total);
			 int B=amount*10/100;
			int Totalamount=amount-B;
			System.out.println("Amount :"+Totalamount);
			int  payEmi= 0;
			payEmi=Totalamount-Total;
			System.out.println("Amount to be paid:"+payEmi);
		}
		//pemp.empdisplay();
		
		

	}


}
