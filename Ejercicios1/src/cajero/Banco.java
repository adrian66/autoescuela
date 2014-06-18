package cajero;

public class Banco{
public double dineroCajero;
String sucursal;  

public double getDineroCajero() {
	return dineroCajero;
}

public void setDineroCajero(double dineroCajero) {
	this.dineroCajero = dineroCajero;
}

public String getSucursal() {
	return sucursal;
}

public void setSucursal(String sucursal) {
	this.sucursal = sucursal;
}

public void sacaDinero(double dineroSaco, Persona persona,Cajero cajero){
	dineroSaco = persona.getDineroSaco(); 
if (cajero.getDineroCajero() > dineroSaco){
	//double d = persona.irCajero(persona.getDineroSaco(), cajero, persona, persona.getNumTarjeta());
	dineroCajero = cajero.getDineroCajero() - dineroSaco;
	System.out.println(persona.getNombre()+" ha sacado un total de "+ dineroSaco +" en la sucursal "+ cajero.getSucursal());
	System.out.println("Dinero cajero "+ cajero.getSucursal() + " : "+ cajero.getDineroCajero());
}
else{
	
	System.out.println("Señor "+ persona.getNombre() +" Lo sentimos, cajero no disponible, pruebe en otro");
}
}
}
