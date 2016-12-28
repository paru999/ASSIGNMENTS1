package test;


public class employee1  extends insumain  
{
	String name;
	String designation;
	int age,PF,Gratuity,Salary;
	employee1(String name,String designation,int age,int PF,int Gratuity,int Salary)
	{
		this.name=name;
		this.designation=designation;
		this.age=age;
		this.PF=PF;
		this.Gratuity=Gratuity;
		this.Salary=Salary;
		
	}
	
public int calculateSalary()
	{
		return(Salary-(PF+Gratuity));
	}


	void empdisplay()
	 {
		
		
		
		System.out.println("name:"+name);
		//System.out.println("designation:"+designation);
		//System.out.println("age:"+age);
		
		//System.out.println("calculateSalary:"+calculateSalary());
}
	
	void registerInsurance() 
	{
		String empcode="E100";
		InsuranceNo="INS_"+getecode()+"670";
		int InsureAmount=5000;
	System.out.println("InsuranceNo:"+InsuranceNo);
		System.out.println("insureAmount:"+GetInsureAmount());
		
	}


	void payEMI() {
		System.out.println("EMI:"+getemi());
		
	}
		
	int claimInsurance() {
		if(TotalEMI==InsureAmount)
		{
		return InsureAmount;
	   }
		else {
			return TotalEMI;
		}


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
		
	public static void main(String[] args) {

		employee1 emp=new employee1("John", "HR", 35, 200, 300, 15000);
		emp.empdisplay();
		emp.setecode("B300");
		emp.setemi(85000);
		emp.payEMI();
		emp.setInsureAmount(3500);
		emp.registerInsurance();
		if(emp.TotalEMI==emp.InsureAmount)
		{
			int insur=emp.claimInsurance();
			System.out.println(" insureamount:"+insur);
	   }
		else {
			int total=emp.claimInsurance();
			
			System.out.println("TotalEMI:"+total);
		}
	}
			
	}
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	




	 

