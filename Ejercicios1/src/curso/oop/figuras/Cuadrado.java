package curso.oop.figuras;

public class Cuadrado {
	int lado;
	//   cuadrado con constructor
	
		
	public Cuadrado (int lado) {
		this.lado = lado;
	}
	// area
	
		public double area() {
			return (lado * lado);
		}
		// Perimetro
		public double perimetro() {
			return (lado * 4);	
}
}

