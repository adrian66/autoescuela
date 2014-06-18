package curso.oop.figuras;


public class Circulo {

	int x;
	int y;
	double radio;
	
	public Circulo () {
		x=0;
		y=0;
		radio=0;
	}
	public Circulo(int x, int y, double radio) {
	this.x = x;
	this.y = y;
	this.radio = radio;
	}
	

	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public double getRadio() {
		return radio;
	}
	public void setRadio(double radio) {
		this.radio = radio;
	}
	public void estado() {
	}
	// perimetro
	
	public double perimetro() {
		return (2*Math.PI*radio);
	}
	// Circunferencia
	public double circunfe() {
		return (Math.PI*radio*radio);	
	}

}


