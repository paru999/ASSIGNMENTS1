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
	void disp()
	{
		//System.out.println("PermanentCode:"+ Getpcode());
		//System.out.println("EMPCode:"+ Getecode());
		//System.out.println("PhoneNo:"+ Getphn());
		//System.out.println("Gender:"+ Getgnr());
		
		
	}
	@Override
	public void seasonOffer(int totalPurchaseAmount) 
	{
		totalPurchaseAmount=totalPurchaseAmount*25/100;
		System.out.println("25% of purchase:"+totalPurchaseAmount);
		
	}
	@Override
	public void regularoffer(int amount)
	{
		amount=amount*10/100;
		System.out.println("10% of purchase:"+amount);
		
	}
	
	}

	

	
	
	
	
	
	
	

	


