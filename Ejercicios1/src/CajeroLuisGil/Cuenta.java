package CajeroLuisGil;

public abstract class Cuenta {

	protected String dni, nombre, ncta;
	protected int edad;
	protected double saldo;
	
	protected Cuenta(String dni, String nombre, String ncta, int edad, double saldo) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.ncta = ncta;
		this.edad = edad;
		this.saldo = saldo;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNcta() {
		return ncta;
	}

	public void setNcta(String ncta) {
		this.ncta = ncta;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	// metodos o funciones abstracta
	public abstract double retirarFondos(double cantidad);
	public abstract double ingresarFondos(double cantidad);
	public String toString() {
		
		return "cliente: "+nombre+"\ncuenta: "+ncta+"\nsaldo: "+saldo;
	
	}
	



}
