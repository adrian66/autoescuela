package CajeroLuisGil;


import CajeroLuisGil.CtaAhorro;
import CajeroLuisGil.CtaCte;

public class MainCuentas {

	public static void main(String[] arg) {
				
		Cuenta[] cta=new Cuenta[4];
		
		cta[0]=new CtaCte("1234", "JOSE PEREZ", "0000000546", 23, 500);
		cta[1]=new CtaCte("1433", "JORGE PERA", "0000001345", 25,  700, 500, 4);
		cta[2]=new CtaAhorro("3334", "JOSE PERDON", "0000013335", 31, 3000, 5, 7);
		cta[3]=new CtaAhorro("6555", "JOSE LINEZ", "0000100164", 35, 3000.7, 4);
		
		
	//	detalles();
		
		for (int i=0; i<4; i++);
//		System.out.println(f.detalles());
		
	//	Figura f = new CtaCte(6, 8);
	//	Figura ff = new CtaAhorro(3);
		
		
		 
	
	//	System.out.println(f.area());
	//	System.out.println(f.perimetro());
	}
	
	
}
