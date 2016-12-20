package test;

public class customer6 {
	String Name;
	String Addres;
	int Age, PhoneNo;
	customer6(String name,String Addres, int Age, int PhoneNo)
	{
		this.Name=name;
		this.Addres=Addres;
		this.Age=Age;
		this.PhoneNo=PhoneNo;
		
	}
	
	public static void main(String[] args)
	{
		customer6 ass=new customer6("Ammu","Arya Bhavan,Kollam",29,5668877);
		System.out.println("Name:"+ass.Name);
		System.out.println("Addres:"+ass.Addres);
		System.out.println("Age:"+ass.Age);
		System.out.println("PhoneNo:"+ass.PhoneNo);
		System.out.println("          ");
		
		customer6 ass1=new customer6("Ammu","wert House Calicut",35,550088);
		System.out.println("Name:"+ass1.Name);
		System.out.println("Addres:"+ass1.Addres);
		System.out.println("Age:"+ass1.Age);
		System.out.println("PhoneNo:"+ass1.PhoneNo);
		System.out.println("          ");
		
		customer6 ass2=new customer6("Jaya","xyzm house kottayam",30,12345);
		System.out.println("Name:"+ass2.Name);
		System.out.println("Addres:"+ass2.Addres);
		System.out.println("Age:"+ass2.Age);
		System.out.println("PhoneNo:"+ass2.PhoneNo);
		System.out.println("          ");
		
		
		
	}

}
