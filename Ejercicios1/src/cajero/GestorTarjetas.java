package cajero;

public class GestorTarjetas{

	Tarjeta[] tarjetas;
	
	public GestorTarjetas {   // constructor
	
		inicCasosPrueba();
	}	
	
	public boolean tarjeta(Persona persona, Tarjeta tarjeta) {
		if (tarjeta.getNumeT()== persona.getNumTarjeta() && tarjeta.getActiva() == true)
		
		return true;

		else return false;

		
		private void inicCasosPrueba() {
			Tarjeta t= new Tarjeta("12345678A","5555",true);
			tarjetas[0]= t;
			Tarjetas t= new Tarjeta("99999998A","6666",true);
			tarjetas[1]= t;
			Tarjetas t= new Tarjeta("11111111C","7777",True);
			tarjetas[2= t;
			Tarjetas t= new Tarjeta("99999997D","4444",False;
			tarjetas[3= t;
		
			
		}
		

}

}
