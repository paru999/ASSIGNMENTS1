package test;

public class cnsmain  
{
	
	 cnsmain(String name, String designation, int age, int pF, int gratuity, int salary ) 
	 {
		
	}

	public static void main(String[] args)
	{
		contractemployee cndr= new contractemployee("Mary", "HR Head",24,150,2500,10000);
		
		cndr.empdisplay();
		//cndr.setcdur(6);
		//cndr.Getcdur();
		//cndr.setemcd(1002);
		//cndr.Getemcd();
		//cndr.setphno(9823672);
		//cndr.Getphno();
		//cndr.setgnr("Female");
		//cndr.Getgnr();
		int TotalPurchaseAmount=cndr.seasonOffer(2500);
		int amount=cndr.regularoffer(2500);	
		
		
		if(TotalPurchaseAmount>=2500&&amount>=2500)
		{
			int A=TotalPurchaseAmount*15/100;
			
			int Total=TotalPurchaseAmount-A;
			System.out.println("TotalPurchaseAmount:"+Total);
			 int B=amount*8/100;
			int Totalamount=amount-B;
			System.out.println("Amount :"+Totalamount);
			int  payEmi= 0;
			payEmi=Totalamount-Total;
			System.out.println("Amount to be paid:"+payEmi);
		}
		
		
		cndr.disp();
		

	}

	

}
