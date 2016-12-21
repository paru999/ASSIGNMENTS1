package test;

public class employee10 {
	
	 employee10(String name, String designation, int age, int pF, int gratuity, int salary ) 
	 {
		
	}

	public static void main(String[] args)
	{
		contractemployee cndr= new contractemployee("Sam", "HR Head",30,150,2500,35000);
		
		cndr.setcdur(3);
		cndr.Getcdur();
		cndr.disp();
		cndr.empdisplay();

	}

}
