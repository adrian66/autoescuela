package controlaErrores;

public abstract class AutoEscuela {
	
	protected String nombre, dni;
	protected int edad;
	public AutoEscuela(String nombre, String dni, int edad) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public AutoEscuela(int edad) {
		super();
		this.edad = edad;
	}
	    
}
