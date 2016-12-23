package test;

public class permain 
{
	

	public permain(String name, String designation, int age, int pF,
			int gratuity, int salary) 
	{
		
	}
		
	public static void main(String[] args)
	{
		PermanantEmployee pemp= new PermanantEmployee("Jhon", "Marketing",35, 150,250,15000);
		
		//pemp.setpcode("PM100");
		//pemp.setecode(1001);
		//pemp.setphn(98967623);
		//pemp.setgnr("Male");
		//pemp.disp();
		pemp.seasonOffer(2500);
		pemp.regularoffer(2500);
		pemp.empdisplay();
		
		

	}


}
