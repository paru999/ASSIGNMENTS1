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
	public int calculateSalary()
	{
		return(Salary-(PF+Gratuity));
	}
	void disp()
	{
		System.out.println("ContractDuration:"+ ContractDuration);
		
	}
	

}
