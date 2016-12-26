package test;

public class insumain  extends Insurance 
{
	
	void registerInsurance()
	{
		
		System.out.println("InsuranceNo: "+InsuranceNo);
		System.out.println("InsureAmount: "+InsureAmount);
	}

	
	void payEMI() 
	{
		System.out.println("TotalEMI:"+TotalEMI);
		
	}

	int claimInsurance()
	{
		if(TotalEMI==InsureAmount)
		{
			return  InsureAmount;
		}
		else
		{
			return TotalEMI;
		}
	}

public static void main(String[] args)
{
	insumain ins=new insumain();
	
	ins.registerInsurance();
	ins.payEMI();
	
	if(ins.TotalEMI==ins.InsureAmount)
	{
		
		int insur=ins.claimInsurance();
		System.out.println(" InsureAmount:"+insur);
		
	}
	else
	{
		int total=ins.claimInsurance();
		
		System.out.println("TotalEMI:"+total);
	}
	
}
}
	


