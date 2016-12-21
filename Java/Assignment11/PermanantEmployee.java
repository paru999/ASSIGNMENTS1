package test;

public class PermanantEmployee  extends employee1
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
		System.out.println("PermanentCode:"+ Getpcode());
		System.out.println("EMPCode:"+ Getecode());
		System.out.println("PhoneNo:"+ Getphn());
		System.out.println("Gender:"+ Getgnr());
		
		
	}
	
	}

	

	
	
	
	
	
	
	

	


