package ejercicioClases;

public class Main2 {

	public static void main(String[] args) {
		Persona persona1 = new Persona();
		Persona persona2 = new Persona();
		Persona persona3 = new Persona();
		Persona persona4 = new Persona();
		
		Cajero cajero1 = new Cajero();
		Cajero cajero2 = new Cajero();
		Cajero cajero3 = new Cajero();
		Cajero cajero4 = new Cajero();
		
		persona1.setNombre("Pepe Domingo");
		persona2.setNombre("Sandra Rivas");
		persona3.setNombre("Sergio Ramos");
		persona4.setNombre("Sara Carbonero");
		
		persona1.setDineroSaco(50.00);
		persona2.setDineroSaco(1500.00);
		persona3.setDineroSaco(750.00);
		persona4.setDineroSaco(250.00);
		
		
		cajero1.setSucursal("bankia");
		cajero2.setSucursal("kutxa");
		cajero3.setSucursal("ING Direct");
		cajero4.setSucursal("BBVA");
		

		
		
		cajero1.setDineroCajero(2500.00);
		cajero2.setDineroCajero(1500.00);
		cajero3.setDineroCajero(1750.00);
		cajero4.setDineroCajero(3500.00);
		
		persona1.irCajero(persona1.getDineroSaco(), cajero1, persona1, "145658" );
		persona2.irCajero(persona2.getDineroSaco(), cajero2, persona2,"6789645");
		persona3.irCajero(persona3.getDineroSaco(), cajero3, persona3,"318676");
		persona4.irCajero(persona4.getDineroSaco(), cajero4, persona4, "34587324");
		System.out.println();
		persona1.setDineroSaco(100.00);
		persona1.irCajero(persona1.getDineroSaco(), cajero1, persona1, "145658" );
		
		System.out.println();
		cajero1.sacaDinero(persona1.getDineroSaco(),persona1, cajero1);
		cajero1.sacaDinero(persona1.getDineroSaco(),persona2, cajero1);
		cajero1.sacaDinero(persona1.getDineroSaco(),persona3, cajero1);
		cajero1.sacaDinero(persona1.getDineroSaco(),persona4, cajero1);
		
		
		
	}

}
