package test;


public class employee1 {
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
	 public static void main(String args[])
	 {
		employee1 ass=new employee1("Ammu","Manager",25,2500,5000,400000);
		System.out.println("name:"+ass.name);
		System.out.println("designation:"+ass.designation);
		System.out.println("age:"+ass.age);
		System.out.println("TotalSalary:"+ass.calculateSalary());
}
}




	 

