package test;


public class employee1
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
		System.out.println("designation:"+designation);
		System.out.println("age:"+age);
		System.out.println("TotalSalary:"+calculateSalary());
}
}




	 

