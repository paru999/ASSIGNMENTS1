package test;

public class employee4 {
	
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
		employee4 ass=new employee4();
		ass.setName("Sree");
		ass.setDesi("manger");
		ass.setage(25);
		ass.setsalary(15000);
		ass.setPF(500);
		ass.setgrat(250);
	
	
		employee4 ass1=new employee4();
		ass1.setName("Appu");
		ass1.setDesi("xyz");
		ass1.setage(29);
		ass1.setsalary(19000);
		ass1.setPF(600);
		ass1.setgrat(550);
		
		
		employee4 ass2=new employee4();
		ass2.setName("Ammu");
		ass2.setDesi("stwx");
		ass2.setage(35);
		ass2.setsalary(25000);
		ass2.setPF(1000);
		ass2.setgrat(1050);
	
	
	System.out.println("name:"+ass.getName());
	System.out.println("designation:"+ass. getdesi());
	System.out.println("age:"+ass.getage());
	System.out.println("salary:"+ass.getsalary());
	System.out.println("PF:"+ass.getPF());
	System.out.println("Gratuity:"+ass.Gratuity());
	System.out.println("TotalSalary:"+ass.calculatesalary());
	
	System.out.println("                                   ");
	
	System.out.println("name:"+ass1.getName());
	System.out.println("designation:"+ass1. getdesi());
	System.out.println("age:"+ass1.getage());
	System.out.println("salary:"+ass1.getsalary());
	System.out.println("PF:"+ass1.getPF());
	System.out.println("Gratuity:"+ass1.Gratuity());
	System.out.println("TotalSalary:"+ass1.calculatesalary());
	
	System.out.println("                                 ");
	
	System.out.println("name:"+ass2.getName());
	System.out.println("designation:"+ass2. getdesi());
	System.out.println("age:"+ass2.getage());
	System.out.println("salary:"+ass2.getsalary());
	System.out.println("PF:"+ass2.getPF());
	System.out.println("Gratuity:"+ass2.Gratuity());
	
	System.out.println("TotalSalary:"+ass2.calculatesalary());
	}
}






















