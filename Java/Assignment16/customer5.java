package test;

public class customer5 implements promotionalOffers14 
{
	String Name;
	String Addres;
	int Age, PhoneNo;
		
	customer5(String name,String Addres, int Age, int PhoneNo)
	
		{
		this.Name=name;
		this.Addres=Addres;
		this.Age=Age;
		this.PhoneNo=PhoneNo;
		}
	

	public static void main(String[] args) 
	{
		customer5 ass=new customer5("Ammu","Arya Bhavan,Kollam",29,5668877);
		System.out.println("Customer Details");
		System.out.println("                      ");
		System.out.println("Name:"+ass.Name);
		System.out.println("Addres:"+ass.Addres);
		//System.out.println("Age:"+ass.Age);
		System.out.println("PhoneNo:"+ass.PhoneNo);
		//System.out.println("          ");
		
		
		int TotalPurchaseAmount=ass.SeasonOffer(2500);
		int amount=ass.regularOffer(2500);	
		
		
		
		
		if(TotalPurchaseAmount>=2500&&amount>=2500)
		{
			int A=TotalPurchaseAmount*10/100;
			
			int Total=TotalPurchaseAmount-A;
			System.out.println("TotalPurchaseAmount:"+Total);
			 int B=amount*0/100;
			int Totalamount=amount-B;
			System.out.println("Amount :"+Totalamount);
			int  payEmi= 0;
			payEmi=Totalamount-Total;
			System.out.println("Amount to be paid:"+payEmi);
		}
		
		
		
		
		
		
	}
	
	
	private int SeasonOffer(int TotalPurchaseAmount) {
		//totalPurchaseAmount=totalPurchaseAmount-totalPurchaseAmount*10/100;
				//System.out.println("10% of purchase:"+totalPurchaseAmount);
		// TODO Auto-generated method stub
		return TotalPurchaseAmount;
	}


	private int regularOffer(int Amount) {
		//amount=amount-amount*0/100;
				//System.out.println("0% of purchase:"+amount);
		
		return Amount;
	}


	@Override
	public int seasonOffer(int amount) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public int regularoffer(int amount) {
		// TODO Auto-generated method stub
		return 0;
	}


	


	


}
