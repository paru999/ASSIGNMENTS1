package test;

public class prmcrcmain {
	
	
	
	public static void main(String[] args)
	{
		
contractemployee cndr= new contractemployee("Mary", "HR Head",24,150,2500,10000);
		
		cndr.empdisplay();
		cndr.setcdur(6);
		cndr.Getcdur();
		cndr.setemcd(1002);
		cndr.Getemcd();
		cndr.setphno(9823672);
		cndr.Getphno();
		cndr.setgnr("Female");
		cndr.Getgnr();
		cndr.disp();
		
		PermanantEmployee pemp= new PermanantEmployee("Jhon", "Marketing",35, 150,250,15000);
		pemp.empdisplay();
		
		

	}

}
