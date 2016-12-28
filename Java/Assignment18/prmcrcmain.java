package test;

public class prmcrcmain extends Insurance
{
	
	public static void main(String[] args)
	{
		
contractemployee cndr= new contractemployee("Mary", "HR Head",24,150,2500,10000);
		

		System.out.println(" Contract  Employee ");
		System.out.println("...................... ");
		cndr.empdisplay();
		//cndr.setcdur(6);
		//cndr.Getcdur();
		//cndr.setemcd(1002);
		//cndr.Getemcd();
		//cndr.setphno(9823672);
		//cndr.Getphno();
		//cndr.setgnr("Female");
		//cndr.Getgnr();
		cndr.setemi(1500);
		cndr.getemi();
		cndr.setecode("C150");
		cndr.getecode();
		cndr.setInsureAmount(3500);
		cndr.GetInsureAmount();
		
		
	cndr.registerInsurance();
		
		if(cndr.TotalEMI==cndr.InsureAmount)
		{
			int insur=cndr.claimInsurance();
			System.out.println(" insureamount:"+insur);
	   }
		else {
			int total=cndr.claimInsurance();
			
			System.out.println("TotalEMI:"+total);
			cndr. PayEMI();
	}
		
		System.out.println("                             ");
		System.out.println(" Permanant Employee ");
		System.out.println("....................");
		
		PermanantEmployee pemp= new PermanantEmployee("Jhon", "Marketing",35, 150,250,15000);
		//pemp.empdisplay();
		//employee1 emp=new employee1("John", "HR", 35, 200, 300, 15000);
		pemp.empdisplay();
		pemp.setecode("B300");
		pemp.setemi(5500);
		pemp.setInsureAmount(3500);
		
		pemp.registerInsurance();
		
		
		if(pemp.TotalEMI==pemp.InsureAmount)
		{
			int insur=pemp.claimInsurance();
			System.out.println(" insureamount:"+insur);
	   }
		else {
			int total=pemp.claimInsurance();
			
			System.out.println("TotalEMI:"+total);
		}
		pemp.PayEmi();
		
	}
	
	int claimInsurance() {
		if(TotalEMI==InsureAmount)
		{
		return InsureAmount;
	   }
		else {
			return TotalEMI;
		}


	}

	@Override
	void registerInsurance() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void payEMI() {
		// TODO Auto-generated method stub
		
	}


}
