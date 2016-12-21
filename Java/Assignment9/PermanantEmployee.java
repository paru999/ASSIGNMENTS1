package test;

public class PermanantEmployee  extends employee1
{
	public  PermanantEmployee(String Name, String Designation, int Age, int PF, int Gratuity, int Salary)
		{
		super (Name, Designation, Age, PF, Gratuity, Salary);
		
	      }
	int PermanantCode;
	public void setpcode(int pcode)
	{
		this.PermanantCode=pcode;
	}
	public int Getpcode()
	{
		return  PermanantCode;
	}
	void disp()
	{
		System.out.println("PermanentCode:"+ PermanantCode);
		
	}
	

	}
	
	
	
	
	
	

	


