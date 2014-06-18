package controlaErrores;


public abstract class AlumnoAutoEscuela {

	public static void main(String[] arg) {
		
		AutoEscuela f = new AutoEscuela("Juanjo", "65557F", 65);
		
		 
			}
	
	



		// metodos o funciones abstracta
	public abstract double AutoEscuela(int edad) throws Exception;
	
	
	If (edad<18 || edad>64) {
		throw new Exception("la edad " + edad+ "no es apta para inscribirse");
	}	
		
	
	
	}
	



}
