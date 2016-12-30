package test;

public class contractemployee extends employee1 implements promotionalOffers14
{
	public  contractemployee(String Name, String Designation, int Age, int PF, int Gratuity, int Salary)
	{
		
		super (Name, Designation, Age, PF, Gratuity, Salary);
	}
	
	int ContractDuration;
	public void setcdur(int cdur)
	{
		this.ContractDuration=cdur;
	}
	public int Getcdur()
	{
		return  ContractDuration;
	}
	
	int PhoneNo;
	public void setphno(int phno)
	{
		this.PhoneNo=phno;
	}
	public int Getphno()
	{
		return  PhoneNo;
	}
	
	int Empcode;
	public void setemcd(int emcd)
	{
		this.Empcode=emcd;
	}
	public int Getemcd()
	{
		return  Empcode;
	}
	
	String Gender;
	public void setgnr(String gnr)
	{
		this.Gender=gnr;
	}
	public String Getgnr()
	{
		return  Gender;
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
	String getecode() {
		
		
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
		InsuranceNo="INS_"+getecode()+"670";
		int InsureAmount=5000;
	System.out.println("InsuranceNo:"+InsuranceNo);
		System.out.println("insureAmount:"+GetInsureAmount());
		
	}
	void PayEMI()
	{
		int emi;
		emi= GetInsureAmount()*8/100;
		int PayEMI=emi+getemi();
		System.out.println("PayEMI:"+PayEMI);
		
	}
	
	
	
	
	
	
	
	public int calculateSalary()
	{
		return(Salary-(PF+Gratuity));
	}
	void disp()
	{
		//System.out.println("ContractDuration:"+ ContractDuration);
		//System.out.println("PhoneNo:"+ PhoneNo);
		//System.out.println("Empcode:"+ Empcode);
		//System.out.println("Gender:"+ Gender);
		
		
	}
	@Override
	public int seasonOffer(int totalPurchaseAmount)
	{
		return totalPurchaseAmount;

		//totalPurchaseAmount=totalPurchaseAmount-totalPurchaseAmount*15/100;
		//System.out.println("15% of purchase:"+totalPurchaseAmount);
		
		
	}
	@Override
	public int regularoffer(int amount) 
	{
		return amount;
		//amount=amount-amount*8/100;
		//System.out.println("8% of purchase:"+amount);
		
	}
	
	
	
}
