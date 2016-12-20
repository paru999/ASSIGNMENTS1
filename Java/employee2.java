package test;

public class employee2 {
	String name;
	String designation;
	int salary, PF,Gratuity, age;
	employee2 (String name,String designation,int salary,int PF,int Gratuity,int age)
	{
		this.name=name;
		this.designation=designation;
		this.salary=salary;
		this.PF=PF;
		this.Gratuity=Gratuity;
		this.age=age;
		
	}
	public int calculatesalary()
	{
		return(salary-(PF+Gratuity));
	}
	

	public static void main(String[] args) 
		{
			employee1 ass=new employee1("Ammu","Manager",25,2500,5000,400000);
			employee1 ass1=new employee1("appu","Clark",35,250,500,50000);
			employee1 ass2=new employee1("achu","pl",50,100,100,6000);
			
			System.out.println("name:"+ass.name);
			System.out.println("designation:"+ass.designation);
			System.out.println("age:"+ass.age);
			System.out.println("TotalSalary:"+ass.calculateSalary());
			
			System.out.println("           ");
			
			System.out.println("name:"+ass1.name);
			System.out.println("designation:"+ass1.designation);
			System.out.println("age:"+ass1.age);
			System.out.println("TotalSalary:"+ass1.calculateSalary());
			
			System.out.println("              ");
			
			System.out.println("name:"+ass2.name);
			System.out.println("designation:"+ass2.designation);
			System.out.println("age:"+ass2.age);
			System.out.println("TotalSalary:"+ass2.calculateSalary());

	}
	
	
}
