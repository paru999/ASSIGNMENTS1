package test;

public class customer8 
{
	String Name;
	String Addres;
	int Age, PhoneNo;
	
	void setName(String Name)
	{
		this.Name=Name;
	}
	String getName()
	{
		
		return this.Name;
	}
	void setAddres(String Addres)
	{
		this.Addres=Addres;
	}
	String getAddres()
	{
		
		return this.Addres;
	}
	
	void setAge(int Age)
	{
		this.Age=Age;
	}
	int getAge()
	{
		
		return Age;
	}
	
	void setPhoneNo(int PhoneNo)
	{
		this.PhoneNo=PhoneNo;
	}
	int getPhoneNo()
	{
		
		return PhoneNo;
	}
	
	
	
	
	public static void main(String[] args) 
	{
		
		customer8 ass=new customer8();
		ass.setName("Sree");
		ass.setAddres("kalpatta House,kollam");
		ass.setAge(25);
		ass.setPhoneNo(8899336);
		
		customer8 ass1=new customer8();
		ass1.setName("Kuttu");
		ass1.setAddres("empol House,TVM");
		ass1.setAge(40);
		ass1.setPhoneNo(12345);
		
		customer8 ass2=new customer8();
		ass2.setName("Sree");
		ass2.setAddres("wxyz House,kattappana");
		ass2.setAge(29);
		ass2.setPhoneNo(380192);
		
		System.out.println("Name:"+ass.getName());
		System.out.println("Addres:"+ass. getAddres());
		System.out.println("Age:"+ass.getAge());
		System.out.println("PhoneNo:"+ass.getPhoneNo());
		System.out.println("                    ");
		
		System.out.println("Name:"+ass1.getName());
		System.out.println("Addres:"+ass1. getAddres());
		System.out.println("Age:"+ass1.getAge());
		System.out.println("PhoneNo:"+ass1.getPhoneNo());
		System.out.println("                    ");
		
		System.out.println("Name:"+ass2.getName());
		System.out.println("Addres:"+ass2. getAddres());
		System.out.println("Age:"+ass2.getAge());
		System.out.println("PhoneNo:"+ass2.getPhoneNo());
		System.out.println("                    ");
	}

}
