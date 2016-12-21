package test;

public class contractemployee extends employee1
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
	
	public int calculateSalary()
	{
		return(Salary-(PF+Gratuity));
	}
	void disp()
	{
		System.out.println("ContractDuration:"+ ContractDuration);
		System.out.println("PhoneNo:"+ PhoneNo);
		System.out.println("Empcode:"+ Empcode);
		System.out.println("Gender:"+ Gender);
	}
	

}
