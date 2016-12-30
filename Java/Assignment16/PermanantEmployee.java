package test;

public class PermanantEmployee  extends employee1  implements promotionalOffers14
{
	public  PermanantEmployee(String Name, String Designation, int Age, int PF, int Gratuity, int Salary)
		{
		super (Name, Designation, Age, PF, Gratuity, Salary);
		
	      }
	String PermanantCode;
	public void setpcode(String pcode)
	{
		this.PermanantCode=pcode;
	}
	public String Getpcode()
	{
		return  PermanantCode;
	}
	
	int EMPCode;
	public void setecode(int ecode)
	{
		this.EMPCode=ecode;
	}
	public int Getecode()
	{
		return  EMPCode;
	}
	
	int PhoneNo;
	public void setphn(int phn)
	{
		this.PhoneNo=phn;
	}
	public int Getphn()
	{
		return  PhoneNo;
	}
	
	String Gender;
	public void setgnr(String gnr)
	{
		this. Gender=gnr;
	}
	public String Getgnr()
	{
		return   Gender;
	}
	
	
	public void setInsureAmount(int InsureAmount)
	{
		this.InsureAmount=InsureAmount;
	}
	public int GetInsureAmount()
	{
		return InsureAmount;
	}
	String EmpCode;
	public void setecode(String EmpCode)
	{
		this.EmpCode=EmpCode;
	}
	private String getecode() {
		
		// TODO Auto-generated method stub
		return  EmpCode;
	}
	public void setemi(int totalEMI)
	{
		this.TotalEMI=totalEMI;
		
	}
	public int getemi()
	{
		return TotalEMI;
	}
	
	void registerInsurance() 
	{
		String empcode="E100";
		InsuranceNo="INS_"+getecode()+"870";
		int InsureAmount=5000;
	System.out.println("InsuranceNo:"+InsuranceNo);
		System.out.println("insureAmount:"+GetInsureAmount());
		
	}
	void PayEmi()
	{
		int emi;
		emi=GetInsureAmount()*5/100;
		int PayEMI=emi+getemi();
		System.out.println("PayEMI:"+PayEMI);
		
	}
	
	
	
	
	
	
	
	void disp()
	{
		System.out.println("PermanentCode:"+ Getpcode());
		System.out.println("EMPCode:"+ Getecode());
		System.out.println("PhoneNo:"+ Getphn());
		System.out.println("Gender:"+ Getgnr());
		
		
	}
	@Override
	public int seasonOffer(int totalPurchaseAmount) 
	{
		return totalPurchaseAmount;
		//totalPurchaseAmount=totalPurchaseAmount-totalPurchaseAmount*25/100;
		//System.out.println("25% of purchase:"+totalPurchaseAmount);
		
	}
	@Override
	public int regularoffer(int amount)
	{
		//amount=amount-amount*10/100;
		//System.out.println("10% of purchase:"+amount);
		return amount;
		
	}
	
}

	

	
	
	
	
	
	
	

	


