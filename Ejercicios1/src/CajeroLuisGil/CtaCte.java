package CajeroLuisGil;

public class CtaCte extends Cuenta {
	
	protected double credito;
	protected double interes;
	 
	public CtaCte(String dni, String nombre, String ncta, int edad, double saldo) {
			 
		super(dni, nombre, ncta, edad, saldo);
		credito = 0;
		interes = 0;
	}
	 
	public CtaCte(String dni, String nombre, String ncta, int edad, double saldo,
			double credito, double interes) {
		super(dni, nombre, ncta, edad, saldo);
		this.credito = credito;
		this.interes = interes;
	}

	public double retirarFondos(double cantidad) {
		// TODO Auto-generated method stub	
		if (cantidad<saldo)
			saldo-=cantidad;
		else {
			if(Math.abs(saldo-cantidad)<=credito) {
				saldo-=cantidad;
				saldo=saldo-(saldo*interes/100);
			}
		}
		return saldo;
	}

	public double ingresarFondos(double cantidad) {
		// TODO Auto-generated method stub
		saldo+=cantidad;
		return saldo;
	}   
	public String toString() {
		String res="Cuenta corriente\n";
		res+=super.toString();
		return res;
	}
	

	
	

	}


