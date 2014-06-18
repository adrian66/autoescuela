package cajero;

public class Persona {
	String nombre;
	String DNI;
	String numTarjeta;
	double dineroSaco;
	double miCartera;

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDNI() {
		return DNI;
	}


	public void setDNI(String dNI) {
		DNI = dNI;
	}


	public String getNumTarjeta() {
		return numTarjeta;
	}


	public void setNumTarjeta(String numTarjeta) {
		this.numTarjeta = numTarjeta;
	}


	public double getDineroSaco() {
		return dineroSaco;
	}


	public void setDineroSaco(double dineroSaco) {
		this.dineroSaco = dineroSaco;
	}


	public double getMiCartera() {
		return miCartera;
	}


	public void setMiCartera(double miCartera) {
		this.miCartera = miCartera;
	}


	public double irCajero( double dineroSaco,Cajero cajero,Persona persona, String numTarjeta){
		dineroSaco= getDineroSaco();
		miCartera = getMiCartera() + dineroSaco;
		System.out.println(persona.getNombre()+" ha sacado "+ dineroSaco +" del cajero "+cajero.getSucursal());		
		System.out.println(persona.getNombre()+ " tu saldo es de "+ getMiCartera());
		return dineroSaco;


	}
}
