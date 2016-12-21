package test;

public class employee9 
{
	

	public employee9(String name, String designation, int age, int pF,
			int gratuity, int salary) 
	{
		
	}
		
	public static void main(String[] args)
	{
		PermanantEmployee pemp= new PermanantEmployee("Arnav", "Marketing",50,750,1500,25000);
		
		pemp.setpcode(2053);
		pemp.disp();
		pemp.empdisplay();
		
		

	}


}
