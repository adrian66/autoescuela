package GeometriaAbstraccion;

public class Rectangulo extends Figura {

	private int ancho, alto;
	
	
	public int getAncho() {
		return ancho;
	}


	public void setAncho(int ancho) {
		this.ancho = ancho;
	}


	public int getAlto() {
		return alto;
	}


	public void setAlto(int alto) {
		this.alto = alto;
	}


	public Rectangulo(int ancho, int alto) {
				this.ancho = ancho;
		this.alto = alto;
	}


	public double area() {
		
		return ancho*alto;
	}
	
	public double perimetro() {
	
		return 2*ancho+2*alto;
	}
	
}
