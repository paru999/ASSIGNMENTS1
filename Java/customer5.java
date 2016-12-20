package test;

public class customer5 {
	String Name;
	String Addres;
	int Age, PhoneNo;
	customer5(String name,String Addres, int Age, int PhoneNo)
	{
		this.Name=name;
		this.Addres=Addres;
		this.Age=Age;
		this.PhoneNo=PhoneNo;
		
	}
	

	public static void main(String[] args) 
	{
		customer5 ass=new customer5("Ammu","Arya Bhavan,Kollam",29,5668877);
		System.out.println("Name:"+ass.Name);
		System.out.println("Addres:"+ass.Addres);
		System.out.println("Age:"+ass.Age);
		System.out.println("PhoneNo:"+ass.PhoneNo);
		System.out.println("          ");

	}

}
