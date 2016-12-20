package test;

public class employee3 
{
	String name;
	String designation;
	int salary, PF,Gratuity, age;
	
	void setName(String name)
	{
		this.name=name;
	}
	String getName(){
		
		return this.name;
	}
	void setDesi(String designation)
	{
		this.designation=designation;
	}
	String getdesi(){
		
		return this.designation;
	}
	void setage(int age)
	{
		this.age=age;
	}
	int getage()
	{
		
		return age;
	}
	void setsalary(int salary)
	{
		this.salary=salary;
	}
	int getsalary()
	{
		
		return salary;
	}
	void setPF(int PF)
	{
		this.PF=PF;
	}
	int getPF()
	{
		
		return PF;
	}
	void setgrat(int Gratuity)
	{
		this.Gratuity=Gratuity;
	}
	int Gratuity(){
		
		return Gratuity;
	}
	
	public int calculatesalary()
	{
		return(salary-(PF+Gratuity));
	}
	
	public static void main(String[] args) 
	{
		
		employee3 assg=new employee3();
		assg.setName("Sree");
		assg.setDesi("manger");
		assg.setage(25);
		assg.setsalary(15000);
		assg.setPF(500);
		assg.setgrat(250);
		
	System.out.println("name:"+assg.getName());
	System.out.println("designation:"+assg. getdesi());
	System.out.println("age:"+assg.getage());
	System.out.println("salary:"+assg.getsalary());
	System.out.println("PF:"+assg.getPF());
	System.out.println("Gratuity:"+assg.Gratuity());
	
	System.out.println("TotalSalary:"+assg.calculatesalary());
	}
	
	
	
	
	
	
	
	
	
	
	



















}
