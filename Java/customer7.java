package test;

public class customer7
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
		
		customer7 ass=new customer7();
		ass.setName("Jonson");
		ass.setAddres("kalpatta House,kollam");
		ass.setAge(80);
		ass.setPhoneNo(225599);
		
		System.out.println("Name:"+ass.getName());
		System.out.println("Addres:"+ass. getAddres());
		System.out.println("Age:"+ass.getAge());
		System.out.println("PhoneNo:"+ass.getPhoneNo());
	}

}
